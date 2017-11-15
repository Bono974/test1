package io.swagger.api.factories;

import io.swagger.api.EstimatesApiService;
import io.swagger.api.impl.EstimatesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T08:39:18.118Z")
public class EstimatesApiServiceFactory {
    private final static EstimatesApiService service = new EstimatesApiServiceImpl();

    public static EstimatesApiService getEstimatesApi() {
        return service;
    }
}
