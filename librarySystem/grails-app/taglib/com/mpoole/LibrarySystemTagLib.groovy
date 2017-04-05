package com.mpoole

class LibrarySystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
def loginToggle = {
	out << "<div class='login-header row col-md-12'>"
	if (request.getSession(false) && session.user) {
		
		out << "<div class='col-md-6 logged-in'>"
		out << "<a href='${createLink(controller:'student', action:'logout')}'>"
		out << "Student | Logout </a></div>"
		
		out << "<div class='col-md-6 logged-in'>"
		out << "<a href='${createLink(controller:'librarian', action:'logout')}'>"
		out << "Librarian | Logout </a></div>"
		
		out << "<div class='col-md-12' style='text-align:center;'>Welcome <span>${session.user.name}!</span></div>"		
	}
	else {
		out << "<div class='col-md-6 logged-out'>Library System | "
		out << "<a href='${createLink(controller:'student', action:'login')}'>"
		out << "Student Login </a></div>"

		out << "<div class='col-md-6 logged-out'>Library System | "
		out << "<a href='${createLink(controller:'librarian', action:'login')}'>"
		out << "Librarian Login </a></div>"		
	}
	out << "</div>"
}
}
