public class Main 
{
	public static void main(String[] args) {
		
		String[] students = {
				"1, John, Smith, John1989@gmail.com, 20, 88, 79, 59",
				"2, Suzan, Erickson, Erickson_1990@gmail.com, 19, 91, 72, 85",
				"3, Jack, Napoli, The_lawyer99@yahoo.com, 19, 85, 84, 87",
				"4, Erin, Black, Erin.black@comcast.net, 22, 91, 98, 82",
				"5, George, Perez, gpere17wgued u, 25, 98, 99, 100"
		};	
		
		for (int i = 0; i < students.length; i++)
		{
			String studentRecordString = students[i];
			studentRecordString.replace(" ", "");
			String[] studentRecordArr = studentRecordString.split(", ");
			
			Roster.add(studentRecordArr[0], studentRecordArr[1], studentRecordArr[2], studentRecordArr[3], Integer.parseInt(studentRecordArr[4]), Integer.parseInt(studentRecordArr[5]), Integer.parseInt(studentRecordArr[6]), Integer.parseInt(studentRecordArr[7]));
		
		};
		
		Roster.print_all();
		Roster.print_invalid_emails();
		
		for (Student record : Roster.roster)
		{
			Roster.print_average_grade(record.getID());
		};
		
		System.out.println("");
		
		Roster.remove("3");
		Roster.remove("3");
		
	};
};