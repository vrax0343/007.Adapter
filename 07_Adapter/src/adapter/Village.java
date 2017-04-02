package adapter;

import java.util.ArrayList;

import strategy.function.GenerateRandomPosition;
import strategy.unit.Unit;


public class Village {
	
	ArrayList<Unit> unitList = new ArrayList<Unit>();
	ArrayList<StoneClass> stoneList = new ArrayList<StoneClass>();
	int leftX,leftY,rightX,rightY=0;
	
	public Village() {
		super();
		int[] tempArr = {GenerateRandomPosition.generate(),
							GenerateRandomPosition.generate(),
							GenerateRandomPosition.generate(),
							GenerateRandomPosition.generate()};
		int temp=0;
		if(tempArr[0]>tempArr[2]){
			temp=tempArr[2];
			tempArr[2]=tempArr[0];
			tempArr[0]=temp;
		}else{ }
		if(tempArr[1]<tempArr[3]){
			temp=tempArr[3];
			tempArr[3]=tempArr[1];
			tempArr[1]=temp;
		}
		this.leftX = tempArr[0];
		this.leftY = tempArr[1];
		this.rightX = tempArr[2];
		this.rightY = tempArr[3];
		
	}
	
	


	public Village(int leftX, int leftY, int rightX, int rightY) {
		super();
		this.leftX = leftX;
		this.leftY = leftY;
		this.rightX = rightX;
		this.rightY = rightY;
	}




	public void inspection(){
		Unit tempUnit = null;
		StoneClass tempStone = null;
		System.out.println("������ ���� ũ��: ("+this.leftX+","+this.leftY+")-("+this.rightX+","+this.rightY+")");
		for(int i=1; i<this.unitList.size()+1; i++){
			tempUnit = unitList.get(i-1);
			System.out.println(i+"��° ������: "+tempUnit.getType()+"\t��ġ: ("+tempUnit.getLocationX()+","+tempUnit.getLocationY()+")");
		}
		for(int i=1; i<this.stoneList.size()+1; i++){
			tempStone = stoneList.get(i-1);
			System.out.println(i+"��° ��: \t��ġ: ("+tempStone.getLocationX()+","+tempStone.getLocationY()+")");
		}
		System.out.println();
	}
	
		
		
	public void enterVillage(Object obj){
//		unitClass.setLocationX(GenerateRandomPosition.generate(this.leftX, this.rightX));
//		unitClass.setLocationY(GenerateRandomPosition.generate(this.leftY, this.rightY));
		if(obj instanceof Unit){
			Unit unitClass = (Unit)obj;
		unitClass.setLocation(GenerateRandomPosition.generate(this.leftX, this.rightX), GenerateRandomPosition.generate(this.leftY, this.rightY));
		
		unitList.add(unitClass);
		
		System.out.println(unitClass.getType()+"�� ������ �����߽��ϴ�.");
		}else{
			StoneClass stone = (StoneClass)obj;
			stoneList.add(stone);
			
			System.out.println("���� ������ �����߽��ϴ�.");
		}
			
	}
//	public void enterVillage(Unit unitClass){
////		unitClass.setLocationX(GenerateRandomPosition.generate(this.leftX, this.rightX));
////		unitClass.setLocationY(GenerateRandomPosition.generate(this.leftY, this.rightY));
//		unitClass.setLocation(GenerateRandomPosition.generate(this.leftX, this.rightX), GenerateRandomPosition.generate(this.leftY, this.rightY));
//		
//		unitList.add(unitClass);
//		
//		System.out.println(unitClass.getType()+"�� ������ �����߽��ϴ�.");
//	}
	public void enterVillageStone(StoneClass unit){
		unit.setLocationX(GenerateRandomPosition.generate(this.leftX, this.rightX));
		unit.setLocationY(GenerateRandomPosition.generate(this.leftY, this.rightY));
		
		stoneList.add(unit);
		System.out.println("���� ������ �����߽��ϴ�.");
	}

	public ArrayList<Unit> getUnitList() {
		return unitList;
	}
	
	public StoneClass addStone(){
		return new StoneClass();
	}




	public int getLeftX() {
		return leftX;
	}




	public int getLeftY() {
		return leftY;
	}




	public int getRightX() {
		return rightX;
	}




	public int getRightY() {
		return rightY;
	}
	
	

}
