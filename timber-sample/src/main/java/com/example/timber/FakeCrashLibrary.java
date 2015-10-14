package com.example.timber;

/**
 * Not a real crash reporting library!
 */
public final class FakeCrashLibrary {
    public static void log(int priority, String tag, String message) {
        System.out.println("Log message from FakeCrashLibrary. priority="
                        + priority + " tag=" + tag + " message=" + message
        );
    }

    public static void logWarning(Throwable t) {
        System.out.println("Warning message from FakeCrashLibrary. " + t);
    }

    public static void logError(Throwable t) {
        System.out.println("Error message from FakeCrashLibrary. " + t);
    }

    public static void logWTF(Throwable t) {
        System.out.println("WTF message from FakeCrashLibrary. " + t);
    }

    private FakeCrashLibrary() {
        throw new AssertionError("No instances.");
    }
}
