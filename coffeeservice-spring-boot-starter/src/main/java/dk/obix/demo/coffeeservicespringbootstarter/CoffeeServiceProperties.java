package dk.obix.demo.coffeeservicespringbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class CoffeeServiceProperties {
    private String baristaName="Ole Bille";

    public String getBaristaName() {
        return baristaName;
    }

    public void setBaristaName(String baristaName) {
        this.baristaName = baristaName;
    }
}
