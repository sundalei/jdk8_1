package com.shengsiyuan.jdk8.methodreference;

/**
 * Created by sundalei on 17-2-21.
 */
public class StudentComparator {

    public int compareStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
