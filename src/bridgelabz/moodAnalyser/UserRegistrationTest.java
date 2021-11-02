package bridgelabz.moodAnalyser;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
UserInformation userReg = new UserInformation();

	@Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = userReg.firstName("Valar");
        Assert.assertEquals(true, actualResult);
    }
	
	@Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = userReg.lastName("Mathy");
        Assert.assertEquals(true, actualResult);
    }
	@Test
    public void givenFirstName_IsNotProper_ReturnFalse() {
        boolean actualResult = userReg.firstName("valar");
        Assert.assertEquals(false, actualResult);
	}
		
}

    