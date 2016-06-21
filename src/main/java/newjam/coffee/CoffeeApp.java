package newjam.coffee;

public class CoffeeApp {

  static Heater createHeater() {
    return new ElectricHeater();
  }
  
  static Pump createPump(Heater heater ) {
    return new Thermosiphon(heater);
  }
  
  static CoffeeMaker createCoffeeMaker() {
    final Heater heater = createHeater();
    return new CoffeeMaker(heater, createPump(heater));
  }
  
  public static void main(String[] args) {
    
    final CoffeeMaker coffeeMaker = createCoffeeMaker();
    
    coffeeMaker.brew();
    
  }
  
}
