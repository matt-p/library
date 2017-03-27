package com.mpoole

class Book {

    String title
    String subject
    String author
    int isbn
    Date dateBorrowed
    Date returnDate
    String student
    Boolean overdue

    static constraints = {
	title blank:false, nullable:false, maxSize:20
	subject blank:false, nullable:false, maxSize:20
	author blank:false, nullable:false, maxSize:20
	isbn blank:false, nullable:false, unique:true, maxSize:13, minSize:13
	dateBorrowed blank:false, nullable:false
	returnDate blank:false, nullable:false
	student blank:false, nullable:false, maxSize:20
	overdue blank:false, nullable:false
    }
}
