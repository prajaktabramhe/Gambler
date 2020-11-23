package GamblerPackage;
public class Gambler
{
	public static int EveryDayStake = 100, EveryGame = 1;
	public void bet()
	{
		EveryDayStake=EveryDayStake-1;
	}
	public void resign(int i)
	{
		double stakepercentage;
		stakepercentage = i - (i * 0.5);
		System.out.println("50% of the stakes are:"+stakepercentage);
	}
	public static void main(String[] args)
	{
		
		Gambler person=new Gambler();
		person.bet();
		person.resign(100);
	}

}