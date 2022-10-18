package com.dh.clase33.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="teachers")
public class Teacher {
    @Id
    @SequenceGenerator(name="professor_sequence", sequenceName = "professor_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professor_sequence")
    private Long id;
    @Column
    private String name;
    @Column
    private String title;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JsonIgnore
    private Set<Student> students = new HashSet<>();

    public Teacher(){}

    public Teacher(String name, String title, Set<Student> students) {
        this.name = name;
        this.title = title;
        this.students = students;
    }

    public Teacher(Long id, String name, String title, Set<Student> students) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }


}




















