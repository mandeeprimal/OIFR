/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oifr.entity;

import java.sql.SQLException;

/**
 *
 * @author mande
 */
public class Student {
    String firstname,  lastname,  dob,  gender,  collegename,  collegeroll,  faculty,  semester,  dateofexam,  typeofexam, vouchernumber,  userid ;
    int year;
    boolean status;

    public Student() {
    }

    public Student(String firstname, String lastname, String dob, String gender, String collegename, String collegeroll, String faculty, String semester, String dateofexam, String typeofexam, String vouchernumber, String userid, int year, boolean status) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.gender = gender;
        this.collegename = collegename;
        this.collegeroll = collegeroll;
        this.faculty = faculty;
        this.semester = semester;
        this.dateofexam = dateofexam;
        this.typeofexam = typeofexam;
        this.vouchernumber = vouchernumber;
        this.userid = userid;
        this.year = year;
        this.status = status;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getCollegeroll() {
        return collegeroll;
    }

    public void setCollegeroll(String collegeroll) {
        this.collegeroll = collegeroll;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDateofexam() {
        return dateofexam;
    }

    public void setDateofexam(String dateofexam) {
        this.dateofexam = dateofexam;
    }

    public String getTypeofexam() {
        return typeofexam;
    }

    public void setTypeofexam(String typeofexam) {
        this.typeofexam = typeofexam;
    }

    public String getVouchernumber() {
        return vouchernumber;
    }

    public void setVouchernumber(String vouchernumber) {
        this.vouchernumber = vouchernumber;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }





}

