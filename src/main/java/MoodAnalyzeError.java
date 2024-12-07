package main.java;

public enum MoodAnalyzeError {
    NULL_MOOD("Mood is null"),
    EMPTY_MOOD("Mood is empty"),
    UNKNOWN_ERROR("Unknown error ");

    private final String message;

    MoodAnalyzeError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
