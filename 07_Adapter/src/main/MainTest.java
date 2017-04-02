package main;

import adapter.StoneAdaptor;
import adapter.StoneClass;
import adapter.Village;
import factory.fm.*;
import observer.function.FindUnit;
import singleton.function.Print;
import singleton.unit.SingletonUnit;
import strategy.function.Move;
import strategy.unit.Citizen;
import strategy.unit.Knight;
import strategy.unit.Mage;
import strategy.unit.Unit;


public class MainTest {
	
	public static void main(String[] args){		
		
		System.out.println("=======================================================");
		System.out.println("1. 중립 유닛을 종류별로 생성한다");
		System.out.println("=======================================================");
		
		Unit knight = new Knight();
		Unit mage = new Mage();
		Unit citizen = new Citizen();
		
		
		System.out.println("=======================================================");
		System.out.println("2. 생성된 유닛을 모두 60, 60으로 이동한다.");
		System.out.println("=======================================================");
		
		knight.move2(60, 60);
		System.out.print("기사 위치: ");
		Move.moveLocation(knight, 60, 60);
		mage.move2(60, 60);
		System.out.print("마법사 위치: ");
		Move.moveLocation(mage, 60, 60);
		citizen.move2(60, 60);
		System.out.print("시민 위치: ");
		Move.moveLocation(citizen, 60, 60);
//		System.out.println("기사의 체력은: " + knight.getLocation(););
//		citizen.setHealth(1);
//		System.out.println("시민의 체력은: " + citizen.getHealth());
//		mage.setHealth(18);
//		System.out.println("법사의 체력은: " + mage.getHealth());
//		
//		System.out.println();
//	
		System.out.println("=======================================================");
		System.out.println("3. (30,30) - (50, 50) 에 마을을 생성한다.");
		System.out.println("=======================================================");
		
		Village village = new Village(30, 30, 50, 50);
//		knight.fight();
//		knight.doSelfHeal();
//		System.out.println();
//	
		System.out.println("=======================================================");
		System.out.println("4. 시민이 마을안으로 들어갔다.");
		System.out.println("=======================================================");
		
		village.enterVillage(citizen);
		
//		citizen.doSelfHeal();
//		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. 기사가 마을안으로 들어갔다.");
		System.out.println("=======================================================");
		
		village.enterVillage(knight);
		
//		mage.move(10, 10);
//		System.out.println();
//		mage.doSelfHeal();
//		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. 마을 정찰 수행 ");
		System.out.println("=======================================================");
	
		village.inspection();
//		knight.setMana(1);
//		System.out.print("기사의 마력 ="+knight.getMana());
//		
//		mage.setMana(1);
//		System.out.println("\t마법사의 마력 ="+mage.getMana());
//		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("7. 마을에 일반 바위 생성하여 크기를 출력한다.");
		System.out.println("=======================================================");
//		Unit unit = new Unit();
		StoneClass stone = new StoneClass();
//		Unit stoneAdapter = new StoneAdaptor(stone);
//		Unit unitt = new StoneClass();
		village.enterVillage(stone);
		System.out.print("바위의 체력은: ");
		System.out.println(stone.getHealth());
//		knight.fight();
//		knight.doSelfHeal();
//		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("8. 유닛으로 어댑팅된 바위 생성.");
		System.out.println("=======================================================");
		Unit unit2 = new Unit();
		
		StoneClass stone2 = new StoneClass();
		
		Unit stoneAdapter2 = new StoneAdaptor(stone);
//		knight.fight();
//		System.out.println();
//		knight.doSelfHeal();
//		System.out.println();
//		
//		
		System.out.println("=======================================================");
		System.out.println("9. 바위가 공격한다.");
		System.out.println("=======================================================");
		stoneAdapter2.fight();
//		knight.fight();
//		System.out.println();
//		knight.doSelfHeal();
//		System.out.println();
//
		System.out.println("=======================================================");
		System.out.println("10. 바위가 이동한다. ");
		System.out.println("=======================================================");
		stoneAdapter2.move(1, 2);
//		mage.doSelfHeal();
//		System.out.println();
//		
		System.out.println("=======================================================");
		System.out.println("11. 바위가 특수능력을 수행한다.");
		System.out.println("=======================================================");
		stoneAdapter2.specialAbility();
//		mage.fight();
//		System.out.println();
//		mage.doSelfHeal();
//		System.out.println();
//		
		System.out.println("=======================================================");
		System.out.println("12. 바위의 크기를 출력한뒤 죽는다.");
		System.out.println("=======================================================");
		stoneAdapter2.died();
		System.out.println();
//	
	}
}
