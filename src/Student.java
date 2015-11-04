import java.util.Arrays;

public class Student 
		{
			
			protected String studentID;
			protected String firstname;
			protected String lastname;
			protected String emailaddress;
			protected int age;
			protected int[] grades = new int[3];
			
			// Student object property setter
			public Student(String studentID, String firstname, String lastname, String emailaddress, int age, int grade1, int grade2, int grade3)
			{
				this.studentID = studentID;
				this.firstname = firstname;
				this.lastname = lastname;
				this.emailaddress = emailaddress;
				this.age = age;
				this.grades[0] = grade1;
				this.grades[1] = grade2;
				this.grades[2] = grade3;
			};
			
			// Student ID setter / mutator
			public void setID(String studentID)
			{
				this.studentID = studentID;
			};
			
			// Student ID getter / accessor
			public String getID()
			{
				return this.studentID;
			};
			
			// Student first name setter / mutator
			public void setFirstname(String firstname)
			{
				this.firstname = firstname;
			};
			
			// Student first name getter / accessor
			public String getFirstname()
			{
				return this.firstname;
			};
			
			// Student last name setter / mutator
			public void setLastname(String lastname)
			{
				this.lastname = lastname;
			};
			
			// Student last name getter / accessor
			public String getLastname()
			{
				return this.lastname;
			};		
			
			// Student email setter / mutator
			public void setEmail(String email)
			{
				this.emailaddress = email;
			};
			
			// Student email getter / accessor
			public String getEmail()
			{
				return this.emailaddress;
			};		
			
			// Student age setter / mutator
			public void setAge(int age)
			{
				this.age = age;
			};
			
			// Student age getter / accessor
			public int getAge()
			{
				return this.age;
			};		
			
			// Student grades setter / mutator
			public void setGrades(int grade0, int grade1, int grade2)
			{
				this.grades[0] = grade0;
				this.grades[1] = grade1;
				this.grades[2] = grade2;
			};
			
			// Student grades getter / accessor
			public String getGrades()
			{	
				return Arrays.toString(this.grades);
			};
			
			public Object getProperties()
			{
				String properties;
				properties = this.getID() + " " + this.getFirstname() + " "  + this.getLastname() + " "  + this.getEmail() + " "  + this.getAge() + " "  + this.getGrades();
				return properties;
			};
			
		};
