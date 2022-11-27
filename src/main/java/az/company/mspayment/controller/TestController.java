package az.company.mspayment.controller;

import az.company.mspayment.client.CountryClient;
import az.company.mspayment.model.client.CountryDto;
import az.company.mspayment.model.request.PaymentCriteria;
import az.company.mspayment.model.response.PageablePaymentResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private final CountryClient countryClient;

    public TestController(CountryClient countryClient) {
        this.countryClient = countryClient;
    }

    @GetMapping
    public List<CountryDto> getAllPayments(@RequestParam String currency) {

        return countryClient.getAllAvailableCountries(currency);
    }
}
