import java.util.Arrays;

public class Student 
		{
			
			protected String studentID;
			protected String firstName;
			protected String lastName;
			protected String email;
			protected String age;
			protected String[] grades = new String[3];
			
			// Student object property setter
			public Student(String studentArr)
			{
				String[] student = studentArr.split(",\\s+");
				
				this.studentID = student[0].replace("[", "");
				this.firstName = student[1];
				this.lastName = student[2];
				this.email = student[3];
				this.age = student[4];
				this.grades[0] = student[5];
				this.grades[1] = student[6];
				this.grades[2] = student[7].replace("]", "");
			}
			
			// Student ID setter / mutator
			public void setID(String studentID)
			{
				this.studentID = studentID;
			}
			
			// Student ID getter / accessor
			public String getID()
			{
				return this.studentID;
			}
			
			// Student first name setter / mutator
			public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}
			
			// Student first name getter / accessor
			public String getFirstName()
			{
				return this.firstName;
			}
			
			// Student last name setter / mutator
			public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}
			
			// Student last name getter / accessor
			public String getLastName()
			{
				return this.lastName;
			}			
			
			// Student email setter / mutator
			public void setEmail(String email)
			{
				this.email = email;
			}
			
			// Student email getter / accessor
			public String getEmail()
			{
				return this.email;
			}			
			
			// Student age setter / mutator
			public void setAge(String age)
			{
				this.age = age;
			}
			
			// Student age getter / accessor
			public String getAge()
			{
				return this.age;
			}			
			
			// Student grades setter / mutator
			public void setGrades(String grade0, String grade1, String grade2)
			{
				this.grades[0] = grade0;
				this.grades[1] = grade1;
				this.grades[2] = grade2;
			}
			
			// Student grades getter / accessor
			public String getGrades()
			{	
				return Arrays.toString(this.grades);
			}
			
			public Object getProperties()
			{
				String properties;
				properties = this.getID() + " " + this.getFirstName() + " "  + this.getLastName() + " "  + this.getEmail() + " "  + this.getAge() + " "  + this.getGrades();
				return properties;
			}
			
		}
