package com.ivsath.notekeeper

class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String = title
}

class NoteInfo(var course: CourseInfo, var title: String, var text: String)
