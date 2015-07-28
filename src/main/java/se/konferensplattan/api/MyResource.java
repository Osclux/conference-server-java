package se.konferensplattan.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "api/" path)
 */
@Path("/")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "json" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "/session for data on all sessions, /session/<sessionId> for specific session data";
    }

    @GET
    @Path("session")
    @Produces(MediaType.APPLICATION_JSON)
    public AllActiveSessionsResponse allSessions() {
        return new AllActiveSessionsResponse(SessionService.allActiveSessions());
    }
}
