package edu.pattern.strategy.behavior.quack;

public class Quack implements QuackBehavior
{

	@Override
	public void quack()
	{
		System.out.println("Squack sound");
	}

}
