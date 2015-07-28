package se.konferensplattan.api;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * TODO: Describe purpose
 */
@XmlRootElement
public class AllActiveSessionsResponse {

    private final List<ActiveSession> list;

    public AllActiveSessionsResponse(List<ActiveSession> list) {
        this.list = list;
    }
}
