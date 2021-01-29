package com.example.webservice.producingwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;

/**
 * @Description:
 * @Author:tangdianyan
 * @Date:Created in 16:28 2021/1/29
 * @Modified By:
 */
// @Endpoint annotation registers the class with Spring WS as a potential candidate for processing incoming SOAP messages.
@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private CountryRepository countryRepository;

    @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    /**
     * @description:The The @PayloadRoot annotation is used by Spring WS to pick the handler method,
     *                      based on the message’s namespace and localPart
     *                  The @RequestPayload annotation indicates that the incoming message will be mapped
     *                      to the method’s request parameter.
     *                  The @ResponsePayload annotation makes Spring WS map the returned value to the response payload.
     * @param request
     * @return io.spring.guides.gs_producing_web_service.GetCountryResponse
     * @throws
     * @author jdyo
     * @date 2021/1/29 16:31
    **/
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));

        return response;
    }
}
