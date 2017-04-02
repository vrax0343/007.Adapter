package decorator;

import strategy.unit.Unit;

public abstract class AbilityDecorator extends Unit {
	public Unit unit;
	
	public abstract String getDescription();
	public void fight(){
		System.out.println("please override void fight()");
	}
	public void move2(int x, int y){
		System.out.println("please override void move(x,y)");
	}
	
	
	
}
