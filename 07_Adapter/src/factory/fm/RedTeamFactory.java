package factory.fm;

import strategy.unit.Unit;

public class RedTeamFactory extends TeamFactoryStore {

	@Override
	Unit createTeamUnit(String item) {
		// TODO Auto-generated method stub
		if (item.equals("Civilian")) {
    		return new RedTeamCitizen();
		} else if (item.equals("Knight")) {
		    	return new RedTeamKnight();
		} else if (item.equals("Mage")) {
		    	return new RedTeamMage();
		} else return null;
	}


}
