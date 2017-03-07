<%--
  Created by IntelliJ IDEA.
  User: power
  Date: 03.03.2017
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>

<FORM name=test>
    <CENTER><FONT face=Arial,Helvetica,sans-serif color=#000099></FONT>
        <H3>Название теста </H3>
    </CENTER>
    <OL>

        <LI>
            <H4><INPUT size=1 name=T1> Вопрос 1 </H4>
            <INPUT type=radio name=Q1> ответ 1.1 <BR>
            <INPUT type=radio name=Q1> ответ 2.1 <BR>
            <INPUT type=radio name=Q1> ответ 3.1 <BR>
            <INPUT type=radio name=Q1> ответ 4.1 <BR><BR>

        <LI>
            <H4><INPUT size=1 name=T2> Вопрос 2 </H4>
            <INPUT type=radio name=Q2> ответ 1.2 <BR>
            <INPUT type=radio name=Q2> ответ 2.2 <BR>
            <INPUT type=radio name=Q2> ответ 3.3 <BR>
            <INPUT type=radio name=Q2> ответ 4.4 <BR><BR>

        <LI>
            <H4><INPUT size=1 name=T3> Вопрос 3 </H4>
            <INPUT type=radio name=Q3> ответ 1.3 <BR>
            <INPUT type=radio name=Q3> ответ 2.3 <BR>
            <INPUT type=radio name=Q3> ответ 3.3 <BR>
            <INPUT type=radio name=Q3> ответ 4.3 <BR><BR>

        <LI>
            <H4><INPUT size=1 name=T4> Вопрос 4 </H4>
            <INPUT type=radio name=Q4> ответ 1.4 <BR>
            <INPUT type=radio name=Q4> ответ 2.4 <BR>
            <INPUT type=radio name=Q4> ответ 3.4 <BR>
            <INPUT type=radio name=Q4> ответ 4.4 <BR><BR>

        <LI>
            <H4><INPUT size=1 name=T5> Вопрос 5 </H4>
            <INPUT type=radio name=Q5> ответ 1.5 <BR>
            <INPUT type=radio name=Q5> ответ 2.5 <BR>
            <INPUT type=radio name=Q5> ответ 3.5 <BR>
            <INPUT type=radio name=Q5> ответ 4.5 <BR><BR>

        <LI>
            <H4><INPUT size=1 name=T6> Вопрос 6 </H4>
            <INPUT type=radio name=Q6> ответ 1.6 <BR>
            <INPUT type=radio name=Q6> ответ 2.6 <BR>
            <INPUT type=radio name=Q6> ответ 3.6 <BR>
            <INPUT type=radio name=Q6> ответ 4.6 <BR>

        </LI></OL><BR>
    <CENTER>
        <P><TEXTAREA name=s1 rows=4 cols=70> </TEXTAREA> </P>
        <INPUT onclick=check_me() type=button value="Показать_результат">&nbsp;&nbsp;&nbsp;&nbsp;
        <INPUT type=reset value="Сбросить ответы"> </CENTER><BR><BR></FORM>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>

</body>
</html>
