package healthCare;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass
{
	public static void main(String args[]) throws SQLException, IOException
	{
		DatabaseOperation op = new DatabaseOperation();
		op.checkLoginInfo("s1234", "str");
		Scanner scan = new Scanner(System.in);
		System.out.println("Press 1. for Doctor login");
		System.out.println("Press 2. for Patient login");
		int choice = scan.nextInt();
		if(choice==1)
		{
			System.out.println("Enter username :\t" );
			String user = scan.next();
			System.out.println("Enter password : \t");
			String pass = scan.next();
			Doctor doc = new Doctor(user, pass);
			while(true)
			{
				if(doc.login(user, pass))
				{
					System.out.println("Enter Patient ID : ");
					String pat_id = scan.next();
					doc.openDoctorMenu(pat_id, user);
				}
				else
					break;
			}
		}
		else if(choice==2)
		{
			System.out.println("Enter AADHAR ID");
			String aadhar_id = scan.next();
			Patient pat = new Patient(aadhar_id);
			pat.openPatientMenu(aadhar_id);
		}
		else
			System.out.println("Enter Correct Choice.");
	}

}
