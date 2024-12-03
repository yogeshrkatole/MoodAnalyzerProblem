package main.java;

public class MoodAnalyzer {
	private String msg;
	public MoodAnalyzer() {
        this.msg = msg;
    }
    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }

    public String moodAnalyze(String msg){
        if (msg.toLowerCase().contains("sad")){
            return "SAD";
        }
        else
            return "HAPPY";
    }
    public String moodAnalyze(){
        if (this.msg.toLowerCase().contains("sad")){
            return "SAD";
        }
        else
            return "HAPPY";
    }

	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		System.out.println(moodAnalyzer.moodAnalyze("I am in Sad Mood"));
		System.out.println(moodAnalyzer.moodAnalyze("I am in any Mood"));

		MoodAnalyzer moodAnalyzerParametrized = new MoodAnalyzer("I am in Sad Mood");
		System.out.println(moodAnalyzerParametrized.moodAnalyze());

		MoodAnalyzer moodAnalyzerParametrized1 = new MoodAnalyzer("I am in Happy Mood");
		System.out.println(moodAnalyzerParametrized1.moodAnalyze());
	}
}
