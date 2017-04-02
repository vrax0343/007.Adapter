package factory.af;

import factory.af.unit.CivilianTeamUnit;
import factory.af.unit.KnightTeamUnit;
import factory.af.unit.MageTeamUnit;
import strategy.unit.Unit;

public class RedTeamFactory extends TeamFactoryStore {

	@Override
	public Unit createTeamUnit(String item) {
		// TODO Auto-generated method stub
		Unit teamUnit = null;
		AbstractTeamInfoFactory atf = new RedTeamInfoFactory();
		
		if (item.equals("Mage")) {
			teamUnit = new MageTeamUnit(atf);
			teamUnit.prepareTeamInfo();

		}else if (item.equals("Civilian")) {
			teamUnit = new CivilianTeamUnit(atf);
			teamUnit.prepareTeamInfo();
		}else if (item.equals("Knight")) {
			teamUnit = new KnightTeamUnit(atf);
			teamUnit.prepareTeamInfo();
		}
		return teamUnit;
	}

}
