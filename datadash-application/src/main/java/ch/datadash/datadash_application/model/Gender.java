package ch.datadash.datadash_application.model;

public enum Gender {
    MALE ("m"),
    FEMALE ("f"),
    UNISEX ("u");

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
