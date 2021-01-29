package xpl.cfn;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
//The @Component create a Spring Bean
@ConfigurationProperties("limits-service")
public class Configuration {
   @Getter
   @Setter
   private int maximum;
   @Getter
   @Setter
   private int minimum;
}