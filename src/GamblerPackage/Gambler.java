package GamblerPackage;
import java.util.Random;
public class Gambler
{
	public static int EveryDayStake = 100, EveryGame = 1;
	public void bet()
	{
		EveryDayStake=EveryDayStake-1;
	}
	public void calculateresign()
	{
		double stakepercentage;
		Random rand=new Random();
		int i=1;
		while (i<=20)
		{
			System.out.println("day:"+i);
			int temp = rand.nextInt(2);
			if(temp==1)
			{
				EveryDayStake=EveryDayStake+1;
				System.out.print("won today by 1 ");
			}
			else
			{
				EveryDayStake=EveryDayStake-1;
				System.out.print("lost today by 1  ");
			}
			System.out.println("total amount "+EveryDayStake);
			i++;
		}
	}
	public static void main(String[] args)
	{
		
		Gambler person=new Gambler();
		person.bet();
		person.calculateresign();
	}

}