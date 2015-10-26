package edu.pattern.strategy.duck;

import edu.pattern.strategy.behavior.fly.FlyBehavior;
import edu.pattern.strategy.behavior.quack.QuackBehavior;

public abstract class Duck
{
	FlyBehavior flyBehavior;
	QuackBehavior  quackBehavior;

	public void setFlyBehavior(FlyBehavior fb)
	{
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb)
	{
		quackBehavior = qb;
	}
	
	public void PerfomFly()
	{
		flyBehavior.fly();
	}
	
	public void PerfomQuack()
	{
		quackBehavior.quack();
	}
	
	public abstract void display();
	
	public void swim()
	{
		System.out.println("All ducks float!");
	}
}
