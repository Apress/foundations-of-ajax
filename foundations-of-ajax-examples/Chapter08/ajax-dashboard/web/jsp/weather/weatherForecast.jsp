<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<div id="root" style="left:20px; top:20px;">
    <div id="handle">
            
        <table width="100%" border="0" class="textbox">
            <tr>
                <td align="left" class="controls">
                    <span id="forecastLocation">
                        <%@ include file="weatherLocation.jsp" %>
                    </span>
                </td>
                <td align="right">
                    <a class="controls" href="javascript:minimize('weatherContent');">
                        -
                    </a>
                    &nbsp;
                    <a class="controls" href="javascript:maximize('weatherContent');">
                        +
                    </a>
                </td>
            </tr>
        </table>

    </div>
    
    <div class="normalText">
        Zip Code: 
        <input type="text" name="forecastZipCode" id="forecastZipCode" 
            onkeyup="handleZipCodeChange();" class="normalText" 
            value="<%=ajaxdashboard.Constants.DEFAULT_WEATHER_ZIP_CODE%>"/>
            
    </div>
    
    <div id="weatherContent">
       <%@ include file="weatherTable.jsp" %>
    </div>
</div>
