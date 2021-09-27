package login;

import java.io.FileInputStream;

import java.util.Properties;

public class App 
{
	public boolean userLogin(String username,String password)
	{
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream("src/main/resources/credentials.property"));
		} 
		catch (Exception e)
		{
			System.out.println("error with file reading");
		}
		String un=prop.getProperty("username");
		String pwd=prop.getProperty("password");
		
		if(username.equals(un)&&password.equals(pwd))
			return true;
		else
			return false;
	}

}
