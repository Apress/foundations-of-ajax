<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<div id="stockQuoteRoot" style="left:100px; top:200px;">
    <div id="stockQuoteHandle">
        <table width="100%" border="0" class="textbox">
            <tr>
                <td align="left" class="controls">
                    Stock Ticker
                </td>
                <td align="right">
                    <a class="controls" href="javascript:minimize('stockQuoteContent');">
                        -
                    </a>
                    &nbsp;
                    <a class="controls" href="javascript:maximize('stockQuoteContent');">
                        +
                    </a>
                </td>
            </tr>
        </table>
    </div>
    
    <div class="normalText">
        Stock Tickers to Track: 
            <input type="text" name="stockTickers" id="stockTickers" 
                          onkeyup="handleStockTickersChange();" class="normalText"
                          value="<%=ajaxdashboard.Constants.DEFAULT_STOCK_TICKERS%>"
                          style="text-transform:uppercase;"/> 
            &nbsp;&nbsp;
            <input type="checkbox" name="trackFlag" id="trackFlag" value="on"
                       onclick="handleTrackFlagClick();"
                       checked="checked"/>
            Auto Refresh
    </div>
     
    <div id="stockQuoteContent" class="stockQuoteContent"> 
            <%@include file="stockQuoteDetail.jsp"%>
        <%--
        <span id="stockQuoteDetail">
            <%@include file="stockQuoteDetail.jsp"%>
        </span>
        --%>
    </div>

</div>
