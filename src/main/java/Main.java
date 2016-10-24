
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import com.sun.grizzly.http.SelectorThread;
import com.sun.jersey.api.container.grizzly.GrizzlyWebContainerFactory;
//import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
//import org.glassfish.jersey.server.ResourceConfig;
//import com.sun.jersey.api.core.ResourceConfig;

public class Main {
   // System.getenv("PORT")
//    static final String baseUri2 = "http://localhost:"+(System.getenv("PORT")!=null?Integer.valueOf(System.getenv("PORT")):"9998");
    
    public static void main(String[] args) throws IOException {
        final String baseUri = "http://0.0.0.0:"+(System.getenv("PORT")!=null?Integer.valueOf(System.getenv("PORT")):"9998") + "/";
        
        final Map<String, String> initParams = new HashMap<String, String>();

        //org.glassfish.jersey.server.ResourceConfig rc = new ResourceConfig();
//    rc.packages("RestServer.controllers");
    
        initParams.put("com.sun.jersey.config.property.packages","resources");
        
        System.out.println("Starting grizzly...");
        
        SelectorThread threadSelector = GrizzlyWebContainerFactory.create(baseUri, initParams);
//        startServer();
        
//        resourceConfig.register(JacksonFeature.class);
        System.out.println(String.format("Jersey started with WADL available at %sapplication.wadl.",baseUri, baseUri));
    }
    
    
//    private static void startServer() {
//        
//        ResourceConfig rc = new ResourceConfig().packages("resources");
//        
//         GrizzlyHttpServerFactory.createHttpServer(URI.create(baseUri2), rc);
//    }
}
