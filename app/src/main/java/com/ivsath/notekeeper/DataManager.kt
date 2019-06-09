package com.ivsath.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses[course.courseId] = course

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses[course.courseId] = course

        course = CourseInfo("flutter_start", "Flutter: Getting Started")
        courses[course.courseId] = course

        course = CourseInfo(courseId = "net_core", title = "ASP.NET Core Fundamentals")
        courses[course.courseId] = course
    }

}