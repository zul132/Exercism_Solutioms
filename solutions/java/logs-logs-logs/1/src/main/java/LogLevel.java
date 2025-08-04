public enum LogLevel {
    // TODO: define members for each log level
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int encodedLogLevel;

    LogLevel(int encodedLogLevel) {
        this.encodedLogLevel = encodedLogLevel;
    }

    public int getEncodedLogLevel() {
        return this.encodedLogLevel;
    }
}
