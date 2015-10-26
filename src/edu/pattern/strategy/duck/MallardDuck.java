package edu.pattern.strategy.duck;

import edu.pattern.strategy.behavior.fly.FlyWithWings;
import edu.pattern.strategy.behavior.quack.Quack;

public class MallardDuck extends Duck
{
	public MallardDuck()
	{
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display()
	{
		
	}
}
