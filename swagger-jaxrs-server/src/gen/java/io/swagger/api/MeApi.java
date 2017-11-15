package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MeApiService;
import io.swagger.api.factories.MeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Error;
import io.swagger.model.Profile;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/me")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the me API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T08:39:18.118Z")
public class MeApi  {
   private final MeApiService delegate;

   public MeApi(@Context ServletConfig servletContext) {
      MeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("MeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (MeApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = MeApiServiceFactory.getMeApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "User Profile", notes = "The User Profile endpoint returns information about the Uber user that has authorized with the application.", response = Profile.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Profile information for a user", response = Profile.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Profile.class) })
    public Response meGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.meGet(securityContext);
    }
}
