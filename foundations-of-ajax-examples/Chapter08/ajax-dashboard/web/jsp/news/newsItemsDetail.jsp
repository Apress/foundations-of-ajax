<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<c:forEach var="newsItem" items="${newsItems}">
    <div>
        <br/>
        <a href="${newsItem.link}" class="newsLink" target="blank">
            
            ${newsItem.title}
        
        </a>
    </div>
</c:forEach>    
