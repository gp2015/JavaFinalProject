public class Main 
{
	public static void main(String[] args) {
		Student george = new Student();
		george.setProperties(420, "biff", "biffson", "biff@biffson.com", 10, 100, 99, 98, 97);
		System.out.println(george.getProperties());
		System.out.println(george.grades);
	}
}