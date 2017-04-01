package com.mpoole

class Library {

    String name
    String address
    String openingHours
    String location
    int studySpaces
    static hasMany=[books: Book, students: Student, librarians: Librarian]

    String toString() {
	return name
    }

    static constraints = {
	name blank:false, nullable:false, maxSize:40
	address blank:false, nullable:false, maxSize:40
	openingHours blank:false, nullable:false
	location blank:false, nullable:false, maxSize:40
	studySpaces blank:false, nullable:false, max:50 
    }
}
