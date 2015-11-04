import java.util.ArrayList;

public class Roster {
	
	public static ArrayList<Student> roster = new ArrayList<>();
	
	public static void add(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3)
	{
		roster.add(new Student(studentID, firstname, lastname, emailaddress, age, grade1, grade2, grade3));
	};
	
	public static void remove(String studentID)
	{
		for (int i = 1; i < roster.size(); i++)
		{
			if (roster.get(i-1).getID().equals(studentID))
			{
				System.out.println("Removed " + roster.get(i-1).getFirstname() + " " + roster.get(i-1).getLastname() + " from the roster.");
				roster.remove(roster.get(i-1));
			}
			else if (i == roster.size() - 1)
			{
				System.out.println("Error: Student ID " + studentID + " not found!");
			}
			else
			{
				continue;
			}
		}
	};
	
	public static void print_all()
	{
		String output = "";
		
		for (int i = 0; i < roster.size(); i++)
		{
			output += roster.get(i).getID() + "\tFirst Name: " + roster.get(i).getFirstname() + "\tLast Name: " + roster.get(i).getLastname() + "\tAge: " + roster.get(i).getAge() + "\t\t" + "Grades: " + roster.get(i).getGrades() + "\n"; // Have to use 2 \t after age because of int?
		};
		
		System.out.println(output);
	};

	public static void print_average_grade(String studentID)
	{
		for (int i = 0; i < roster.size(); i++)
		{
			if (roster.get(i).getID().equals(studentID))
			{ 
				float total = 0;
				float average = 0;
				
				for (int j = 0; j < roster.get(i).grades.length; j++)
				{ 
					total += roster.get(i).grades[j];
					average = total / roster.get(i).grades.length;
				}
				System.out.println(roster.get(i).getFirstname() + " " + roster.get(i).getLastname() + "'s rounded grade average: " + Math.round(average));
			}
			else {
				continue;
			};
		};
	};
	
	public static void print_invalid_emails()
	{
		String invalidEmails = "";
		
		for (int i = 0; i < roster.size(); i++)
		{
			if (roster.get(i).getEmail().indexOf('@') == -1 && roster.get(i).getEmail().indexOf('.') == -1 || roster.get(i).getEmail().indexOf(' ') > -1)
			{
				invalidEmails += roster.get(i).getEmail() + "\n";
			};
		};
		
		if (invalidEmails.length() > 0)
		{
			System.out.println("Invalid email addresses:\n" + invalidEmails);
		};
	};
};