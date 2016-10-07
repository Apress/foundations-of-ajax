
package ajaxdashboard.service;

import ajaxdashboard.ws.weatherforecast.WeatherData;
import ajaxdashboard.ws.weatherforecast.WeatherForecast;
import ajaxdashboard.ws.weatherforecast.WeatherForecastLocator;
import ajaxdashboard.ws.weatherforecast.WeatherForecastSoap;
import ajaxdashboard.ws.weatherforecast.WeatherForecasts;
import java.text.SimpleDateFormat;
import javax.xml.rpc.ServiceException;

public class WeatherForecastService {
    public WeatherForecasts getForecastFor(String zipCode) {
        WeatherForecasts forecasts = null;
        try {
            forecasts = getWeatherForecastSoap().getWeatherByZipCode(zipCode);
            WeatherData[] dataArray = forecasts.getDetails().getWeatherData();
            
            WeatherData data = null;
            SimpleDateFormat parser = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
            SimpleDateFormat formatter = new SimpleDateFormat("EEE. MM/dd");
            for(int i = 0; i < dataArray.length; i++) {
                data = dataArray[i];
                try {
                    data.setDay(formatter.format(parser.parse(data.getDay())));
                }
                catch(Exception e) {
                    System.out.println("\n\n\nParsing Exception: " + e);
                }
            }

        } 
        catch(java.rmi.RemoteException ex) {
            // TODO handle remote exception
        }

        return forecasts;
    }

    private WeatherForecastSoap getWeatherForecastSoap() {
        WeatherForecastSoap weatherForecastSoap = null;
        try {
            weatherForecastSoap = new WeatherForecastLocator().getWeatherForecastSoap();
        } 
        catch (ServiceException ex) {
            ex.printStackTrace();
        }
        
        return weatherForecastSoap;
    }
}
