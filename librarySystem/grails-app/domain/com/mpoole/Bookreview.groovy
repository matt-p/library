package com.mpoole

class Bookreview {
    
    String book
    Date dateCreated
    String student
    String review

    static constraints = {
	book blank:false, nullable:false, maxSize:20
	dateCreated blank:false, nullable:false
	student blank:false, nullable:false, maxSize:20
	review blank:false, nullable:false, widget:'textarea', maxSize:200
    }
}
