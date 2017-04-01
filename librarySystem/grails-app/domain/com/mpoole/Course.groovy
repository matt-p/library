package com.mpoole

class Course {

    String title
    String code
    String leader
    String department
    String description
    String studyMode
    static hasMany=[students: Student]

    static constraints = {
	title blank:false, nullable:false, maxSize:30
	code blank:false, nullable:false, maxSize:20, unique:true
	leader blank:false, nullable:false, maxSize:20
	department blank:false, nullable:false, maxSize:30
	description blank:false, nullable:false, maxSize:40, widget:'textarea'
	studyMode blank:false, nullable:false, maxSize:20
    }
}
