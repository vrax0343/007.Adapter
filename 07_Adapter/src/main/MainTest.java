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
		System.out.println("1. �߸� ������ �������� �����Ѵ�");
		System.out.println("=======================================================");
		
		Unit knight = new Knight();
		Unit mage = new Mage();
		Unit citizen = new Citizen();
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("2. ������ ������ ��� 60, 60���� �̵��Ѵ�.");
		System.out.println("=======================================================");
		
		knight.move2(60, 60);
		System.out.print("��� ��ġ: ");
		Move.moveLocation(knight, 60, 60);
		mage.move2(60, 60);
		System.out.print("������ ��ġ: ");
		Move.moveLocation(mage, 60, 60);
		citizen.move2(60, 60);
		System.out.print("�ù� ��ġ: ");
		Move.moveLocation(citizen, 60, 60);
		System.out.println();

		
		System.out.println("=======================================================");
		System.out.println("3. (30,30) - (50, 50) �� ������ �����Ѵ�.");
		System.out.println("=======================================================");
		
		Village village = new Village(30, 30, 50, 50);
		System.out.println(village.toString());
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("4. �ù��� ���������� ����.");
		System.out.println("=======================================================");
		
		village.enterVillage(citizen);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. ��簡 ���������� ����.");
		System.out.println("=======================================================");
		
		village.enterVillage(knight);
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. ���� ���� ���� ");
		System.out.println("=======================================================");
	
		village.inspection();
		System.out.println(village.toString());
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("7. ������ �Ϲ� ���� �����Ͽ� ũ�⸦ ����Ѵ�.");
		System.out.println("=======================================================");
		StoneClass stone = new StoneClass();
		village.enterVillage(stone);
		System.out.print("������ ü����: ");
		System.out.println(stone.getHealth());
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("8. �������� ����õ� ���� ����.");
		System.out.println("=======================================================");
		StoneClass stone2 = new StoneClass();
		Unit stoneAdapter2 = new StoneAdaptor(stone2);
		System.out.println(stoneAdapter2);
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("9. ������ �����Ѵ�.");
		System.out.println("=======================================================");
		stoneAdapter2.fight();
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("10. ������ �̵��Ѵ�. ");
		System.out.println("=======================================================");
		stoneAdapter2.move(1, 2);
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("11. ������ Ư���ɷ��� �����Ѵ�.");
		System.out.println("=======================================================");
		stoneAdapter2.specialAbility();
		System.out.println();

		
		System.out.println("=======================================================");
		System.out.println("12. ������ ũ�⸦ ����ѵ� �״´�.");
		System.out.println("=======================================================");
		stoneAdapter2.died(village);
		System.out.println();

	}
}
