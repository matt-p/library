<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Library System | Librarian Dashboard</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    <asset:stylesheet src="libstudenthome.css" />
</head>
<body>
    
    <div id="content" role="main">
	<div class="row controller-container">
	<div class="first">
		<button type="button" class="lib-button btn btn-success">
			<g:link controller="course" action="create">Courses</g:link>
		</button>
		<h3>Create Course</h3>
		<p class="description">Create a new course to assign students to.</p>
	</div>
	<div class="second">
		<button type="button" class="lib-button btn btn-success">
			<g:link controller="student" action="create">Student</g:link>
		</button>
		<h3>Create Student</h3>
		<p class="description">Create a new student to assign courses,books and other details to.</p>
	</div>
	<div class="first">
		<button type="button" class="lib-button btn btn-success">
			<g:link controller="library" action="create">Library</g:link>
		</button>
		<h3>Create Library</h3>
		<p class="description">Create a new library to assign books and librarians to.</p>
	</div>
	<div class="second">
		<button type="button" class="lib-button btn btn-success">
			<g:link controller="librarian" action="create">Librarian</g:link>
		</button>
		<h3>Create Librarian</h3>
		<p class="description">Create a new librarian to assign to a library.</p>
	</div>
	<div class="first">
		<button type="button" class="lib-button btn btn-success">
			<g:link controller="book" action="create">Book</g:link>
		</button>
		<h3>Create Book</h3>
		<p class="description">Create a new book to assign to a library.</p>
	</div>
	<div class="second">
		<button type="button" class="lib-button btn btn-success">
			<g:link controller="book review" action="create">Book Review</g:link>
		</button>
		<h3>Create Book Review</h3>
		<p class="description">Create a new review to assign to a book.</p>
	</div>
	</div>
</div>
</body>
</html>

