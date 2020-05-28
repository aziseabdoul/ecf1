package com.eval.eval.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 512)
    private String firstName;

    @Column(nullable = false, length = 512)
    private String lastName;

    @Column(nullable = false, length = 512)
    private String email;

    @Column(nullable = false, length = 512)
    private String password;

    @Column(nullable = false)
    private Date birthDate;

    @Column
    private Date lastKnownPresence;

    public Users() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthdate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getLastKnownPresence() {
        return lastKnownPresence;
    }

    public void setLastKnownPresence(Date lastKnownPresence) {
        this.lastKnownPresence = lastKnownPresence;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", lastKnownPresence=" + lastKnownPresence +
                '}';
    }
}
