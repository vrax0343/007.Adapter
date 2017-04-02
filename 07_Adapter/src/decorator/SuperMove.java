package decorator;

import strategy.check.MapLimitCheck;
import strategy.unit.Unit;

public class SuperMove extends AbilityDecorator {
	Unit unit;
	
	public SuperMove(Unit unit) {
		super();
		this.unit = unit;
		System.out.println(unit.getType()+ "이(가) 이동형 각성을 했습니다");
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void fight(){
		unit.fight();
	}
	
	public void move2(int locX, int locY){
		System.out.println("("+locX+","+locY+")"+"으로 각성 이동을 합니다.");
		System.out.println("현재 체력은: "+unit.getHealth());
		System.out.println("현재 위치는: ("+unit.getLocationX()+","+unit.getLocationY()+")");
		
		System.out.println("-----------------------------");
		
		MapLimitCheck mlc = new MapLimitCheck();
		int x=mlc.check(locX);
		int y=mlc.check(locY);
		if(x!=locX || y!=locY)
			System.out.println("맵 최대 크기로 인해 수정된 목표는: ("+locX+","+locY+")"+"입니다.");
		else
			System.out.println("목표지점은: ("+locX+","+locY+")"+"입니다.");
		while(true){
			if((unit.health <1) || ((locX==unit.locationX)&&(locY==unit.locationY))){
				System.out.println("체력이 부족하여 이동할 수 없습니다.");
				break;
			} 
			
			if(locX < unit.locationX) unit.locationX-=2;
			else if(locX > unit.locationX) unit.locationX+=2;
			else if(locY > unit.locationY) unit.locationY+=2;
			else if(locY < unit.locationY) unit.locationY-=2;
			unit.health -=1;
		}
		
		
//		unit=new Move().moveSuperMove(unit, locX, locY);
		System.out.println("-----------------------------");
		System.out.println("이동 후 체력은: "+unit.getHealth());
		System.out.println("이동 후 위치는: ("+unit.locationX+","+unit.locationY+")");
		
//		unit.attack(unit);
	}
//
//
//
//	@Override
//	public String getDescription() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void prepare() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public TeamUnit attack() {
//		// TODO Auto-generated method stub
//		teamUnit.attack();
//		return teamUnit;
//	}



	
}
