<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    
<head>
    <title>Ajax Dashboard</title>
    <script type="text/javascript" src="js/autocomplete.js"></script>
    <script type="text/javascript" src="js/dom-drag.js"></script>
    <script type="text/javascript" src="js/common.js"></script>
    <script type="text/javascript" src="js/weatherForecast.js"></script>
    <script type="text/javascript" src="js/stockQuote.js"></script>
    <script type="text/javascript" src="js/news.js"></script>
    <script type="text/javascript" src="js/search.js"></script>
    <script type="text/javascript" src="js/taconite/taconite-client.js"></script>
    <script type="text/javascript" src="js/taconite/taconite-parser.js"></script>
    <link type="text/css" rel="stylesheet" title="style" href="css/styles.css" >   
                                                                            </link>
</head>

<body>

<%@ include file="weather/weatherForecast.jsp" %>

<%@ include file="stockQuote/stockQuote.jsp" %>

<%@ include file="news/newsItems.jsp" %>

<%@ include file="search/search.jsp" %>

<script type="text/javascript" src="js/ajaxDashboard.js"></script>

<div style="position:absolute;overflow:auto;display:none;background-color:white" 
                                                                id="popup">
</div>


</body>

</html>






