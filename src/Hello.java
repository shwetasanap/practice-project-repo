
public class Hello {
	public static void main(String[] args) {
		Phones phone = new Oneplus5();
		Oneplus5 o = new Oneplus5();

		System.out.println("Processor: "+phone.processor());
		System.out.println("Space in GB: "+phone.spaceInGB());
		o.Msg();;
	}
}