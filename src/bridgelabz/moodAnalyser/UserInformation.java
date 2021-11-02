package bridgelabz.moodAnalyser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInformation {

	public String regex;
	public boolean firstName(String firstName) {
			regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(firstName);
	        if (matcher.matches()) {
	            System.out.println("Entry is Valid and user is happy");
	        } else {
	            System.out.println("Invalid Entry and user is sad,please enter it the correct format as First Letter Starts with Caps and has minimum 3 characters ");
	        }
			return false;
	    }

	    public boolean lastName(String lastName) {
	        regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(lastName);
	        if (matcher.matches()) {
	            System.out.println("Entry is Valid and user is happy");
	        } else {
	            System.out.println("Invalid Entry and user is sad,please enter it the correct format as First Letter Starts with Caps and has minimum 3 characters ");
	        }
			return false;
	    }

	    public void emailId(String emailId) {
	        regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
	        Pattern pattern  = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(emailId);
	        if (matcher.matches()) {
	            System.out.println("Valid email id and user is happy");
	        } else {
	            System.out.println("InValid email id and user is sad,please enter it correct format ");
	        }
	    }

	    public void mobileNumber(String mobileNumber) {
	        regex = "^(\\d{1,3}[- ]?){1}\\d{9,10}$";
	        Pattern pattern  = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(mobileNumber);
	        if (matcher.matches()) {
	            System.out.println("Valid Mobile Nuber and user is happy");
	        } else {
	            System.out.println("InValid Entry and user is sad,please enter it in correct format as e.g. 91 9919819801");
	        }
	    }

	    public void password(String password) {
	        regex = "^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(password);
	        if (matcher.matches()) {
	            System.out.println("Valid Password and user is happy");
	        } else {
	            System.out.println("Invalid Password and user is sad,Please enter your valid password in correct format");
	        }
	    }
	
}