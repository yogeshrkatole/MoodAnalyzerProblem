package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.MoodAnalyzeException;
import main.java.MoodAnalyzer;

public class MoodAnalyzerTest {
	 @Test
	    public void givenMsg_whenSad_ShouldReturn_Sad() throws MoodAnalyzeException{
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("sad mood"); 
	        Assert.assertEquals("SAD",moodAnalyzer.moodAnalyze("sad mood"));
	    }

	    @Test
	    public void givenMsg_whenHappy_ShouldReturn_Happy() throws MoodAnalyzeException{
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("happy mood");
	        Assert.assertEquals("HAPPY",moodAnalyzer.moodAnalyze("happy mood"));
	    }
	    
	    @Test
	    public void givenMsgInParameter_whenSad_ShouldReturn_Sad() throws MoodAnalyzeException{
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood"); 
	        Assert.assertEquals("SAD",moodAnalyzer.moodAnalyze("I am in Sad Mood"));
	    }

		@Test
		public void givenMsgInParameter_whenNotSad_ShouldReturn_Happy() throws MoodAnalyzeException {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
			Assert.assertEquals("HAPPY", moodAnalyzer.moodAnalyze("I am in any Mood"));
		}
		 @Test
		    public void givenMsgInParameter_whenNull_ShouldThrow_Exception() {
		        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		        try {
		            moodAnalyzer.moodAnalyze();
		            Assert.fail("Expected MoodAnalyzeException");
		        } catch (MoodAnalyzeException e) {
		            Assert.assertEquals("Mood is null", e.getMessage());
		        }
		    }
		 @Test
		    public void givenMsgInParameter_whenEmpty_ShouldThrow_Exception() {
		        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		        try {
		            moodAnalyzer.moodAnalyze();
		            Assert.fail("Expected MoodAnalyzeException");
		        } catch (MoodAnalyzeException e) {
		            Assert.assertEquals("Mood is empty", e.getMessage());
		        }
		    }
	    @Test
	    public void givenMsgNotInParameter_whenSad_ShouldReturn_Sad() throws MoodAnalyzeException{
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood"); 
	        Assert.assertEquals("SAD",moodAnalyzer.moodAnalyze());
	    }
	    @Test
	    public void givenMsgNotInParameter_whenNotSad_ShouldReturn_Happy() throws MoodAnalyzeException{
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood"); 
	        Assert.assertEquals("HAPPY",moodAnalyzer.moodAnalyze());
	    }
	    @Test
	    public void givenMsgNotInParameter_whenNull_ShouldThrow_Exception() {
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
	        try {
	            moodAnalyzer.moodAnalyze();
	            Assert.fail("Expected MoodAnalyzeException");
	        } catch (MoodAnalyzeException e) {
	            Assert.assertEquals("Mood is null", e.getMessage());
	        }
	    }

	    @Test
	    public void givenMsgNotInParameter_whenEmpty_ShouldThrow_Exception() {
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
	        try {
	            moodAnalyzer.moodAnalyze();
	            Assert.fail("Expected MoodAnalyzeException");
	        } catch (MoodAnalyzeException e) {
	            Assert.assertEquals("Mood is empty", e.getMessage());
	        }
	    }
}
