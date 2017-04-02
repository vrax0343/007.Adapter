package factory.af;

import factory.af.unit.*;
import strategy.unit.Mage;
import strategy.unit.Unit;

public class BlueTeamFactory extends TeamFactoryStore {
	@Override
	public Unit createTeamUnit(String item) {
		// TODO Auto-generated method stub
		Unit teamUnit = null;
		AbstractTeamInfoFactory atf = new BlueTeamInfoFactory();
		
		if (item.equals("Mage")) {
			teamUnit = new MageTeamUnit(atf);
			
		}else if (item.equals("Civilian")) {
			teamUnit = new CivilianTeamUnit(atf);
		}else if (item.equals("Knight")) {
			teamUnit = new KnightTeamUnit(atf);
		}
		return teamUnit;
	}

}
