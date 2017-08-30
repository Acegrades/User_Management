package com.acegrades.constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class User_Mang 
{
	public static WebDriver driver;
	public static String url="http://dev.internal.acegrades.com";
	
	public static String loginuname="praveenaa9@gmail.com"; // <-
	public static String loginpwd="abcd1234";
	public static String lu="praveenaa9@gmail.com"; // <-
	public static String lp="abcd1234";
	public static String loginpuname="praveenn9@gmail.com"; // <-
	public static String loginppwd="abcd1234";
	public static String onlylogin="pqrstu@gmail.com";
	public static String email="pqrstu@gmail.com";
	public static String pwd="123456";
	public static String alreadynuname="praveena120@gmail.com";
	public static String alreadypwd="abcd1234";
	public static String uname="praveenaut@gmail.com";//below pwd required purpose
	public static String belowpwd="abcd";
	public static String Teditprofilelogin="praveenaa9@gmail.com"; // <-
	public static String Teditprofilepwd="abcd1234";
	public static String Peditprofilelogin="praveenn9@gmail.com";  // <-
	public static String Peditprofilepwd="abcd1234";
	public static String rosteremail="praveena68@gmail.com";
	public static String rosterpwd="abcd1234";
	public static String duprosteremail="praveena68@gmail.com";
	public static String duprosterpwd="abcd1234";
	public static String rosteredituname="praveena68@gmail.com";
	public static String rostereditpwd="abcd1234";
	public static String oldpwdwrongemail="praveenaa9@gmail.com"; // <-
	public static String oldpwdwrong="abcd1234";
	public static String oldpwdnotemail="praveenaa9@gmail.com"; // <-
	public static String oldpwdnotgiven="abcd1234";
	public static String confirmpwdemail="praveenaa9@gmail.com"; // <-
	public static String confirmpwd="abcd1234";
	public static String minlepwdemail="praveenaa9@gmail.com"; // <-
	public static String minlenpwd="abcd1234";
	public static String rosterlastname="praveenaa9@gmail.com"; // <-
	public static String rosterlastpwd="abcd1234";
	public static String dupename="praveenaa9@gmail.com"; // <-
	public static String duppwd="abcd1234";
	public static String editoptionname="praveenaa9@gmail.com"; // <-
	public static String editoptionpwd="abcd1234";
	public static String editminname="praveenaa9@gmail.com"; // <-
	public static String editminpwd="abcd1234";
	public static String editnlastname="praveenaa9@gmail.com"; // <-
	public static String editlastpwd="abcd1234";
	public static String beloweditnlastname="praveenaa9@gmail.com"; // <-
	public static String editlastnamepwd="abcd1234";
	

	
	    public void LaunchApp()
	    {
	    	driver=new FirefoxDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	driver.get(url);
	    	
	    }
	    //1.Create a New Teacher User
	    public int TC_4(String uname,String pwd)
	    {
	      driver.findElement(By.partialLinkText("SIGNU")).click();
      	  driver.findElement(By.id("email")).sendKeys(uname);
      	  driver.findElement(By.id("password")).sendKeys(pwd);
      	  //driver.findElement(By.className("btn btn--main btn-large")).click();
      	  driver.findElement(By.xpath("//div/div/div[2]/form/button")).click();
      	 
      	  if (driver.findElement(By.linkText("Log in")).isDisplayed()) 
      	  {
      		  return 0;
			
		} else {

		}
 
      	  return 1;
      	     }
	    
	   //2.Create Account and Complete Profile for tutor with success message
	    public int TC_42(String login,String pwd)
	    {
	    	
	      driver.findElement(By.linkText("LOG IN")).click();
	      driver.findElement(By.id("email")).sendKeys(login);
      	  driver.findElement(By.id("password")).sendKeys(pwd);
      	  driver.findElement(By.id("loginId")).click();
      	  
	      driver.findElement(By.id("name")).sendKeys("Teacher Student");
       	  driver.findElement(By.className("select-dropdown")).click();
       	  Sleeper.sleepTight(3000);
       	  driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div/ul/li[3]/span")).click();
       	  driver.findElement(By.id("zip")).sendKeys("zph123");
       	  driver.findElement(By.id("school")).sendKeys("abcd");
       	  //driver.findElement(By.className("select-dropdown")).click();
       	  driver.findElement(By.xpath("//div[2]/div[4]/div[1]/div/input")).click();
       	  driver.findElement(By.xpath("//div[2]/div[4]/div[1]/div/ul/li[4]/span")).click();
       	  //driver.findElement(By.className("ng-pristine ng-valid ng-touched")).sendKeys("First");
       	  driver.findElement(By.xpath("//form/div[1]/div[2]/div[4]/div[2]/input")).sendKeys("First");
       	  //driver.findElement(By.className("btn btn--medium")).click();
       	  driver.findElement(By.xpath("//div/div[3]/div/div/button")).click();
       	 
           if (driver.findElement(By.linkText("HOME")).isDisplayed()) 
           {
        	   
         	  return 0;
         	 
				
			} else 
			{
				
			  return 1;

			}	    	
	    }
	    //3.Create Account and Complete Profile for parent with success message.
	    public int TC_43(String puname,String ppwd)
	    {
	    	
	     driver.findElement(By.linkText("SIGNUP")).click();
	     driver.findElement(By.xpath("//main/div/div/div/ul/li[2]/a")).click();
	     driver.findElement(By.id("email")).sendKeys(puname);
     	 driver.findElement(By.id("password")).sendKeys(ppwd);
     	 //driver.findElement(By.className("btn btn--main btn-large")).click();
     	 driver.findElement(By.xpath("//div/div/div[2]/form/button")).click();
     	 driver.findElement(By.id("name")).sendKeys("Parent Praveen");
     	 driver.findElement(By.id("conn_id")).sendKeys("83E8DC5DE2A0B091");
     	 driver.findElement(By.xpath("//div/div/div/div[3]/div/div/button")).click();
     	
     	 if (driver.findElement(By.linkText("HOME")).isDisplayed())
     	 {
     		 return 0;
			
		} 
     	
             return 1;
		}
	   //4.Create Account when neither email nor password is given
	    public int TC_44(String login)
	    {
	    	  driver.findElement(By.linkText("LOG IN")).click();
		      driver.findElement(By.id("email")).sendKeys(login);
	      	  //driver.findElement(By.id("password")).sendKeys(pwd);
	      	  driver.findElement(By.id("loginId")).click();
	      	  
	      	   if (driver.findElement(By.xpath("//div/div/div[2]/form/div[1]")).isDisplayed())
	      	   {
	      		   return 0;
				
			} else 
			{
				 return 1;
			}
	      	  
	      	  
	      	 
	    	
	    }
	    //5.Create Account when Email is given but password is not given.
	    public int TC_45(String email)
	    {
	    	driver.findElement(By.linkText("LOG IN")).click();
		    driver.findElement(By.id("email")).sendKeys(email);
		    driver.findElement(By.id("loginId")).click();
		    
		    if (driver.findElement(By.xpath("//div/div/div[2]/form/div[1]")).isDisplayed())
		    {
                return 0;
		    	
			} else
			{
				return 1;
			}
		   
		      
	    }
        //6.Create Account when Password is given but email is not given.
	    public int TC_46(String pwd)
	    {
	    	driver.findElement(By.linkText("LOG IN")).click();
	    	driver.findElement(By.id("password")).sendKeys(pwd);
	    	driver.findElement(By.id("loginId")).click();
	    	
	    	if (driver.findElement(By.xpath("//div/div/div/div[2]/form/div[1]")).isDisplayed())
	    	{
				
	    		return 0;
			} else
              {
				return 1;
			}	
	    }
	    //7.Create Account with already used username and password.
	    public int TC_47(String uname,String pwd)
	    {
	    	
	    	  driver.findElement(By.partialLinkText("SIGNU")).click();
	      	  driver.findElement(By.id("email")).sendKeys(uname);
	      	  driver.findElement(By.id("password")).sendKeys(pwd);
	      	  //driver.findElement(By.className("btn btn--main btn-large")).click();
	      	  driver.findElement(By.xpath("//div/div/div[2]/form/button")).click();
	      	  
	      	  if (driver.findElement(By.xpath("//div/div/div/div[2]/form/div[1]")).isDisplayed()) 
	      	  {
	      		  return 0;
				
			} else
			{
				 return 1;
			}
	      	  
	      	 
	      	 
	    }
	    //8.Create Account when using password below minimum length
	    public int TC_48(String uname,String pwd)
	    {
	    	driver.findElement(By.partialLinkText("SIGNU")).click();
	      	driver.findElement(By.id("email")).sendKeys(uname);
	      	driver.findElement(By.id("password")).sendKeys(pwd);
	      	driver.findElement(By.xpath("//div/div/div[2]/form/button")).click();
	      	
	      	if (driver.findElement(By.xpath("//div/div/div/div[2]/form/div[1]")).isDisplayed())
	      	{
				return 0;
	      		
			} else
			{
				return 1;
			}	
	    }
	    //9.Edit Profile for tutor with success message
	    public int  TC_49(String edname,String edpwd)
	    {
	        driver.findElement(By.linkText("LOG IN")).click();
	        driver.findElement(By.id("email")).sendKeys(edname);
	        driver.findElement(By.id("password")).sendKeys(edpwd);
	        driver.findElement(By.xpath("//div/div/div[2]/form/button")).click();
	        
	        driver.findElement(By.partialLinkText("Teacher Stude")).click();
	        driver.findElement(By.xpath("//div/header/div/div/ul/li[1]/a")).click();
	        driver.findElement(By.id("fullname")).clear();
	        driver.findElement(By.id("fullname")).sendKeys("Jamsa Bhai");
	        //driver.findElement(By.linkText("CHANGE")).click();
	        //driver.findElement(By.className("change edit")).click();
	        driver.findElement(By.xpath("//div[2]/div[5]/div[2]/form/div[3]/h4/a")).click();
	        driver.findElement(By.id("school")).clear();
	        driver.findElement(By.id("school")).sendKeys("Info");
	        //driver.findElement(By.linkText("CHANGE")).click();
	        //driver.findElement(By.className("change edit")).click();
	        /*driver.findElement(By.xpath("//div[2]/div[5]/div[2]/form/div[4]/h4/a")).click();
	        driver.findElement(By.id("oldpassword")).clear();
	        driver.findElement(By.id("oldpassword")).sendKeys("abcd1234");
	        driver.findElement(By.id("newpassword")).clear();
	        driver.findElement(By.id("newpassword")).sendKeys("123456");
	        driver.findElement(By.id("confirmpassword")).clear();
	        driver.findElement(By.id("confirmpassword")).sendKeys("123456");*/
	        driver.findElement(By.xpath("//div/div[2]/div[5]/div[2]/div/button[1]")).click();
	        driver.findElement(By.xpath("//main/div[1]/div/div[2]/span")).click();
	        
	        if (driver.findElement(By.partialLinkText("Jamsa Bha")).isDisplayed())
	        {
				return 0;
	        	
			} else
			{
				return 1;
			}
	        
	        //driver.findElement(By.xpath("//div[2]/div[5]/div[2]/div/button[2]")).click();
	        
	       
	        	
	    }
	   //10.Edit Profile for parent with success message
	    public int TC_50(String puname,String ppwd)
	    {
	    	driver.findElement(By.linkText("LOG IN")).click();
	    	//driver.findElement(By.linkText("LOG IN")).click();
	        driver.findElement(By.id("email")).sendKeys(puname);
	        driver.findElement(By.id("password")).sendKeys(ppwd);
	        driver.findElement(By.xpath("//div/div/div[2]/form/button")).click();
	        
	        driver.findElement(By.partialLinkText("Parent Prav")).click();
	        driver.findElement(By.xpath("//div/header/div/div/ul/li[1]/a")).click();
	        driver.findElement(By.id("fullname")).clear();
	        driver.findElement(By.id("fullname")).sendKeys("Srinivas Shaik");
	        driver.findElement(By.xpath("//div[2]/div[5]/div[2]/form/div[3]/h4/a")).click();
	        driver.findElement(By.id("school")).clear();
	        driver.findElement(By.id("school")).sendKeys("Infofactors");
	        /*driver.findElement(By.xpath("//div[2]/div[5]/div[2]/form/div[4]/h4/a")).click();
	        driver.findElement(By.id("oldpassword")).clear();
	        driver.findElement(By.id("oldpassword")).sendKeys("abcd1234");
	        driver.findElement(By.id("newpassword")).clear();
	        driver.findElement(By.id("newpassword")).sendKeys("1234567");
	        driver.findElement(By.id("confirmpassword")).clear();
	        driver.findElement(By.id("confirmpassword")).sendKeys("1234567");*/
	        driver.findElement(By.xpath("//div/div[2]/div[5]/div[2]/div/button[1]")).click();
	        driver.findElement(By.xpath("//main/div[1]/div/div[2]/span")).click();
	        
	        if (driver.findElement(By.partialLinkText("Srinivas Shai")).isDisplayed()) 
	        {
	        	return 0;
				
			} else
			{
                 return 1;
			}
	    }
	   
	 //11.Edit Profile with Failure Message when old password is wrong. 
	    public int TC_51(String email,String  pwd) throws InterruptedException
	    {
	    	driver.findElement(By.linkText("LOG IN")).click();
	        driver.findElement(By.id("email")).sendKeys(email);
	        driver.findElement(By.id("password")).sendKeys(pwd);
	        driver.findElement(By.xpath("//div/div/div[2]/form/button")).click();
	        
	        driver.findElement(By.partialLinkText("Jamsa Bha")).click();
	        driver.findElement(By.xpath("//div/header/div/div/ul/li[1]/a")).click();
	        driver.findElement(By.xpath("//div[2]/div[5]/div[2]/form/div[4]/h4/a")).click();
	        driver.findElement(By.id("oldpassword")).clear();
	        driver.findElement(By.id("oldpassword")).sendKeys("abcd32145");
	        driver.findElement(By.id("newpassword")).clear();
	        driver.findElement(By.id("newpassword")).sendKeys("123456");
	        driver.findElement(By.id("confirmpassword")).clear();
	        driver.findElement(By.id("confirmpassword")).sendKeys("123456");
	        driver.findElement(By.xpath("//div/div[2]/div[5]/div[2]/div/button[1]")).click();
	        driver.findElement(By.xpath("//main/div[1]/div/div[2]/span")).click();
	        
	        if (driver.findElement(By.partialLinkText("Jamsa Bhai")).isDisplayed()) 
	        {
	        	return 0;
				
			} else
			{
                 return 1;
			}
	    }
	   //12.Edit Profile with Failure Message when old password is not given
	   public int  TC_52(String oldename,String lodpwd) throws InterruptedException
	    {
		    driver.findElement(By.linkText("LOG IN")).click();
	        driver.findElement(By.id("email")).sendKeys(oldename);
	        driver.findElement(By.id("password")).sendKeys(lodpwd);
	        driver.findElement(By.xpath("//div/div/div[2]/form/button")).click();
	        
	        driver.findElement(By.partialLinkText("Jamsa Bha")).click();
	        driver.findElement(By.xpath("//div/header/div/div/ul/li[1]/a")).click();
	        driver.findElement(By.xpath("//div[2]/div[5]/div[2]/form/div[4]/h4/a")).click();
	        driver.findElement(By.id("oldpassword")).clear();
	        driver.findElement(By.id("oldpassword")).sendKeys("");
	        driver.findElement(By.id("newpassword")).clear();
	        driver.findElement(By.id("newpassword")).sendKeys("123456");
	        driver.findElement(By.id("confirmpassword")).clear();
	        driver.findElement(By.id("confirmpassword")).sendKeys("123456");
	        driver.findElement(By.xpath("//div/div[2]/div[5]/div[2]/div/button[1]")).click();
	        driver.findElement(By.xpath("//main/div[1]/div/div[2]/span")).click();
	        
	        if (driver.findElement(By.partialLinkText("Jamsa Bhai")).isDisplayed()) 
	        {
				
	        	return 0;
			} else 
			{
                return 1;
			}
	      	  
	      	 
	      	   
	   //Here, i have doubt in this test case   	   
	    }
	   //13.Edit Profile with Failure Message when new and confirm password do not match.
	   
	    public int TC_53(String confirmename, String confirmpwd)
	     {
	    	  driver.findElement(By.linkText("LOG IN")).click();
		      driver.findElement(By.id("email")).sendKeys(confirmename);
	      	  driver.findElement(By.id("password")).sendKeys(confirmpwd);
	      	  driver.findElement(By.id("loginId")).click(); 
	      	  
	      	  
	      	driver.findElement(By.partialLinkText("Jamsa Bha")).click();
	        driver.findElement(By.xpath("//div/header/div/div/ul/li[1]/a")).click();
	        driver.findElement(By.xpath("//div[2]/div[5]/div[2]/form/div[4]/h4/a")).click();
	        driver.findElement(By.id("oldpassword")).clear();
	        driver.findElement(By.id("oldpassword")).sendKeys("abcd1234");
	        driver.findElement(By.id("newpassword")).clear();
	        driver.findElement(By.id("newpassword")).sendKeys("123456");
	        driver.findElement(By.id("confirmpassword")).clear();
	        driver.findElement(By.id("confirmpassword")).sendKeys("123456789");
	        driver.findElement(By.xpath("//div/div[2]/div[5]/div[2]/div/button[1]")).click();
	        driver.findElement(By.xpath("//main/div[1]/div/div[2]/span")).click();
	        
	        if (driver.findElement(By.partialLinkText("Jamsa Bhai")).isDisplayed()) 
	        {
				
	        	return 0;
			} else 
			{
                return 1;
			}  
	     } 
	    //14.Edit Profile with Failure Message when value of new and confirm password is below minimum length
	    public int TC_54(String minuname,String  minpwd)
	    {
	    	  driver.findElement(By.linkText("LOG IN")).click();
		      driver.findElement(By.id("email")).sendKeys(minuname);
	      	  driver.findElement(By.id("password")).sendKeys(minpwd);
	      	  driver.findElement(By.id("loginId")).click();
	      	  
	      	  
	      	driver.findElement(By.partialLinkText("Jamsa Bha")).click();
	        driver.findElement(By.xpath("//div/header/div/div/ul/li[1]/a")).click();
	        driver.findElement(By.xpath("//div[2]/div[5]/div[2]/form/div[4]/h4/a")).click();
	        driver.findElement(By.id("oldpassword")).clear();
	        driver.findElement(By.id("oldpassword")).sendKeys("abcd1234");
	        driver.findElement(By.id("newpassword")).clear();
	        driver.findElement(By.id("newpassword")).sendKeys("123");
	        driver.findElement(By.id("confirmpassword")).clear();
	        driver.findElement(By.id("confirmpassword")).sendKeys("123");
	        driver.findElement(By.xpath("//div/div[2]/div[5]/div[2]/div/button[1]")).click();
	        driver.findElement(By.xpath("//main/div[1]/div/div[2]/span")).click();
	        
	        if (driver.findElement(By.partialLinkText("Jamsa Bhai")).isDisplayed()) 
	        {
				
	        	return 0;
			} else 
			{
                return 1;
			}  	
	    }
	    //15.Add Roaster Failure Message if last name is not provided on clicking Add Students Button
	    public int TC_55(String rosername,String rosterpwd )
	    {
	    	
	    	  driver.findElement(By.linkText("LOG IN")).click();
		      driver.findElement(By.id("email")).sendKeys(rosername);
	      	  driver.findElement(By.id("password")).sendKeys(rosterpwd);
	      	  driver.findElement(By.id("loginId")).click();
	      	  
	      	  driver.findElement(By.partialLinkText("Click her")).click();
	      	  driver.findElement(By.id("new_students_txt")).sendKeys("Infofactors");
	      	  driver.findElement(By.xpath("//div/div[2]/form/div/div[3]/a[1]")).click();
	      	  driver.findElement(By.xpath("//div[3]/div/div/div[1]/div[3]/span")).click();
	      	  
	      	  if (driver.findElement(By.linkText("HOME")).isDisplayed()) 
	      	  {
	      		  return 0;
				
			} else 
			{
                   return 1;
			}
	    }
	    //16.Add Roaster Failure Message if duplicate student enteries are there on clicking add students button
	    public int TC_56(String dupename,String duppwd)
	    {
	    	  driver.findElement(By.linkText("LOG IN")).click();
		      driver.findElement(By.id("email")).sendKeys(dupename);
	      	  driver.findElement(By.id("password")).sendKeys(duppwd);
	      	  driver.findElement(By.id("loginId")).click();
	      	  
	      	  driver.findElement(By.partialLinkText("Click her")).click();
	      	  driver.findElement(By.id("new_students_txt")).sendKeys("Infofactors India");
	      	  driver.findElement(By.xpath("//div/div[2]/form/div/div[3]/a[1]")).click();
	      	  driver.findElement(By.id("new_students_txt")).sendKeys("Infofactors India");
	      	  driver.findElement(By.xpath("//div/div[2]/form/div/div[3]/a[1]")).click();
	      	  driver.findElement(By.xpath("//div/div/div[1]/div[1]/span")).click();
	      	  
	      	  if (driver.findElement(By.linkText("HOME")).isDisplayed())
	      	  {
	      		  return 0;
				
			} else
			{
                  return 1;
			}
	    }
	    
	    //17.Add Roaster Success Message with Edit option
	    public int TC_57(String editename,String editpwd)
	    {
	    	
	    	  driver.findElement(By.linkText("LOG IN")).click();
		      driver.findElement(By.id("email")).sendKeys(dupename);
	      	  driver.findElement(By.id("password")).sendKeys(duppwd);
	      	  driver.findElement(By.id("loginId")).click();
	      	  
	      	  driver.findElement(By.xpath("//div/div[2]/div[3]/div[2]/div/div[2]/div[2]/a[1]")).click();
	      	  if (driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]/div/a[1]")).isDisplayed())
	      	  {
				
	      		  return 0;
	      		   
			} else
			{
                 return 1;
			}
	    }
	    //18.Add Roaster Failure Message if we click Edit button and password is below minimum length
	    public int TC_58(String editminname,String editminpwd)
	    {
	    	  driver.findElement(By.linkText("LOG IN")).click();
		      driver.findElement(By.id("email")).sendKeys(editminname);
	      	  driver.findElement(By.id("password")).sendKeys(editminpwd);
	      	  driver.findElement(By.id("loginId")).click();
	      	  
	      	 driver.findElement(By.xpath("//div/div[2]/div[3]/div[2]/div/div[2]/div[2]/a[1]")).click();
	      	if (driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]/div/a[1]")).isDisplayed())
	      	  {
				
	      		  return 0;
	      		   
			} else
			{
               return 1;
			}
	    }
	    //19.Add Roaster Failure Message if we click Edit button and student last name is not provided
	    public int TC_59(String editlast,String editname)
	    {
	    	  driver.findElement(By.linkText("LOG IN")).click();
		      driver.findElement(By.id("email")).sendKeys(editlast);
	      	  driver.findElement(By.id("password")).sendKeys(editname);
	      	  driver.findElement(By.id("loginId")).click();
	      	  
	      	  
		    driver.findElement(By.xpath("//div/div[2]/div[3]/div[2]/div/div[2]/div[2]/a[1]")).click();
		    if (driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]/div/a[1]")).isDisplayed())
	      	  {
				
	      		  return 0;
	      		   
			} else
			{
             return 1;
			}
	    }
	    //20.Add Roaster Failure Message if we click Edit button and password is below minimum length and also no last name provided for student
	    public int  TC_60(String minpwd,String nolastname)
	    {
	    	  driver.findElement(By.linkText("LOG IN")).click();
		      driver.findElement(By.id("email")).sendKeys(minpwd);
	      	  driver.findElement(By.id("password")).sendKeys(nolastname);
	      	  driver.findElement(By.id("loginId")).click();
	      	  
	      	  
		    driver.findElement(By.xpath("//div/div[2]/div[3]/div[2]/div/div[2]/div[2]/a[1]")).click();
		    if (driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]/div/a[1]")).isDisplayed())
	      	  {
				
	      		  return 0;
	      		   
			} else
			{
                 return 1;
			}
	    	
	    	
	    }
	    
	    public static void main(String[] args) throws InterruptedException 
	    {
	    	
	    	int  res;
	    	User_Mang um=new User_Mang();
	    	um.LaunchApp();
	    	System.out.println("*_*_*_*_*_*Automating User Management Functionality Test Cases*_*_*_*_*_*");
	    	
	    	res=um.TC_4(loginuname, loginpwd);
	    	System.out.println("Case1: Result of Test Case Id::4  is->"+ res);
	    	um.closeApp();

	    	um.LaunchApp();
	    	res=um.TC_42(lu, lp);
	    	System.out.println("Case2: Result of Test Case Id::42  is->" +res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_43(loginpuname, loginppwd);
	    	System.out.println("Case3: Result of Test Case Id::43  is->" +res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_44(onlylogin);
	    	System.out.println("Case4: Result of Test Case Id::44  is->"+res);
	    	um.closeApp();
	    	um.LaunchApp();
	    	res=um.TC_45(email);
	    	System.out.println("Case5: Result of Test Case Id::45  is ->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_46(pwd);
	    	System.out.println("Case6: Result of Test Case Id::46  is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_47(alreadynuname, alreadypwd);
	    	System.out.println("Case7: Result of Test Case Id::47  is->"+res);
	    	um.closeApp();
	    	

	    	um.LaunchApp();
	    	res=um.TC_48(uname,belowpwd);
	    	System.out.println("Case8: Result of Test Case Id::48   is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_49(Teditprofilelogin, Teditprofilepwd);
	    	System.out.println("Case9: Result of Test Case Id::49   is->"+res);
	    	um.closeApp();
	    	
	    	
	    	um.LaunchApp();
	    	res=um.TC_50(Peditprofilelogin, Peditprofilepwd);
	    	System.out.println("Case10: Result of Test Case Id::50  is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_51(oldpwdwrongemail,oldpwdwrong);
	    	System.out.println("Case11: Result of Test Case Id::51   is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_52(oldpwdnotemail,oldpwdnotgiven);
	    	System.out.println("Case12: Result of Test Case Id::52   is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_53(confirmpwdemail, confirmpwd);
	    	System.out.println("Case13: Result of Test Case Id::53   is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_54(minlepwdemail, minlenpwd);
	    	System.out.println("Case14: Result of Test Case Id::54   is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_55(rosterlastname, rosterlastpwd);
	    	System.out.println("Case15: Result of Test Case Id::55   is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_56(dupename, duppwd);
	    	System.out.println("Case16: Result of Test Case Id::56   is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_57(editoptionname,editoptionpwd);
	    	System.out.println("Case17: Result of Test Case Id::57   is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_58(editminname, editminpwd);
	    	System.out.println("Case18: Result of Test Case Id::58   is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_59(editnlastname, editlastpwd);
	    	System.out.println("Case19: Result of Test Case Id::59   is->"+res);
	    	um.closeApp();
	    	
	    	um.LaunchApp();
	    	res=um.TC_60(beloweditnlastname, editlastnamepwd);
	    	System.out.println("Case20: Result of Test Case Id::60   is->"+res);
	    	um.closeApp();
		}
	    
	    public void closeApp()
	    {
	    	driver.close();
	    }
	

}
