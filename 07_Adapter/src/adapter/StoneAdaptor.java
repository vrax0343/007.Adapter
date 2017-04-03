package adapter;

import strategy.unit.Unit;

public class StoneAdaptor extends Unit{
	StoneInterface si;
	
	public StoneAdaptor(StoneInterface si) {
		super();
		this.si = si;
		// TODO Auto-generated constructor stub
	}
	
	public void fight() {
		si.fight();
	}
	public void move(int x, int y) {
		si.move(x, y);
	}
	public int getHealth() {
		return si.getHealth();
	}
	
	public void printLocation(){
		si.printLocation();
	}
	
	public void specialAbility(){
		si.specialAbility();
	}
	
	public void died(Village village){
		si.died();
		new Village().removeStone(village);
	}

	@Override
	public String toString() {
		return "�������� ����õ� �����Դϴ�.\n"+
				"ü��: " + si.getHealth() + "\t��ġ��: (" + si.getLocationX()+", "+si.getLocationY()+")";
	}
	
	
	
}
