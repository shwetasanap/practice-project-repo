public class Oneplus5 implements Phones{
 
	@Override
	public String processor() {
		
		return "SD835";
	}
 
	@Override
	public String OS() {
		
		return "Android";
	}
 
	@Override
	public int spaceInGB() {
		
		return 64;
	}
	
	public void Msg()
	{
		System.out.println("you are calling oneplus5");
	}
	
}