package singleton.unit;

import java.util.ArrayList;
import java.util.Iterator;

import observer.function.FindUnit;
import observer.unit.Owl;
import singleton.function.Print;
import strategy.behavior.attack.*;
import strategy.behavior.movement.*;
import strategy.behavior.weapon.*;
import strategy.function.GenerateRandomPosition;
import strategy.function.Move;
import strategy.unit.Unit;

public class SingletonUnit {

	static final int CITIZEN = 0;
	static final int KNIGHT = 1;
	static final int MAGE = 2;
	
	private static SingletonUnit uniqueInstance;
	private ArrayList<Unit> unitList = new ArrayList<Unit>();
	
	AttackBehavior attack = null;
	MovementBehavior movement = null;
	WeaponBehavior weapon=null;
	
	String type = "";
	int locationX=0, locationY=0;
	int health=0;
	int movementSpeed=0;
	int[] unitCount = {1,1,1};
	
	private SingletonUnit() { }


	public static synchronized SingletonUnit getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new SingletonUnit();
		}
		return uniqueInstance;
	}
	
	public void addUnit(Unit unit){
		Unit tempUnit=unit;
		if(unit.getType().equals("Citizen")){
			tempUnit.setType(unit.getType()+unitCount[CITIZEN]);
			unitCount[CITIZEN]+=1;
		}else if(unit.getType().equals("Knight")){
			tempUnit.setType(unit.getType()+unitCount[KNIGHT]);
			unitCount[KNIGHT]+=1;
		}else if(unit.getType().equals("Mage")){
			tempUnit.setType(unit.getType()+unitCount[MAGE]);
			unitCount[MAGE]+=1;
		}else if(unit.getType().equals("Owl")){
		} else{
			System.out.println("Error");
		}
		unitList.add(tempUnit);
		Print.printOne(tempUnit);
	}
	
	
	
	public void removeUnit(String type){
		Iterator<Unit> iterator = unitList.iterator();
		while(iterator.hasNext()){
			Unit tempUnit = iterator.next();
			System.out.println(tempUnit.type + "");
			iterator.remove();
		}
	}
	

	public void unitDied(String type) {
		Unit tempUnit = null;
		tempUnit = FindUnit.findOneByType(this.unitList, type);
		System.out.print("*Died*");
		Print.printOne(tempUnit);
		this.unitList.remove(tempUnit);
	}
		
	public void unitDiedAll() {
		Unit tempUnit = null;
		Iterator<Unit> iterator = unitList.iterator();
		while(iterator.hasNext()){
			tempUnit = iterator.next();
			System.out.print("*Died*");
			Print.printOne(tempUnit);
			iterator.remove();
		}
	}

		public void fightAllUnit() {
			// TODO Auto-generated method stub
			Iterator<Unit> iterator = unitList.iterator();
			while(iterator.hasNext()){
				Unit tempUnit = iterator.next();
				tempUnit.fight();
			}
		}
		
		public void printAllUnit(){
			Print.printListByType(unitList);
		}
	
	
	public String getType(){
		return this.type;
	}
	public int getHealth(){
		return this.health;
	}
	public void getLocation(){
		System.out.println("("+this.locationX+"," + this.locationY+")");
	}
	public int getLocationX(){
		return this.locationX;
	}
	public int getLocationY(){
		return this.locationY;
	}
	public String getWeaponType(){
		return this.weapon.getWeaponType();
	}	
	public String getMovementType() {
		// TODO Auto-generated method stub
		return this.movement.getMovementType();
	}


	public String getAttackType() {
		// TODO Auto-generated method stub
		return this.attack.getAttackType();
	}
	
	public ArrayList<Unit> getUnitList() {
		return unitList;
	}




	public void setWeapon(WeaponBehavior w){
		System.out.println("[Before Weapon]: " + this.getWeaponType());
		this.weapon = w;
		System.out.println("[After Weapon]: " + this.getWeaponType());
	}
	public void setMovement(MovementBehavior m){
		this.movement = m;
	}
	public void setAttack(AttackBehavior a){
		this.attack = a;
	}
	
	public void setLocation(int x, int y){
		System.out.println("[Before Location]: (" + this.getLocationX()+","+this.getLocationY()+")");
		this.locationX = x;
		this.locationY = y;
		System.out.println("[After Location]: (" + this.getLocationX()+","+this.getLocationY()+")");
		System.out.println();
	}
	
	
	//toString
	public String toString(){
		return  
				"Type: " + this.type + "\t"+
				"Health: " + this.health + "\t"+
				"Location X,Y: " + this.locationX+","+this.locationY+"\t"+
				"WeaponType: " + this.weapon.getWeaponType() + "\t"+
				"MovementType: " + this.movement.getMovementType() + "\t"+
				"AttackType: " + this.attack.getAttackType() + "\t";
	}




	public void moveDirect(String type, int x, int y) {
		// TODO Auto-generated method stub
			Unit tempUnit = FindUnit.findOneByType(this.unitList, type);
			if (tempUnit==null){
				System.out.println(type + "이 존재하지 않습니다.");
			}else
				Move.moveLocation(tempUnit, x, y);
				Print.printOne(tempUnit);
				System.out.println();
	}




	public void specialAbility() {
		// TODO Auto-generated method stub
		Owl tempOwl = (Owl)FindUnit.findOneByType(this.unitList, "Owl");
		tempOwl.specialAbility();
	}




	public void fightOne(String string) {
		// TODO Auto-generated method stub
		(FindUnit.findOneByType(unitList, string)).fight();
	}

}

