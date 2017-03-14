package com.samjin616.designpattern.compositepattern;

/**
 * Created by sjjin on 3/13/17.
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha( Beverage beverage ){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
