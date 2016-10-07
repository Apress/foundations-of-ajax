/**
 * ArrayOfWeatherData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.weatherforecast;

public class ArrayOfWeatherData  implements java.io.Serializable {
    private ajaxdashboard.ws.weatherforecast.WeatherData[] weatherData;

    public ArrayOfWeatherData() {
    }

    public ArrayOfWeatherData(
           ajaxdashboard.ws.weatherforecast.WeatherData[] weatherData) {
           this.weatherData = weatherData;
    }


    /**
     * Gets the weatherData value for this ArrayOfWeatherData.
     * 
     * @return weatherData
     */
    public ajaxdashboard.ws.weatherforecast.WeatherData[] getWeatherData() {
        return weatherData;
    }


    /**
     * Sets the weatherData value for this ArrayOfWeatherData.
     * 
     * @param weatherData
     */
    public void setWeatherData(ajaxdashboard.ws.weatherforecast.WeatherData[] weatherData) {
        this.weatherData = weatherData;
    }

    public ajaxdashboard.ws.weatherforecast.WeatherData getWeatherData(int i) {
        return this.weatherData[i];
    }

    public void setWeatherData(int i, ajaxdashboard.ws.weatherforecast.WeatherData _value) {
        this.weatherData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfWeatherData)) return false;
        ArrayOfWeatherData other = (ArrayOfWeatherData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.weatherData==null && other.getWeatherData()==null) || 
             (this.weatherData!=null &&
              java.util.Arrays.equals(this.weatherData, other.getWeatherData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWeatherData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeatherData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeatherData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfWeatherData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservicex.net", "ArrayOfWeatherData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "WeatherData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservicex.net", "WeatherData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
