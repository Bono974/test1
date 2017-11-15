package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.HistoryApiService;
import io.swagger.api.factories.HistoryApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Activities;
import io.swagger.model.Error;

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

@Path("/history")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the history API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T08:39:18.118Z")
public class HistoryApi  {
   private final HistoryApiService delegate;

   public HistoryApi(@Context ServletConfig servletContext) {
      HistoryApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("HistoryApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (HistoryApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = HistoryApiServiceFactory.getHistoryApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "User Activity", notes = "The User Activity endpoint returns data about a user's lifetime activity with Uber. The response will include pickup locations and times, dropoff locations and times, the distance of past requests, and information about which products were requested.<br><br>The history array in the response will have a maximum length based on the limit parameter. The response value count may exceed limit, therefore subsequent API requests may be necessary.", response = Activities.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "History information for the given user", response = Activities.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Activities.class) })
    public Response historyGet(@ApiParam(value = "Offset the list of returned results by this amount. Default is zero.") @QueryParam("offset") Integer offset
,@ApiParam(value = "Number of items to retrieve. Default is 5, maximum is 100.") @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.historyGet(offset,limit,securityContext);
    }
}
