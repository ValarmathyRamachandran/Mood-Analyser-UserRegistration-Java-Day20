package bridgelabz.moodAnalyser;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	
	    MoodAnalyser moodAnalyser = new MoodAnalyser();

	    @Test
	    public void givenMessage_WhenHappy_ReturnEntrySuccessful() {
	        boolean actualResult = moodAnalyser.analyseMood("User is Happy");
	        Assert.assertEquals(true, actualResult);
	       
	    }

	    @Test
	    public void givenMessage_WhenNotProper_ReturnEntryFailed() {
	        boolean actualResult = moodAnalyser.analyseMood("User is Sad");
	        Assert.assertEquals(false, actualResult);
	    }
	    
	    @Test
	    public void givenMessage_WhenProper_ReturnEntry() {
	        boolean actualResult = moodAnalyser.analyseMood("Sad");
	        Assert.assertEquals(false, actualResult);
	    }


}
