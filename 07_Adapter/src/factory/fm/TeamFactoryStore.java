package factory.fm;

import strategy.unit.Unit;

public abstract class TeamFactoryStore {
	
	static final int CITIZEN = 0;
	static final int KNIGHT = 1;
	static final int MAGE = 2;
	
	abstract Unit createTeamUnit(String type);
	
	public Unit makeUnit(String type) {
		Unit tempUnit = createTeamUnit(type);
		System.out.println(tempUnit);
		
		return tempUnit; 
	}
}
