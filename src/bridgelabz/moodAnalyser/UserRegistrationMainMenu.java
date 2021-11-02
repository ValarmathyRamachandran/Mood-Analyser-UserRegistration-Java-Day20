package bridgelabz.moodAnalyser;

import java.util.Scanner;

public class UserRegistrationMainMenu {

	    UserRegistration regexUserRegistration = new UserRegistration();
	    TestEmailSample testEmailSample = new TestEmailSample();
	    MoodAnalyser mood = new MoodAnalyser();
	    Scanner scanner = new Scanner(System.in);

	    public void choice() {
	        while (true) {
	            System.out.println("Enter 1 To Check First Name\n"
	                             + "Enter 2 To Check Second Name\n"
	                             + "Enter 3 To Check EmailId\n"
	                             + "Enter 4 To Check Mobile Number\n"
	                             + "Enter 5 To Check Password\n"
	                             + "\nEnter 6 To test the sample EmailIds\n"
	                             + "Enter 0 To Exit");
	                             
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1 :
	                    regexUserRegistration.userFirstName();;
	                    break;
	                case 2 :
	                    regexUserRegistration.userLastName();;
	                    break;
	                case 3 :
	                    regexUserRegistration.userEmailId();;
	                    break;
	                case 4 :
	                    regexUserRegistration.userMobileNumber();;
	                    break;
	                case 5 :
	                    regexUserRegistration.userPassword();
	                    break;
	                case 6 :
	                    sampleEmailIds();
	                    break;
	                case 0:
	                    System.exit(0);
	                    break;
	                default :
	                    System.out.println("You have entered the wrong option \n Please enter the Correct option");
	                    continue;
	            }
	        }
	    }
	    public void sampleEmailIds() {
	        System.out.println("Enter 1 to Test Sample Emails");
	        int option = scanner.nextInt();
	        if (option == 1) {
	            testEmailSample.testForValidEmails("abc@yahoo.com");
	        } else {
	            System.out.println("You have entered the wrong input \n Please enter the Correct input");
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome to the User Registration program \n");
	        UserRegistrationMainMenu userMain = new UserRegistrationMainMenu();
	        userMain.choice();
	        userMain.scanner.close();
	    }
	}
