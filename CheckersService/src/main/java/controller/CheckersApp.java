package controller;

import java.util.HashMap;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/")
public class CheckersApp {

   /**
    * TODO: Create useful end points. This can and should be removed. It purely
    * servers as an example.
    */
   @GET
   @Path("/")
   @Produces({MediaType.APPLICATION_JSON})
   public HashMap<String, String> getCheckers() {
      HashMap<String, String> exampleObject = new HashMap();
      exampleObject.put("hello", "world");
      return exampleObject;
   }
}
