package healthCare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Blob;

public class DatabaseOperation
{
	private Connection connect() 
    {
    	Connection connection = null;
    	try 
    	{
            Class.forName("com.mysql.jdbc.Driver");     
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthdatabase?useSSL=false","root","12345");

	    }
    	catch (SQLException e)
    	{
            connection = null;
            System.out.println("Connection Interrputed!!!!!");
    	}
    	catch (ClassNotFoundException e)
    	{
			e.printStackTrace();
		}
    	return connection;
	}
	
	
	public boolean checkLoginInfo(String username, String password)
	{

    	Connection conn = connect();
    	String sqlQuery = " SELECT username, password FROM doctor_info";
		try 
		{
			PreparedStatement stmt = conn.prepareStatement(sqlQuery);
			String dbUsername, dbPassword;
			ResultSet result =  stmt.executeQuery(sqlQuery);
			while(result.next())
			{
                dbUsername = result.getString("username");
                dbPassword = result.getString("password");

                if(dbUsername.equals(username) && dbPassword.equals(password))
                {
                    return true;

                }    
			}
			return false;
         }	
		catch (SQLException e) 
		{
			e.printStackTrace();
			return false;
		}
		
	}


	public void UpdateReports(String filePath, String aadhar_id, String username) throws SQLException, FileNotFoundException 
	{
		Connection connection = connect();
		System.out.println("Enter the type of Disease:\t");
		String disease = (new Scanner(System.in)).next();
		File image = new File(filePath);
		PreparedStatement psmnt = connection.prepareStatement
				("insert into patient(aadhar_id, med_reports, prev_suffering, upload_doctor_username) "+ "values(?,?,?,?)");
		psmnt.setString(1, aadhar_id);
		FileInputStream fis = new FileInputStream(image);
		psmnt.setBinaryStream(2, (InputStream)fis, (int)(image.length()));
		psmnt.setString(3, disease);
		psmnt.setString(4, username);
		psmnt.executeUpdate();
		
	}


	public void getHistoryDetails(String pat_id) throws SQLException, IOException
	{
		File file=new File("D:\\"+pat_id+".jpg");
        FileOutputStream fos=new FileOutputStream(file);
        byte b[];
        Blob blob;
		String sqlQuery = "SELECT * FROM patient where aadhar_id = ?";
		Connection con = connect();
		PreparedStatement psmnt = con.prepareStatement(sqlQuery);
		psmnt.setString(1, pat_id);
		ResultSet result = psmnt.executeQuery();
		while(result.next())
		{
            blob=(Blob) result.getBlob(2);
            b=blob.getBytes(1,(int)blob.length());
            fos.write(b);
        }
		System.out.println("Check D drive on your Computer to Find Reports of Patient\n\n");

	
	}
	
}
