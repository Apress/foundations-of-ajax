<%@ taglib uri="http://taconite.sf.net/tags" prefix="tac" %>

<tac:taconiteRoot>

    <tac:replaceChildren contextNodeID="forecastLocation" parseOnServer="true">

        <%@ include file="weatherLocation.jsp" %>
    
    </tac:replaceChildren>

    <tac:replaceChildren contextNodeID="weatherContent" parseOnServer="true">
        
        <%@ include file="weatherTable.jsp" %>

    </tac:replaceChildren>
    
</tac:taconiteRoot>
