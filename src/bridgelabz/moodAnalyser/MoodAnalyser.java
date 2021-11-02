package bridgelabz.moodAnalyser;

public class MoodAnalyser {

    public boolean analyseMood(String mood) {
        if (mood.contains("Happy")) {
            System.out.println("Your Entry is Successful");
        } else if (mood.contains("Sad")) {
        	 System.out.println("Your Entry is Failed");
        }
		return false;   
    }
}
