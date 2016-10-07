<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://taconite.sf.net/tags" prefix="tac" %>

<tac:taconiteRoot>
    
    <tac:replaceChildren contextNodeID="stockQuoteContent">
        
       <%@include file="stockQuoteDetail.jsp"%>  
       
    </tac:replaceChildren>
    
</tac:taconiteRoot>

