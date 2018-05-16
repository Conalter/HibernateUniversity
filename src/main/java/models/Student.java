package models;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    private int id;
    private String name;
    private int age;
    private int enrolmentNo;
    private Course course;

    public Student() {
    }

    public Student(String name, int age, int enrolmentNo, Course course) {
        this.name = name;
        this.age = age;
        this.enrolmentNo = enrolmentNo;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "enrolment_no")
    public int getEnrolmentNo() {
        return enrolmentNo;
    }

    public void setEnrolmentNo(int enrolmentNo) {
        this.enrolmentNo = enrolmentNo;
    }

    @ManyToOne
    @JoinColumn(name = "course", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
