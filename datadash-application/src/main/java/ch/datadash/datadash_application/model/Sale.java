package ch.datadash.datadash_application.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Sale {
    private double Price;

    private Gender gender;

    private String color;

    private String type;

    private LocalDateTime dateTime;

    public Sale(double price, Gender gender, String color, String type, LocalDateTime dateTime) {
        Price = price;
        this.gender = gender;
        this.color = color;
        this.type = type;
        this.dateTime = dateTime;
    }

    public Sale(){
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
