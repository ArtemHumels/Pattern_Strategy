package edu.pattern.strategy.duck;

import edu.pattern.strategy.behavior.fly.FlyNoWay;
import edu.pattern.strategy.behavior.quack.Quack;

public class ModelDuck extends Duck
{
	public ModelDuck()
	{
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display()
	{
		System.out.println("I'm a model duck!");
	}
}
