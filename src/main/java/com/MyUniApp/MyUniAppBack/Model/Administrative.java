package com.MyUniApp.MyUniAppBack.Model;

public class Administrative extends User {

    private int dependency;

    public Administrative() {
    }

    public Administrative(String name, String lastName, String email, int phone, int dependency, String password) {
        super(name, lastName, email, phone, password);
        this.dependency = dependency;
    }

    public int getDependency() {
        return dependency;
    }

    public void setDependency(int dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return  super.toString()+" Administrative{" +
                "dependency='" + dependency + '\'' +
                '}';
    }
}
