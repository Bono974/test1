package io.swagger.api.factories;

import io.swagger.api.HistoryApiService;
import io.swagger.api.impl.HistoryApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-15T08:39:18.118Z")
public class HistoryApiServiceFactory {
    private final static HistoryApiService service = new HistoryApiServiceImpl();

    public static HistoryApiService getHistoryApi() {
        return service;
    }
}
