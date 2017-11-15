package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ProductsApiService;
import io.swagger.api.factories.ProductsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Error;
import io.swagger.model.Product;

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

@Path("/products")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the products API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T08:39:18.118Z")
public class ProductsApi  {
   private final ProductsApiService delegate;

   public ProductsApi(@Context ServletConfig servletContext) {
      ProductsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ProductsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ProductsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ProductsApiServiceFactory.getProductsApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Product Types", notes = "The Products endpoint returns information about the *Uber* products offered at a given location. The response includes the display name and other details about each product, and lists the products in the proper display order. ", response = Product.class, responseContainer = "List", tags={ "Products", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of products", response = Product.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Product.class, responseContainer = "List") })
    public Response productsGet(@ApiParam(value = "Latitude component of location.",required=true) @QueryParam("latitude") Double latitude
,@ApiParam(value = "Longitude component of location.",required=true) @QueryParam("longitude") Double longitude
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.productsGet(latitude,longitude,securityContext);
    }
}
