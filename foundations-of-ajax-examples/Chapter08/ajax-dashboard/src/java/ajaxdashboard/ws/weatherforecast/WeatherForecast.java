/**
 * WeatherForecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.weatherforecast;

public interface WeatherForecast extends javax.xml.rpc.Service {

/**
 * Get one week weather forecast for valid zip code or Place name
 * in USA
 */
    public java.lang.String getWeatherForecastSoapAddress();

    public ajaxdashboard.ws.weatherforecast.WeatherForecastSoap getWeatherForecastSoap() throws javax.xml.rpc.ServiceException;

    public ajaxdashboard.ws.weatherforecast.WeatherForecastSoap getWeatherForecastSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
