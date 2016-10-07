/**
 * WeatherForecastLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.weatherforecast;

public class WeatherForecastLocator extends org.apache.axis.client.Service implements ajaxdashboard.ws.weatherforecast.WeatherForecast {

/**
 * Get one week weather forecast for valid zip code or Place name
 * in USA
 */

    public WeatherForecastLocator() {
    }


    public WeatherForecastLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WeatherForecastLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WeatherForecastSoap
    private java.lang.String WeatherForecastSoap_address = "http://www.webservicex.net/WeatherForecast.asmx";

    public java.lang.String getWeatherForecastSoapAddress() {
        return WeatherForecastSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WeatherForecastSoapWSDDServiceName = "WeatherForecastSoap";

    public java.lang.String getWeatherForecastSoapWSDDServiceName() {
        return WeatherForecastSoapWSDDServiceName;
    }

    public void setWeatherForecastSoapWSDDServiceName(java.lang.String name) {
        WeatherForecastSoapWSDDServiceName = name;
    }

    public ajaxdashboard.ws.weatherforecast.WeatherForecastSoap getWeatherForecastSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherForecastSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherForecastSoap(endpoint);
    }

    public ajaxdashboard.ws.weatherforecast.WeatherForecastSoap getWeatherForecastSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ajaxdashboard.ws.weatherforecast.WeatherForecastSoapStub _stub = new ajaxdashboard.ws.weatherforecast.WeatherForecastSoapStub(portAddress, this);
            _stub.setPortName(getWeatherForecastSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherForecastSoapEndpointAddress(java.lang.String address) {
        WeatherForecastSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ajaxdashboard.ws.weatherforecast.WeatherForecastSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ajaxdashboard.ws.weatherforecast.WeatherForecastSoapStub _stub = new ajaxdashboard.ws.weatherforecast.WeatherForecastSoapStub(new java.net.URL(WeatherForecastSoap_address), this);
                _stub.setPortName(getWeatherForecastSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WeatherForecastSoap".equals(inputPortName)) {
            return getWeatherForecastSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.webservicex.net", "WeatherForecast");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.webservicex.net", "WeatherForecastSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WeatherForecastSoap".equals(portName)) {
            setWeatherForecastSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
