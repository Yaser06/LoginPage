<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
 <h1><script>document.write(new Date().getFullYear())</script></h1>
                             
<h1>Yaser Mücahit AKTAŞ </h1>
<h1>Mekatronik Mühendisi  </h1>
<h1>tel:05384798285	 </h1>
<h1>mail: yaser.mucahit_06@hotmail.com </h1>
<h2>KAYIT OLMUŞ KİŞİNİN </h2>
<h2>ADI => ${user.name}  </h2>
<h2>SOYADI => ${user.surname}  </h2>

	
</body>
</html>
