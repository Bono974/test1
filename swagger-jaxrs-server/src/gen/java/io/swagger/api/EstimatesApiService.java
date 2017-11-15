package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Error;
import io.swagger.model.PriceEstimate;
import io.swagger.model.Product;
import java.util.UUID;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T08:39:18.118Z")
public abstract class EstimatesApiService {
    public abstract Response estimatesPriceGet( @NotNull Double startLatitude, @NotNull Double startLongitude, @NotNull Double endLatitude, @NotNull Double endLongitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response estimatesTimeGet( @NotNull Double startLatitude, @NotNull Double startLongitude, UUID customerUuid, String productId,SecurityContext securityContext) throws NotFoundException;
}
