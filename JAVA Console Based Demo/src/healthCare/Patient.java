package healthCare;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Patient
{
	String aadhar;
	
	
	
	Patient(String aadhar_id)
	{
		this.aadhar = aadhar_id;
	}



	public void openPatientMenu(String aadhar_id) throws SQLException, IOException
	{
		System.out.println("Press 1. to view Your medical History or Any other key to Exit.\n\n");
		int choice = (new Scanner(System.in)).nextInt();
		if(choice==1)
		{
			DatabaseOperation dbOperation = new DatabaseOperation();
			dbOperation.getHistoryDetails(aadhar_id);
		}
			
		
		
		
	}
	
	

}
