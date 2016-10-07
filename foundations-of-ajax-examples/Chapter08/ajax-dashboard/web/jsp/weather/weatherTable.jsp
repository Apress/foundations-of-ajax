<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<table>
    <tbody>
        <tr>
            <c:forEach var="forecast" items="${forecastData.details.weatherData}">    
                <td>
                    ${forecast.day}

                    <br/>
                    High: ${forecast.maxTemperatureF}

                    <br/>
                    Low: ${forecast.minTemperatureF}

                    <br/>
                    <img src="${forecast.weatherImage}" alt="forecast image"/>
                </td>
            </c:forEach>
        </tr>
    </tbody>    
</table>
