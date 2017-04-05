<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Librarian Login</title>
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
	<asset:stylesheet src="libhome.css" />
</head>
<body>
	<div class="row col-md-12">
	<div class="col-md-6 col-md-offset-3 login-panel">
		<g:if test="${flash.message}">
		<div class="message">${flash.message}</div>
		</g:if>
		<g:form action="validate"> 
		<input type="hidden" name="cName" value="${cName}">
		<input type="hidden" name="aName" value="${aName}">
		<table>
		   <h1>Librarian Login</h1>
		   <tr class="prop">
			<td class="value">
			    <input type="text" id="username" name="username" placeholder="Username" value="">
			</td>
		   </tr>
		   <tr class="prop">
			<td class="value">
			    <input type="password" id="password" name="password" placeholder="Password" value="">
			</td>
		   </tr>
		   <tr>
			<td>
			    <input type="submit" value="login"/>
			</td>
		   </tr>
		</table>
		</g:form>
	</div>
	</div>
     
</body>
</html>

