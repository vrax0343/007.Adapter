package adapter.main;

import adapter.UnitInterface;
import strategy.unit.Knight;
import strategy.unit.Unit;
import adapter.StoneAdaptor;
import adapter.StoneClass;
import adapter.StoneInterface;

public class TestDrive {
	
	public static void main(String[] args) {
		
//		UnitInterface iu = new StoneClass();
//		try{
//			iu.attack();
//			
//		}catch(UnsupportedOperationException uoe){
//			System.out.println(uoe.getMessage());
//		}
//		try{
//			iu.move();
//			
//		}catch(UnsupportedOperationException uoe){
//			System.out.println(uoe.getMessage());
//		}
//		
		Unit unit = new Knight();
		
		StoneClass stone = new StoneClass();
		
		Unit stoneAdapter = new StoneAdaptor(stone);
		
		StoneInterface si;
		
		stoneAdapter.fight();
		stoneAdapter.move2(1, 2);
		stoneAdapter.getHealth();
		stoneAdapter.getLocation();
		
		
	}
}
