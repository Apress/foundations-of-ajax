<%@page contentType="text/xml"%>

<taconite-root>
    <taconite-replace-children contextNodeID="newsItemsContent" 
                                                             parseInBrowser="true">
        
        <%@include file="newsItemsDetail.jsp"%>
    
    </taconite-replace-children>
    
</taconite-root> 