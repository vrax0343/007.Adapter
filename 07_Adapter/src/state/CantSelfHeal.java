package state;

import strategy.unit.Unit;

public class CantSelfHeal implements State{
//NewUnit nu;
	Unit unit;
	
	public CantSelfHeal(Unit unit) {
		super();
		this.unit = unit;
	}


	@Override
	public void selfHeal() {
		// TODO Auto-generated method stub
		if(unit.check==0)
			System.out.println("유닛 생성 후 최초의 자가치료는 불가능 합니다.");
		else if(unit.check==1)
			System.out.println(unit.getType() + "의 마나가 부족합니다");
		int tempHealth=unit.getHealth();
		if(tempHealth <50) 
			unit.setState(unit.getLessHealthHeal());
		else
			unit.setState(unit.getMuchHealthHeal());
		System.out.println();
}
}
