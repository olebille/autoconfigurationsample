package dk.obix.demo.developersdream.coffee;

import dk.obix.demo.coffeeservice.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeOrderController {

    private final CoffeeService coffeeService;

    @Autowired
    public CoffeeOrderController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @RequestMapping("/canIOrderCoffee")
    public String canIOrderCoffee() {
        return coffeeService.canIOrderCoffee();
    }
}
