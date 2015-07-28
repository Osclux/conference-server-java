package se.konferensplattan.api;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class ApiApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        System.out.println("!!!!!!!!!! hello !!!!!!");

        HashSet<Class<?>> set = new HashSet<Class<?>>(2);
        set.add(MOXyJsonProvider.class);
        set.add(MyResource.class);
        return set;
    }
}
