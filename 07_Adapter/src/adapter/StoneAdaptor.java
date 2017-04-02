package adapter;

import strategy.unit.Unit;

public class StoneAdaptor extends Unit{
	StoneInterface si;
	
	public StoneAdaptor(StoneInterface si) {
		super();
		this.si = si;
		// TODO Auto-generated constructor stub
	}
	
//	@Override
//	public void attack() throws UnsupportedOperationException {
//		// TODO Auto-generated method stub
//		si.attack();
//	}
//
//	@Override
//	public void move() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public int getSize() {
//		// TODO Auto-generated method stub
//		return si.getSize();
//	}
	public void fight() {
		si.fight();
	}
	public void move(int x, int y) {
		si.move(x, y);
	}
	public int getHealth() {
		return si.getHealth();
	}
	
	public void getLocation(){
		si.getLocation();
	}
	
	public void specialAbility(){
		si.specialAbility();
	}
	
	public void died(){
		si.died();
	}
	
	
}
