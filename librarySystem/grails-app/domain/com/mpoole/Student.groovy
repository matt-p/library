package com.mpoole

class Student {

    String name
    String email
    String username
    String password
    int studentId
    Course course
    static hasMany=[books: Book, bookreviews: Bookreview]

    static constraints = {
	name blank:false, nullable:false, maxSize:20
	email blank:false, nullable:false, email:true
	username blank:false, nullable:false, unique:true, maxSize:20 
	password blank:false, nullable:false, minSize:7
	studentId blank:false, nullable:false, unique:true
	course blank:false, nullable:false, maxSize:30
    }
}
