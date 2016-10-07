<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<c:forEach var="quote" items="${quotesArray}">
    
    <table>
        <tbody>
            <tr>
                <td colspan="2" style="font-weight:bold;">
                    ${quote.companyName} (${quote.stockTicker})
                </td>
            </tr>
            <tr>
                <td>Current Price:</td>
                <td>${quote.stockQuote}</td>
            </tr>
            <tr>
                <td>Change:</td>
                <td>${quote.change}</td>
            </tr>
            <tr>
                <td>Last Updated:</td>
                <td>${quote.lastUpdated}</td>
            </tr>
        </tbody>
    </table>

</c:forEach>    
