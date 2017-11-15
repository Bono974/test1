package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.EstimatesApiService;
import io.swagger.api.factories.EstimatesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Error;
import io.swagger.model.PriceEstimate;
import io.swagger.model.Product;
import java.util.UUID;

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

@Path("/estimates")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the estimates API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T08:39:18.118Z")
public class EstimatesApi  {
   private final EstimatesApiService delegate;

   public EstimatesApi(@Context ServletConfig servletContext) {
      EstimatesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EstimatesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EstimatesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = EstimatesApiServiceFactory.getEstimatesApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/price")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Price Estimates", notes = "The Price Estimates endpoint returns an estimated price range for each product offered at a given location. The price estimate is provided as a formatted string with the full price range and the localized currency symbol.<br><br>The response also includes low and high estimates, and the [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code for situations requiring currency conversion. When surge is active for a particular product, its surge_multiplier will be greater than 1, but the price estimate already factors in this multiplier. ", response = PriceEstimate.class, responseContainer = "List", tags={ "Estimates", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of price estimates by product", response = PriceEstimate.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = PriceEstimate.class, responseContainer = "List") })
    public Response estimatesPriceGet(@ApiParam(value = "Latitude component of start location.",required=true) @QueryParam("start_latitude") Double startLatitude
,@ApiParam(value = "Longitude component of start location.",required=true) @QueryParam("start_longitude") Double startLongitude
,@ApiParam(value = "Latitude component of end location.",required=true) @QueryParam("end_latitude") Double endLatitude
,@ApiParam(value = "Longitude component of end location.",required=true) @QueryParam("end_longitude") Double endLongitude
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.estimatesPriceGet(startLatitude,startLongitude,endLatitude,endLongitude,securityContext);
    }
    @GET
    @Path("/time")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Time Estimates", notes = "The Time Estimates endpoint returns ETAs for all products offered at a given location, with the responses expressed as integers in seconds. We recommend that this endpoint be called every minute to provide the most accurate, up-to-date ETAs.", response = Product.class, responseContainer = "List", tags={ "Estimates", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of products", response = Product.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Product.class, responseContainer = "List") })
    public Response estimatesTimeGet(@ApiParam(value = "Latitude component of start location.",required=true) @QueryParam("start_latitude") Double startLatitude
,@ApiParam(value = "Longitude component of start location.",required=true) @QueryParam("start_longitude") Double startLongitude
,@ApiParam(value = "Unique customer identifier to be used for experience customization.") @QueryParam("customer_uuid") UUID customerUuid
,@ApiParam(value = "Unique identifier representing a specific product for a given latitude & longitude.") @QueryParam("product_id") String productId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.estimatesTimeGet(startLatitude,startLongitude,customerUuid,productId,securityContext);
    }
}
