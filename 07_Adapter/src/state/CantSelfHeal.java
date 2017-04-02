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
			System.out.println("���� ���� �� ������ �ڰ�ġ��� �Ұ��� �մϴ�.");
		else if(unit.check==1)
			System.out.println(unit.getType() + "�� ������ �����մϴ�");
		int tempHealth=unit.getHealth();
		if(tempHealth <50) 
			unit.setState(unit.getLessHealthHeal());
		else
			unit.setState(unit.getMuchHealthHeal());
		System.out.println();
}
}
