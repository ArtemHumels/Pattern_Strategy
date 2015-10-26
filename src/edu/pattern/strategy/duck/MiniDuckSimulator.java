package edu.pattern.strategy.duck;

import edu.pattern.strategy.behavior.fly.FlyRocketPowered;

public class MiniDuckSimulator
{
	public static void main(String args[])
	{
		Duck mallard = new MallardDuck();
		mallard.PerfomQuack();
		mallard.PerfomFly();
		
		Duck model = new ModelDuck();
		model.PerfomFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.PerfomFly();
	}
}
