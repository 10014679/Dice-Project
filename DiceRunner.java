public class DiceRunner{
	public static void main(String[]args){

		//Test 1

			Die dice1=new Die();
			Die dice2=new Die();
			int counter = 0;

			do{
				dice1.roll();
				dice2.roll();
				counter++;
				System.out.println(	dice1	);
				System.out.println(	dice2	);
				if(dice1.getValue()==1 && dice2.getValue()==1){
					break;
				}
			}while(dice1.getValue()!=1 || dice2.getValue()!=1);

			System.out.println("It took "+counter+" times");
			System.out.println();
		//Test 2
			DieHolder holder = new DieHolder();

			for(int i = 0; i < 7; i++){
				int rannum = (int)((Math.random()*20)+1);
				int x = holder.addDie(new Die(rannum));
				if(x!=-1)
					System.out.println(	holder	);
				System.out.println(x);
				System.out.println();
			}
			holder.shake();
			System.out.println("After Shaking the DiceHolder:");
			System.out.println(	holder	);
	}
}