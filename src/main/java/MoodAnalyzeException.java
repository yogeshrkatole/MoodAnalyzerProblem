package main.java;

public class MoodAnalyzeException extends Exception {
    private final MoodAnalyzeError errorType;

    public MoodAnalyzeException(MoodAnalyzeError errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public MoodAnalyzeError getErrorType() {
        return errorType;
    }
}
