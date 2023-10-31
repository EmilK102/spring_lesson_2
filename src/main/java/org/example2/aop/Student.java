package org.example2.aop;

public class Student {

    private String nameSurname;
    private int course;
    private double avgGrace;

    public Student(String nameSurname, int course, double avgGrace) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGrace = avgGrace;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrace() {
        return avgGrace;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrace(double avgGrace) {
        this.avgGrace = avgGrace;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avgGrace=" + avgGrace +
                '}';
    }
}
