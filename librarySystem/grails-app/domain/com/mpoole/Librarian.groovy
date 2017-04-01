package com.mpoole

class Librarian {

    String name
    String email
    String office
    String userName
    String password
    int telephone
    Library library

    String toString() {
	return name
    }

    static constraints = {
	name blank:false, nullable:false, maxSize:20
	email blank:false, nullable:false, email:true
	office blank:false, nullable:false, maxSize:40
	userName blank:false, nullable:false, maxSize:20, unique:true
	password blank:false, nullable:false, minSize:7
	telephone blank:false, nullable:false, maxSize:15
	library blank:false, nullable:false, maxSize:20
    }
}
