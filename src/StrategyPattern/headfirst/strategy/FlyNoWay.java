package StrategyPattern.headfirst.strategy;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I Can't fly");
    }
}
