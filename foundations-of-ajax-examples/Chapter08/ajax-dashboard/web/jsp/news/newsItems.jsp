<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<div id="newsItemsRoot" style="left:400px; top:300px;">
    <div id="newsItemsHandle">
        <table width="100%" border="0" class="textbox">
            <tr>
                <td align="left" class="controls">
                    Top News Stories Powered by Yahoo!
                </td>
                <td align="right">
                    <a class="controls" 
                                   href="javascript:minimize('newsItemsContent');">
                        -
                    </a>
                    &nbsp;
                    <a class="controls" 
                                   href="javascript:maximize('newsItemsContent');">
                        +
                    </a>
                </td>
            </tr>
        </table>
    </div>
        
    <div id="newsItemsContent" class="newsItemsContent">  

        <%@include file="newsItemsDetail.jsp"%>
    
    </div>

</div>
