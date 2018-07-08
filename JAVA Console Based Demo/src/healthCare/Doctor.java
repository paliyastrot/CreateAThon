package healthCare;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Doctor
{
	String userName;
	String password;
	String patient_id;
	boolean login ;
	
	Doctor(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}
	
	
	void openDoctorMenu(String pat_id, String doc_username) throws SQLException, IOException
	{
		while(true)
		{
			System.out.println("1.Get Patient Medical History\n2.Update Patient Report\n3.Another Patient\n");
			int choice = (new Scanner(System.in)).nextInt();
			switch(choice)
			{
				case 1:
					getHistory(pat_id);
					break;
				case 2:
					updateReports(doc_username, pat_id);
					break;
				case 3: 
					return;
			}	
		}
	}
	
	
	
	boolean login(String username, String password)
	{
		DatabaseOperation dbOperation = new DatabaseOperation();
		if(dbOperation.checkLoginInfo(username, password))
		{
			System.out.println("Login Successfull");
			return true;
		}
		else
		{
			System.out.println("Login Failed");
			return false;
		}
	}
	
		
	void updateReports(String doc_username, String pat_id)
	{
		System.out.println("Enter the File Path");
		String filePath = (new Scanner(System.in)).next();
		DatabaseOperation dbOperation = new DatabaseOperation();
		try 
		{
			dbOperation.UpdateReports(filePath, pat_id, doc_username);
			System.out.println("Details Successfully Updated");
		} 
		catch (Exception e)
		{
		
			System.out.println("Updation Failed");
			e.printStackTrace();
		} 
	}

	
	
	void getHistory(String pat_id) throws SQLException, IOException
	{
		DatabaseOperation dbOperation = new DatabaseOperation();
		dbOperation.getHistoryDetails(pat_id);
	}


	

}
