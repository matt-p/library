package com.mpoole

class Book {

    String title
    String subject
    String author
    int isbn
    Date dateBorrowed
    Date returnDate
    Student student
    Boolean overdue
    static hasMany=[bookreviews: Bookreview]

    boolean isOverdue() { 
	return true
    }

    static constraints = {
	title blank:false, nullable:false, maxSize:50
	subject blank:false, nullable:false, maxSize:30
	author blank:false, nullable:false, maxSize:30
	isbn blank:false, nullable:false, unique:true, maxSize:13
	dateBorrowed blank:false, nullable:false
	returnDate blank:false, nullable:false
	student blank:false, nullable:false, maxSize:20
	overdue blank:false, nullable:false
    }
}
