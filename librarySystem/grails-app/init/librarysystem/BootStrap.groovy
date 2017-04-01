package com.mpoole

class BootStrap {

    def init = { servletContext ->
	/*def course1 = new Course(
		title:'Computing',
		code:'COMP123',
		leader:'Sophie Bloggs',
		department:'Computing',
		description:'Computing 320 Credits',
		studyMode:'N/A'
	).save()
	def course2 = new Course(
		title:'Computer Forensics',
		code:'COFO123',
		leader:'Richard Bloggs',
		department:'Computing',
		description:'Computer Forensics 350 Credits',
		studyMode:'N/A'
	).save()
	def library1 = new Library(
		name:'Sheffield Technology Library',
		address:'123 Sheffield Road',
		openingHours:'09:00-15:00',
		location:'Sheffield',
		studySpaces:30
	).save() 
	def library2 = new Library(
		name:'Sheffield Industrial Library',
		address:'234 Sheffield Road',
		openingHours:'09:30-16:00',
		location:'Sheffield',
		studySpaces:25
	).save()
	def student1 = new Student(
		name:'Joel Bloggs',
		email:'joelbloggs@gmail.com',
		userName:'joelb',
		password:'joelbpassword',
		studentId:1,
		course:1,
		library:1
	).save()
	def student2 = new Student(
		name:'Olivia Bloggs',
		email:'oliviabloggs@gmail.com',
		userName:'oliviab',
		password:'oliviabpassword',
		studentId:2,
		course:2,
		library:2
	).save()
	def student3 = new Student(
		name:'Tom Bloggs',
		email:'tombloggs@gmail.com',
		userName:'tomb',
		password:'tombpassword',
		studentId:3,
		course:1,
		library:1
	).save()
	def student4 = new Student(
		name:'Daisy Bloggs',
		email:'daisybloggs@gmail.com',
		userName:'daisyb',
		password:'daisypassword',
		studentId:4,
		course:2,
		library:2
	).save()
	def book1 = new Book(
		title:'Computers For Dummies',
		subject:'Computing',
		author:'Dr Jay Bloggs',
		isbn:11223344,
		dateBorrowed:new Date('10/10/2017'),
		returnDate:new Date('21/10/2017'),
		student:1,
		overdue:false,
		library:1
	).save()
	def book2 = new Book(
		title:'Biology For Dummies',
		subject:'Science',
		author:'Dr Sue Bloggs',
		isbn:22334455,
		dateBorrowed:new Date('05/08/2017'),
		returnDate:new Date('15/08/2017'),
		student:2,
		overdue:false,
		library:2
	).save()
	def bookreview1 = new Bookreview(
		book:1,
		dateMade:new Date('21/10/2017'),
		student:1,
		review:'Very informative.'		
	).save()
	def bookreview2 = new Bookreview(
		book:2,
		dateMade:new Date('15/08/2017'),
		student:2,
		review:'Exactly what I needed.'		
	).save()
	def librarian1 = new Librarian(
		name:'Peter Bloggs',
		email:'peterb@gmail.com',
		office:'1 Floor 1',
		userName:'peterb',
		password:'peterbpassword',
		telephone:'01142345432',
		library:1
	).save() 
	def librarian2 = new Librarian(
		name:'Catherine Bloggs',
		email:'catherineb@gmail.com',
		office:'A Floor A',
		userName:'catherineb',
		password:'catherinebpassword',
		telephone:'01143454321',
		library:2
	).save()*/
    }
    def destroy = {
    }
}
