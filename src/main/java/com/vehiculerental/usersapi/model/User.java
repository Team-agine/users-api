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
    @Column(name = "firstname", length = 64)
    private String firstname;
    @Column(name = "lastname", length = 64)
    private String lastname;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "licensedate")
    private Date licensedate;
    @Column(name = "licensenumber", length = 64)
    private String licensenumber;
    @Column(name = "email", length = 255)
    private String email;
    @Column(name = "password")
    private String password;

    public User(){

    }

    public User(String firstname, String lastname, Date birthdate, Date licensedate, String licensenumber, String email, String password) {
        this.id = UUID.randomUUID().toString();
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.licensedate = licensedate;
        this.licensenumber = licensenumber;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getLicensedate() {
        return licensedate;
    }

    public void setLicensedate(Date licensedate) {
        this.licensedate = licensedate;
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
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
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", licensedate='" + licensedate + '\'' +
                ", licensenumber='" + licensenumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
