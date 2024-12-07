package main.java;

public class MoodAnalyzer {
	private String msg;
	public MoodAnalyzer() {
        this.msg = msg;
    }
    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }
 
    public String moodAnalyze(String msg) throws MoodAnalyzeException {
        try {
            if (msg == null) {
                throw new MoodAnalyzeException(MoodAnalyzeError.NULL_MOOD);
            } else if (msg.trim().isEmpty()) {
                throw new MoodAnalyzeException(MoodAnalyzeError.EMPTY_MOOD);
            } else if (msg.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzeException(MoodAnalyzeError.UNKNOWN_ERROR);
        }
    }
    public String moodAnalyze() throws MoodAnalyzeException{
    	try {
            if (this.msg == null) {
                throw new MoodAnalyzeException(MoodAnalyzeError.NULL_MOOD);
            } else if (this.msg.trim().isEmpty()) {
                throw new MoodAnalyzeException(MoodAnalyzeError.EMPTY_MOOD);
            } else if (this.msg.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyzeException(MoodAnalyzeError.UNKNOWN_ERROR);
        }
    }

	public static void main(String[] args) {
		try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
            System.out.println(moodAnalyzer.moodAnalyze("I am in Sad Mood"));
            System.out.println(moodAnalyzer.moodAnalyze("I am in any Mood"));

            MoodAnalyzer moodAnalyzerParametrized = new MoodAnalyzer("I am in Sad Mood");
            System.out.println(moodAnalyzerParametrized.moodAnalyze());

            MoodAnalyzer moodAnalyzerParametrized1 = new MoodAnalyzer("I am in Happy Mood");
            System.out.println(moodAnalyzerParametrized1.moodAnalyze());

            MoodAnalyzer moodAnalyzerNull = new MoodAnalyzer(null);
            System.out.println(moodAnalyzerNull.moodAnalyze());

            MoodAnalyzer moodAnalyzerEmpty = new MoodAnalyzer("");
            System.out.println(moodAnalyzerEmpty.moodAnalyze());
        } catch (MoodAnalyzeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
	}
}
