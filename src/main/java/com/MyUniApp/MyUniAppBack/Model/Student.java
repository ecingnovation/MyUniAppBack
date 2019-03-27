package com.MyUniApp.MyUniAppBack.Model;

public class Student extends User{

    private int faculty;
    private int semester;

    public Student() {
    }

    public Student(String name, String lastName, int faculty, int semester, String email, int phone, String password) {
        super(name, lastName, email, phone, password);
        this.faculty = faculty;
        this.semester = semester;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return toString()+" Student{" +
                "faculty=" + faculty +
                ", semester=" + semester +
                '}';
    }
}
