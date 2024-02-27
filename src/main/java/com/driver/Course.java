package com.driver;

public class Course {
    private String courseId;
    private String courseName;
    private int maxCapacity;
    private int enrolledStudents;

    public Course(String courseId, String courseName, int maxCapacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent() throws CourseAlreadyFullException {
        if (enrolledStudents >= maxCapacity) {
            throw new CourseAlreadyFullException("Course is already full!");
        }
        enrolledStudents++;
    }

    public void dropStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
        }
    }
}