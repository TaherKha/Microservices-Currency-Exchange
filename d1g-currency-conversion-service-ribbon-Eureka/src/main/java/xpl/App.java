package xpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("xpl.pxy")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("ed1g-currency-conversion-service-ribbon");
	}
}
