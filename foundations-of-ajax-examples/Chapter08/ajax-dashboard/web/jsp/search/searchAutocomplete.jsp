<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://taconite.sf.net/tags" prefix="tac" %>

<tac:taconiteRoot>
    
    <tac:replaceChildren contextNodeID="popup" parseOnServer="true">
        
        <c:forEach var="result" items="${results}">
            <div onmouseover="hilite(this);" onmouseout="unhilite(this);">
                <a href="${result.url}" class="autocomplete" target="_blank">
                    ${result.title}
                </a>
            </div>
        </c:forEach>
                       
    </tac:replaceChildren>
    
</tac:taconiteRoot>

