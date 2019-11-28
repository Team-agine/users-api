package com.vehiculerental.usersapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table (name = "users")
public class User {

    @Id
    private String id;
    @Column(name = "first_name", length = 64)
    private String firstName;
    @Column(name = "last_name", length = 64)
    private String lastName;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "license_date")
    private Date licenseDate;
    @Column(name = "license_number", length = 64)
    private String licenseNumber;
    @Column(name = "email", length = 255)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name= "created_at")
    private Date createdAt;
    @Column(name="updated_at")
    private Date updatedAt;

    public User(){

    }
    Date date = new Date();

    public User(String id, String firstName, String lastName, Date birthDate, Date licenseDate, String licenseNumber, String email, String password, Date createdAt, Date updatedAt, Date date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.licenseDate = licenseDate;
        this.licenseNumber = licenseNumber;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.date = date;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(Date licenseDate) {
        this.licenseDate = licenseDate;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", licenseDate='" + licenseDate + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
