package decorator;

import strategy.unit.Unit;

public class SuperAttack extends AbilityDecorator {
	Unit unit;
	public SuperAttack(Unit unit){
		this.unit=unit;
		System.out.println(unit.getType()+ "이(가) 공격형 각성을 했습니다");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "각성공격을 합니다";
	}
	
	
	
	public void fight(){
		int tempHealth = unit.getHealth();
		System.out.println("각성 공격을 합니다.");
		if(tempHealth <= 0){
			System.out.println("!! 체력이 부족하여 공격을 수행할 수 없습니다. !!");
			System.out.println(unit.getType());
		}else{
		
			System.out.println("현재 체력은: "+tempHealth);
			System.out.println("-----------------------------");
			unit.fight();
			unit.fight();
			unit.setHealth(tempHealth-1);
	//		new Fight().fightSuperAttack(teamUnit);
			System.out.println("-----------------------------");
			System.out.println("공격 후 체력은: "+unit.getHealth());
	//		return teamUnit;
		}
	}
	
	public void move2(int locX, int locY){
		unit.move2(locX, locY);
	}
//
//	@Override
//	public void prepare() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	public void move(int x, int y){
//		teamUnit.move(x, y);
//	}

}
