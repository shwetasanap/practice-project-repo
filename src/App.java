#hi there
class Outer {
	
	
	public static class Inner {
        private static int x = 0;
        
		public static int getX() {
			return x;
		}
		public static void setX(int x) {
			Inner.x = x;
		}
		public void testingInnerMethod() {
			System.out.println("Testing inner class method.");
		}
	}

}
public class App {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.testingInnerMethod();
        System.out.println(Outer.Inner.getX());
        Outer.Inner.setX(10);
        System.out.println(Outer.Inner.getX());
		Outer.Inner inner1 = new Outer.Inner();
		
		System.out.println(Outer.Inner.getX());
        Outer.Inner.setX(50);
        System.out.println(Outer.Inner.getX());

	}

}
