package Packk;

import java.time.LocalDate;

public class Passport {
    private LocalDate dateOfBirth;
    private String gender;
    private String country;

    public Passport( LocalDate dateOfBirth, String gender, String country) {
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.country = country;
    }

    public Passport() {
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "Passport{" +
                "dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
