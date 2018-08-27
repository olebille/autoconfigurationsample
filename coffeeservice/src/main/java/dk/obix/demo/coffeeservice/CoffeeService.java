package dk.obix.demo.coffeeservice;

@SuppressWarnings("unused")
public class CoffeeService {
    private String baristaName;

    public CoffeeService() {
    }

    public CoffeeService(String baristaName) {
        this.baristaName = baristaName;
    }

    public String canIOrderCoffee() {
        if(baristaName!=null) {
            return "yes "+baristaName+" will make that for you";
        }
        else {
            return "No";
        }
    }
}
