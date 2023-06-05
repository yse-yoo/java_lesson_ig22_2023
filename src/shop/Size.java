package shop;

public enum Size {
    LARGE("L"), MEDIUM("M"), SMALL("S");

    // private property
    private final String value;

    // Constructor & setter
    private Size(String value)  {
        this.value = value;
    }

    // getter
    public String getValue() {
        return value;
    }

}
