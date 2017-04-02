package factory.fm;

import strategy.unit.Unit;

public class BlueTeamFactory extends TeamFactoryStore {

	@Override
	Unit createTeamUnit(String item) {
		// TODO Auto-generated method stub
		if (item.equals("Civilian")) {
    		return new BlueTeamCitizen();
		} else if (item.equals("Knight")) {
		    	return new BlueTeamKnight();
		} else if (item.equals("Mage")) {
		    	return new BlueTeamMage();
		} else return null;
	}


}
