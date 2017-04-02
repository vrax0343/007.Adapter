package state;

import strategy.unit.Unit;

public class MuchHealthHeal implements State {
	Unit unit;
	
	public MuchHealthHeal(Unit unit) {
		// TODO Auto-generated method stub
		super();
		this.unit = unit;
	}

	@Override
	public void selfHeal() {
		// TODO Auto-generated method stub
		if(unit.getMana() <= 0){
			System.out.println(unit.getType() + "의 마나가 부족합니다");
			unit.setState(unit.getCantSelfHeal());
			unit.check = 1;
		} else{
			int tempMana = unit.getMana();
			unit.setHealth(unit.getHealth()+2,2);
			unit.setMana(unit.getMana()-1);
			System.out.println("남은 마나량은: ["+tempMana+" -> "+unit.getMana()+"]");
		}
		
		
		System.out.println();
	}

}
