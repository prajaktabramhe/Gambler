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
		while (true)
		{
			int temp = rand.nextInt(2);
			System.out.println(temp);
			if(temp==1)
			{
				EveryDayStake=EveryDayStake+1;
			}
			else
			{
				EveryDayStake=EveryDayStake-1;
			}
			
			if(EveryDayStake==150)
			{
				System.out.println(EveryDayStake+":won done for the day");
				break;
			}
			else if(EveryDayStake==50)
			{
				System.out.println(EveryDayStake+":lose done for the day");
				break;
			}
		}
	}
	public static void main(String[] args)
	{
		
		Gambler person=new Gambler();
		person.bet();
		person.calculateresign();
	}

}