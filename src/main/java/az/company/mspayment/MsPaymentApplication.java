package az.company.mspayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "az.company.mspayment.client")
public class MsPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsPaymentApplication.class, args);
    }

}
