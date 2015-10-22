public class Student 
		{
			
			int studentID;
			String firstName;
			String lastName;
			String email;
			int age;
			int[] grades = new int[4];
			
			// Student object property setter
			public void setProperties(int studentID, String firstName, String lastName, String email, int age, int grade0, int grade1, int grade2, int grade3) 
			{
				this.studentID = studentID;
				this.firstName = firstName;
				this.lastName = lastName;
				this.email = email;
				this.age = age;
				this.grades[0] = grade0;
				this.grades[1] = grade1;
				this.grades[2] = grade2;
				this.grades[3] = grade3;
			}
			
			// Student ID getter
			public int getID()
			{
				return this.studentID;
			}
			
			// Student first name getter
			public String getFirstName()
			{
				return this.firstName;
			}
			
			// Student last name getter
			public String getLastName()
			{
				return this.lastName;
			}			
			
			// Student email getter
			public String getEmail()
			{
				return this.email;
			}			
			
			// Student age getter
			public int getAge()
			{
				return this.age;
			}			
			
			// Student grades getter
			public int[] getGrades()
			{	
				return this.grades;
			}
			
			public Object getProperties()
			{
				String properties;
				properties = "Records: " + this.getID() + " " + this.getFirstName() + " " + this.getLastName() + " " + this.getEmail() + " " + this.getAge() + " " + this.getGrades() + ".";
				return properties;
			}
			
		}
