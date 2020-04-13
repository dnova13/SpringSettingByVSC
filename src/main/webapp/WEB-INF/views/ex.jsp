<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>${title}</h2>
<div>
    <ul>
        <c:forEach var="sb" items="${ list }">
            <li class="list" style="padding: 10px 0px 0px 0px;">
            <a class="content" >${ sb.s_title }</a>
                <span>| 조회수 : ${ sb.s_count } | ${ sb.s_date }</span>
        </c:forEach>
    </ul>
</div>

<script>


</script>