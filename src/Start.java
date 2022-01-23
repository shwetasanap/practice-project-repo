public class Start {

	public static void main(String[] args) {
		
		Phone phone = new Phone("Phone");
		System.out.println(phone.getModel());
		phone.features();


		
		
		Phone note8 = new SamsungNote8("Note 8");
		System.out.println(note8.getModel());
		note8.features();
		
		
		
		////Phone nokia3310 = new Nokia3310("Nokia 3310");
		//System.out.println(nokia3310.getModel());
		//nokia3310.features();
		
		
	}

}