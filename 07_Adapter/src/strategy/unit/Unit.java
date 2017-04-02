package strategy.unit;

import java.util.ArrayList;

import adapter.StoneInterface;
import factory.af.TeamName;
import observer.DisplayElement;
import observer.Observer;
import observer.Subject;
import singleton.function.Print;
import state.CantSelfHeal;
import state.LessHealthHeal;
import state.MuchHealthHeal;
import state.State;
import strategy.behavior.attack.AttackBehavior;
import strategy.behavior.attack.Punch;
import strategy.behavior.attack.SwingSword;
import strategy.behavior.movement.MovementBehavior;
import strategy.behavior.movement.Walk;
import strategy.behavior.weapon.Fist;
import strategy.behavior.weapon.Sword;
import strategy.behavior.weapon.WeaponBehavior;
import strategy.check.MapLimitCheck;
import strategy.function.GenerateRandomPosition;
import strategy.function.Move;

public class Unit implements Observer{
	public AttackBehavior attack = null;
	public MovementBehavior movement = null;
	public WeaponBehavior weapon=null;
	private Subject weatherData;
	
	
	public String type = "";
	public int locationX=0, locationY=0;
	public int health=0;
	
	//07. Adapter
	public void specialAbility() {}
	public void died(){ }
	
	//06. State Pattern
	State cantSelfHeal;
	State lessHealthHeal;
	State muchHealthHeal;
	State state;
	int mana, maxMana, maxHealth=0;
	public int check=0;
	int[] stackCountArr = {0,0};
	
	
	
	
	public Unit() { 
	}
	public Unit(String type){
		this.type=type;
		this.locationX=GenerateRandomPosition.generate();
		this.locationY=GenerateRandomPosition.generate();
		
		//06. State Pattern
		cantSelfHeal = new CantSelfHeal(this);
		lessHealthHeal = new LessHealthHeal(this);
		muchHealthHeal = new MuchHealthHeal(this);
		state = cantSelfHeal;
	}
	
	public Unit(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	
	
	
	
	//06. State Pattern
	public void doSelfHeal(){
		state.selfHeal();
	}
	
	public void stackCounterCheck(){
		int value = this.stackCountArr[0] + this.stackCountArr[1];
		if(value >= 3) {
			int mana = this.mana;
			System.out.print("공격: "+this.stackCountArr[0] +
								"\t이동: "+this.stackCountArr[1]+
								"\t총 3회가 되었기에 마나를 1 증가시킵니다.\t");
			this.stackCountArr = new int[] {0,0};
			this.mana +=1;
			if(this.state instanceof CantSelfHeal){
				if(this.health < 50) this.state = new LessHealthHeal(this);
				else this.state=new MuchHealthHeal(this);
			}
			System.out.println("["+mana+" -> "+this.mana+"]");
			
		}else {
			
		}
	}
	public int getMana() {
		return mana;
	}
	public int getmaxMana() {
		return maxMana;
	}
	public int getmaxHealth() {
		return maxHealth;
	}
	public State getCantSelfHeal() {
		return cantSelfHeal;
	}
	public State getLessHealthHeal() {
		return lessHealthHeal;
	}
	public State getMuchHealthHeal() {
		return muchHealthHeal;
	}
	public void setHealth(int health,int value) {
		System.out.println("+"+this.getType() + " 에 체력을  '"+value+"' 더합니다");
		System.out.print("[Before]: " + this.health);
		if (health > this.maxHealth) 
			this.health = this.maxHealth;
		else 
			this.health = health;
		System.out.println("\t[After]: " + this.health);
	}
	public void setState(State state) {
		this.state = state;
	}
//	public void setHealth(int health) {
//		System.out.println("---"+this.getType() + " 의 체력을 수정합니다---");
//		System.out.print("[Before]: " + this.health);
//		if (health > this.maxHealth) 
//			this.health = this.maxHealth;
//		else 
//			this.health = health;
//		System.out.println("\t[After]: " + this.health);
//	}
	public void setMana(int mana) {
		if (mana > this.maxMana) 
			this.mana = this.maxMana;
		else 
			this.mana = mana;
	}
	public void setmaxMana(int maxMana) {
		this.maxMana = maxMana;
	}
	public void setmaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	
	
	
	public void fight(){ }
	
	public void move2(int x,int y){ }
	
	
	public void move(int x, int y){
		System.out.println("---"+this.getType() + " is moving---");
		System.out.print("[Before]: (" + this.locationX+","+this.locationY+")");
		int[] tempIntArr=Move.move(this.getLocationX(),x,this.getLocationY(),y);
		this.setLocation(tempIntArr[0], tempIntArr[1]);
		System.out.println(" [After]: (" + this.locationX+","+this.locationY+")");
		this.stackCountArr[1]+=1;
		stackCounterCheck();
	}
	
	
	
	
	//getter
	public String getType(){
		return this.type;
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
	public String getAttackType(){
		return this.attack.getAttackType();
	}
	public String getMovementType(){
		return this.movement.getMovementType();
	}
	
	public int getHealth() {
		return health;
	}
	

	
	
	//setter
	
	public AttackBehavior getAttack() {
		return attack;
	}
	public MovementBehavior getMovement() {
		return movement;
	}
	public WeaponBehavior getWeapon() {
		return weapon;
	}
	public Subject getWeatherData() {
		return weatherData;
	}
	public void setWeapon(WeaponBehavior w){
		System.out.print("[Before Weapon]: " + this.getWeaponType() +"\t");
		this.weapon = w;
		System.out.println("[After Weapon]: " + this.getWeaponType());
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setMovement(MovementBehavior m){
		this.movement = m;
	}
	public void setAttack(AttackBehavior a){
		System.out.print("[Before Attack]: " + this.getAttackType() +"\t");
		this.attack = a;
		System.out.println("[After Attack]: " + this.getAttackType());
	}
	
	public void setLocation(int x, int y){
		System.out.print("[Before Location]: (" + this.getLocationX()+","+this.getLocationY()+")\t");
		this.locationX = x;
		this.locationY = y;
		System.out.println("[After Location]: (" + this.getLocationX()+","+this.getLocationY()+")");
		System.out.println();
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	
	
	//toString
	public String toString(){
		return 
//				"---현재 "+this.type+"의 상태입니다---" + "\n"+ 
				"Type: " + this.type + "\t"+
				"Health: " + this.health + "\t"+
				"Location X,Y: " + this.locationX+","+this.locationY+"\t"+
				"WeaponType: " + this.weapon.getWeaponType() + "\t"+
				"MovementType: " + this.movement.getMovementType() + "\t"+
				"AttackType: " + this.attack.getAttackType() + "\t";
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(
				"["+this.getType() +"]: ("+ 
		this.getLocationX()+", "+this.getLocationY()+")");
	}
	
	public void prepareTeamInfo(){ 
		System.out.println("Please Overriding prepareTeamInfo()");
	};
	
	public void setting(Unit unit){
		this.type = unit.getType();
		this.health = unit.getHealth();
		this.weapon = unit.getWeapon();
		this.movement = unit.getMovement();
		this.attack = unit.getAttack();
		this.locationX = unit.getLocationX();
		this.locationY = unit.getLocationY();
	}
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Please Overriding prepare()");
	}
	
}
