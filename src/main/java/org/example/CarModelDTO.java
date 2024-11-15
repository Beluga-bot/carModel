package org.example;

public class CarModelDTO {
    private String make;
    private String model;
    private String countryOrigin;
    private String countryCode;

    public CarModelDTO(String make, String model, String countryOrigin, String countryCode) {
        this.make = make;
        this.model = model;
        this.countryOrigin = countryOrigin;
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "CarModelDTO{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", countryOrigin='" + countryOrigin + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }

    // Геттеры и сеттеры
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}


