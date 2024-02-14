package com.groupeisi.domain;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name = "etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_percentage")
    private String email;

    @Column(name = "student_branch")
    private String branch;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Etudiant() {}

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + ", email='" + email + '\'' + ", branch='" + branch + '\'' + '}';
    }

    public Etudiant(String name, String email, String branch) {
        super();
        this.name = name;
        this.email = email;
        this.branch = branch;
    }
}
