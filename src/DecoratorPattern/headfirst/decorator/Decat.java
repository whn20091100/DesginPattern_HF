package DecoratorPattern.headfirst.decorator;

public class Decat extends Beverage {
    public Decat() {
        description = "Decat Coffee";
    }

    @Override
    public double cost() {
        return .86;
    }
}
