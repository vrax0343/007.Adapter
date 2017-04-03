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
		System.out.println("������ ������ �� �����ϴ�.");
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("������ �̵��� �� �����ϴ�.");
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
//		System.out.println("���� ������ ü����: "+this.stoneSize);
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
		System.out.println("������ Ư���ɷ��� �����ϴ�.");
	}

	@Override
	public void died() {
		// TODO Auto-generated method stub
		System.out.println("������ ũ���: "+this.stoneSize);
		System.out.println("!Crushed!");
	}
	
	
}
