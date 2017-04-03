package adapter;

import strategy.function.GenerateRandomPosition;

public class StoneClass implements StoneInterface{
	int locationX=GenerateRandomPosition.generate(),locationY=GenerateRandomPosition.generate();
	int stoneSize=100;
//	StoneAdaptor sa;
	

//	public void specialAttack() throws


	public void setStoneSize(int stoneSize) {
		this.stoneSize = stoneSize;
	}

	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}

	public int getLocationX() {
		// TODO Auto-generated method stub
		return this.locationX;
	}
	public int getLocationY() {
		// TODO Auto-generated method stub
		return this.locationY;
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("바위는 공격할 수 없습니다.");
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("바위는 이동할 수 없습니다.");
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
//		System.out.println("현재 바위의 체력은: "+this.stoneSize);
		return this.stoneSize;
	}

	@Override
	public void printLocation() {
		// TODO Auto-generated method stub
		System.out.println("("+this.locationX+"," + this.locationY+")");
	}

	@Override
	public void specialAbility() {
		// TODO Auto-generated method stub
		System.out.println("바위는 특수능력이 없습니다.");
	}

	@Override
	public void died() {
		// TODO Auto-generated method stub
		System.out.println("바위의 크기는: "+this.stoneSize);
		System.out.println("!Crushed!");
	}
	
	
}
