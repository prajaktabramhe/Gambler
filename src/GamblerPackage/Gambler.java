package GamblerPackage;
public class Gambler
{
	public static int EveryDayStake = 100, EveryGame = 1;
	public void bet()
	{
		EveryDayStake=EveryDayStake-1;
	}
	
	public static void main(String[] args)
	{
		
		Gambler person=new Gambler();
		person.bet();
	}

}
