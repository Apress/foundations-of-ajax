/**
 * WeatherForecastSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.weatherforecast;

public interface WeatherForecastSoap extends java.rmi.Remote {

    /**
     * Get one week weather forecast for a valid Zip Code(USA)
     */
    public ajaxdashboard.ws.weatherforecast.WeatherForecasts getWeatherByZipCode(java.lang.String zipCode) throws java.rmi.RemoteException;

    /**
     * Get one week  weather forecast for a place name(USA)
     */
    public ajaxdashboard.ws.weatherforecast.WeatherForecasts getWeatherByPlaceName(java.lang.String placeName) throws java.rmi.RemoteException;
}
