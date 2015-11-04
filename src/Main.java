import java.util.Arrays;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) {
		
		// test constructor
		String georgeString = "10, firstName, lastName, email@domain.com, 10, 100, 99, 98";
		Student george = new Student(georgeString);
		System.out.println(george.getProperties());
		
		String[] students = {
				"1, John, Smith, John1989@gmail.com, 20, 88, 79, 59",
				"2, Suzan, Erickson, Erickson_1990@gmail.com, 19, 91, 72, 85",
				"3, Jack, Napoli, The_lawyer99@yahoo.com, 19, 85, 84, 87",
				"4, Erin, Black, Erin.black@comcast.net, 22, 91,98, 82",
				"5, George, Perez, gpere17@wgu.edu, 25, 98, 99, 100"
		};
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		for (String studentRecord : students)
		{
			String[] studentStringAsArr = studentRecord.split(",");
			String studentString = Arrays.toString(studentStringAsArr);
			studentList.add(new Student(studentString));
		}
		
		for (int i = 0; i < studentList.size(); i++)
		{
			System.out.println(studentList.get(i).getGrades());
		}
		
		Student tester = studentList.get(0);
		
		System.out.println(tester.getID());
		studentList.get(0).setID("12345");
		System.out.println(tester.getID());
		
		System.out.println(tester.getFirstName());
		tester.setFirstName("Donald");
		System.out.println(tester.getFirstName());
		
		System.out.println(tester.getLastName());
		tester.setLastName("Trump");
		System.out.println(tester.getLastName());
		
		System.out.println(tester.getEmail());
		tester.setEmail("pp@aol.com");
		System.out.println(tester.getEmail());
		
		System.out.println(tester.getAge());
		tester.setAge("122");
		System.out.println(tester.getAge());
		
		System.out.println(tester.getGrades());
		tester.setGrades("12399", "141", "1231541235");
		System.out.println(tester.getGrades());
		
	}
}