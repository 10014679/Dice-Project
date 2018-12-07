import java.util.ArrayList;
import java.lang.Math;
public class DieHolder{

	private ArrayList<Die> cup;

	public DieHolder(){
			cup = new ArrayList<>();
	}

	public int addDie(Die die){
		if(cup.size()<6){
			cup.add(die);
			return 1;
		}
			return -1;
	}

	public void shake(){
		for(int i = 0; i < cup.size(); i++)
			(cup.get(i)).roll();
	}

	public String toString(){
		String dieinfo = "";
		for(int i = 0; i < cup.size(); i++)
			dieinfo += (cup.get(i)).toString();
		return dieinfo;
	}
}
