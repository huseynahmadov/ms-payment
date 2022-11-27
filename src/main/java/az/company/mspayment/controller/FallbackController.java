package az.company.mspayment.controller;

import az.company.mspayment.client.CountryClient;
import az.company.mspayment.exception.ExceptionResponse;
import az.company.mspayment.model.client.CountryDto;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class FallbackController implements CountryClient {

    private final Exception exception;

    public FallbackController(Exception exception) {
        this.exception = exception;
    }

    @Override
    public List<CountryDto> getAllAvailableCountries(String currency) {
        if (exception instanceof RuntimeException) {
            return Collections.emptyList();
        }
        var uuid = UUID.randomUUID().toString();
        throw new ExceptionResponse(uuid,"Service unavailable for short time");
    }
}
