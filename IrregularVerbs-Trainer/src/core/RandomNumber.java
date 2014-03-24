package core;


public class RandomNumber {
	
	
	public RandomNumber(int from, int to){
		
	}
	
	public static int createNewDigit(int from, int to)
	{
		to++;
		return (int) (Math.random() * (to - from) + from);
	}

}
