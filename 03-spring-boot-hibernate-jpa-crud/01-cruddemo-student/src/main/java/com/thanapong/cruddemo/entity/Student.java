package com.thanapong.cruddemo.entity;

import jakarta.persistence.*;

/* Map this class to database table
   Need to start with Entity annotation, map it with the table named
   student
 */
@Entity
@Table(name="student")
public class Student {

    // Map fields to database columns, as following instruction

    // Define fields
    /* We know that the id field is our primary key for this given student,
       so we make use of the Id annotation, and then specify how this
       value is generated. GeneratedValue strategy equals GenerationType.IDENTITY
       .IDENTITY basically says "let MySQL handle the auto increment on that given Id
       and then map it to the actual database column name.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    // Define constructor, define no-argument constructor
    public Student() {

    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Define getters/setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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


    // Define toString() method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
