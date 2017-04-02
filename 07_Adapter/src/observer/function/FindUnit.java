package observer.function;

import java.util.ArrayList;
import java.util.Iterator;

import singleton.function.Print;
import singleton.unit.SingletonUnit;
import strategy.check.MapLimitCheck;
import strategy.unit.Unit;


public class FindUnit {
	int x=0, y=0;
	
	public FindUnit() { }
	public FindUnit(SingletonUnit u, int x, int y){
		MapLimitCheck mlc = new MapLimitCheck();
		int tempX=u.getLocationX(), tempY=u.getLocationY();
		
		tempX += x;
		tempY += y;
		
		u.setLocation(mlc.check(tempX), mlc.check(tempY));
	}
	
	public static Unit findOneByType(ArrayList<Unit> unitList,String type){
		Iterator<Unit> iterator = unitList.iterator();
		Unit tempUnit = null;
		while(iterator.hasNext()){
			tempUnit = iterator.next();
			if(tempUnit.getType().equals(type)){
				return tempUnit;
			}
		}
		return null;
	}
	public SingletonUnit findByIndex(ArrayList<SingletonUnit> unitList,int index){
		if(index < 0 || index > unitList.size()) return null;
		return unitList.get(index);
	}	
}
