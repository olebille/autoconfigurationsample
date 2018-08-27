package dk.obix.demo.coffeeservicespringbootstarter;

import dk.obix.demo.coffeeservice.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CoffeeServiceProperties.class)
public class CoffeeServiceAutoConfiguration {


    @ConditionalOnMissingBean
    @Bean
    public CoffeeService coffeeService(CoffeeServiceProperties coffeeServiceProperties) {
        return new CoffeeService(coffeeServiceProperties.getBaristaName());
    }
}
