package xpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("xpl.pxy")
@RibbonClient(name = "currency-conversion-service", configuration = LocalRibbonClientConfiguration.class)
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("ed1f-currency-conversion-service-feign");
	}
}
