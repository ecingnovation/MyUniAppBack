package com.MyUniApp.MyUniAppBack.Model;

public class Teacher extends User{

    private int faculty;
    private int teachertype;
    private String address;

    public Teacher() {
    }

    public Teacher(String name, String lastName, String email, int phone, int faculty, int teachertype, String address, String password) {
        super(name, lastName, email, phone, password);
        this.faculty = faculty;
        this.teachertype = teachertype;
        this.address = address;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public int getTeachertype() {
        return teachertype;
    }

    public void setTeachertype(int teachertype) {
        this.teachertype = teachertype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString()+" Teacher{" +
                "faculty=" + faculty +
                ", teachertype=" + teachertype +
                ", address='" + address + '\'' +
                '}';
    }
}
