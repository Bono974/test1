package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Error;
import io.swagger.model.PriceEstimate;
import io.swagger.model.Product;
import java.util.UUID;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T08:39:18.118Z")
public class EstimatesApiServiceImpl extends EstimatesApiService {
    @Override
    public Response estimatesPriceGet( @NotNull Double startLatitude,  @NotNull Double startLongitude,  @NotNull Double endLatitude,  @NotNull Double endLongitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response estimatesTimeGet( @NotNull Double startLatitude,  @NotNull Double startLongitude,  UUID customerUuid,  String productId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
