package adapter;

public interface StoneInterface {
	public void fight();
	public void move(int x, int y);
	public int getHealth();
	public void printLocation();
	public int getLocationX();
	public int getLocationY();
	public void specialAbility();
	public void died();
}
