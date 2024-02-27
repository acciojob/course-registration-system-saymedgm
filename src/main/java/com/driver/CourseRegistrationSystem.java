package com.driver;

import java.util.ArrayList;

public class CourseRegistrationSystem {
    private ArrayList<Course> courses;

    public CourseRegistrationSystem() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findCourseById(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }
}