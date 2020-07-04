<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/controlador" var="linkEntradaServlet"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${linkEntradaServlet }" method="post">
	
		Nome: <input type="text" name="nome" value="${autor.nome }" />
		<input type="hidden" name="id" value="${autor.id }">
		<input type="hidden" name="comando" value="AlteraAutor">
		<input type="submit" />
	</form>

</body>
</html>