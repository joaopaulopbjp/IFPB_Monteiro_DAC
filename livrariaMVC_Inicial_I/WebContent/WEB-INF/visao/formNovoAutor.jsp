<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/controlador" var="linkEntradaServlet"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${linkEntradaServlet }" method="post">
	
		Nome: <input type="text" name="nome"  />
	    <input type="hidden" name="comando" value="NovaEmpresa">
		<input type="submit" />
	</form>

</body>
</html>