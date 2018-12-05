public class Die{
	private int sides;
	private int value;

	public Die(){
		sides=6;
		value=(int)(Math.random()*sides)+1;
	}
	public Die(int sides, int value){
		this.sides=sides;
		value=(int)(Math.random()*sides)+1;

	}
	public int getSide(){
		return sides;
	}
	public int getValue(){
		return value;
	}
	public void roll(int value){
		value=(int)(Math.random()*sides)+1;
	}
	public String toString(){
		return "Number of sides: "+sides+"\nValue: "+value;
	}
}
