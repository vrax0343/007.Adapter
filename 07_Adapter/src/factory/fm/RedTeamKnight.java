package factory.fm;

import strategy.behavior.attack.*;
import strategy.behavior.movement.*;
import strategy.behavior.weapon.*;
import strategy.unit.Knight;
import strategy.unit.Unit;

public class RedTeamKnight extends Unit {

	public RedTeamKnight() {
		// TODO Auto-generated constructor stub
		super("Knight");
		setting(new Knight());
	}
	
	public String toString(){
		this.setType("RedTeam "+this.getType());
		return super.toString();
	}
}
