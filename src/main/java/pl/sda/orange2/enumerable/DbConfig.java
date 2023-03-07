package pl.sda.orange2.enumerable;

public enum DbConfig {
    DB_URL ("jdbc:h2:~/databases/jdbc"),
    USER ("sa"),
    PASSWORD ("sa");

    private String value;

    public String getValue() {
        return value;
    }

    DbConfig(String value) {
        this.value = value;
    }
}
