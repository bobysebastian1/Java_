package project;

import java.util.regex.*;    
import java.util.*; 
public class emailValidation {

	public static void main(String[] args) {
		 ArrayList<String> email = new ArrayList<String>(); 
	        //Add some id in list  
	        email.add("waishity@company.co.in");  
	        email.add("asdfgh789@domain.au");  
	        email.add("qwerty.zxcvb@gmail.com");  
	        email.add("faisy#@domain.co.in");  
	        email.add("daisy@yahoo.com");  
	        email.add("crazy");
	        email.add("fly@emirates.ae");  
	        email.add("laisy#gmail.com");  
	        //To check the email id  
	        String check = "^(.+)@(.+).(.+)$";  
	        //Compile regular expression to get the pattern  
	        Pattern p = Pattern.compile(check);  
	        //Iterate email array list  
	        for(String emails : email){  
	       
	            Matcher ma = p.matcher(emails);  
	            System.out.println(emails +" : "+ma.matches());  
	        }  
	    }  
	





		
	}


