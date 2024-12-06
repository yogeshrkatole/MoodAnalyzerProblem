package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.MoodAnalyzer;

public class MoodAnalyzerTest {
	 @Test
	    public void givenMsg_whenSad_ShouldReturn_Sad(){
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("sad mood"); 
	        Assert.assertEquals("SAD",moodAnalyzer.moodAnalyze("sad mood"));
	    }

	    @Test
	    public void givenMsg_whenHappy_ShouldReturn_Happy(){
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("happy mood");
	        Assert.assertEquals("HAPPY",moodAnalyzer.moodAnalyze("happy mood"));
	    }
	    
	    @Test
	    public void givenMsgInParameter_whenSad_ShouldReturn_Sad(){
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood"); 
	        Assert.assertEquals("SAD",moodAnalyzer.moodAnalyze("I am in Sad Mood"));
	    }

		@Test
		public void givenMsgInParameter_whenNotSad_ShouldReturn_Happy() {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
			Assert.assertEquals("HAPPY", moodAnalyzer.moodAnalyze("I am in any Mood"));
		}
		@Test
	    public void givenMsgInParameter_whenNull_ShouldReturn_Happy(){
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
	        Assert.assertEquals("HAPPY",moodAnalyzer.moodAnalyze(null));
	    }
	    @Test
	    public void givenMsgNotInParameter_whenSad_ShouldReturn_Sad(){
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood"); 
	        Assert.assertEquals("SAD",moodAnalyzer.moodAnalyze());
	    }
	    @Test
	    public void givenMsgNotInParameter_whenNotSad_ShouldReturn_Happy(){
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood"); 
	        Assert.assertEquals("HAPPY",moodAnalyzer.moodAnalyze());
	    }
	    @Test
	    public void givenMsgNotInParameter_whenNull_ShouldReturn_Happy(){
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
	        Assert.assertEquals("HAPPY",moodAnalyzer.moodAnalyze());
	    }
}
