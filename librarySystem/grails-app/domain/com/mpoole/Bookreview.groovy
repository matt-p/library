package com.mpoole

class Bookreview {
    
    Book book
    Date dateMade
    Student student
    String review

    static constraints = {
	book blank:false, nullable:false, maxSize:30
	dateMade blank:false, nullable:false
	student blank:false, nullable:false, maxSize:20
	review blank:false, nullable:false, widget:'textarea', maxSize:200
    }
}
