

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;


import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;


public class Main {

    static final String baseUri2 = "http://0.0.0.0:"+(System.getenv("PORT")!=null?Integer.valueOf(System.getenv("PORT")):"8081") + "/";

    public static void main(String[] args) throws IOException {


        System.out.println("Starting grizzly...");
        
        startGrizzlyServer();
        
        System.out.println(String.format("Jersey started with WADL available at %sapplication.wadl.", baseUri2, baseUri2));

        while (true) {
            System.in.read();
        }
    }

    private static HttpServer startGrizzlyServer() throws IOException {
        ResourceConfig rec = new ResourceConfig().packages("resources");
        return GrizzlyHttpServerFactory.createHttpServer(getURI(), rec);
    }

    private static URI getURI() {
        return URI.create(baseUri2);
      //  return UriBuilder.fromUri(baseUri2).port(System.getenv("PORT") != null ? Integer.valueOf(System.getenv("PORT")) : 9998).build();
    }

}
