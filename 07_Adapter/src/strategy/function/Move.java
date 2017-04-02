package strategy.function;

import strategy.check.MapLimitCheck;
import strategy.unit.Unit;

public class Move {
	int x=0, y=0;
	public Move() { }
	public Move(Unit u, int x, int y){
		
	}
	public static void moveLocation(Unit unit, int x, int y){
		unit.setLocation(x, y);
	}
	
	public static int[] move(int x1, int x2, int y1, int y2) {
		x1 += x2;
		y1 += y2;
		
		return new int[] {x1,y1};
	}
	
}
