package xpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("xpl.pxy")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("ed1f-currency-conversion-service-feign");
	}
}
