package state;

import strategy.unit.Unit;

public class LessHealthHeal implements State {
	
	Unit unit;
	
	public LessHealthHeal(Unit unit) {
		super();
		this.unit = unit;
	}	

	
	@Override
	public void selfHeal() {
		// TODO Auto-generated method stub
		if(unit.getMana() <= 0){
			System.out.println(unit.getType() + "�� ������ �����մϴ�");
			unit.setState(unit.getCantSelfHeal());
			unit.check = 1;
		} else{
			int tempMana = unit.getMana();
			unit.setHealth(unit.getHealth()+1,1);
			unit.setMana(unit.getMana()-1);
			System.out.println("���� ��������: ["+tempMana+" -> "+unit.getMana()+"]");
		}
		System.out.println();
	}

}
