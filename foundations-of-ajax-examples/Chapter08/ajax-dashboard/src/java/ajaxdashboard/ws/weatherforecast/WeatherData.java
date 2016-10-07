/**
 * WeatherData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.weatherforecast;

public class WeatherData  implements java.io.Serializable {
    private java.lang.String day;
    private java.lang.String weatherImage;
    private java.lang.String maxTemperatureF;
    private java.lang.String minTemperatureF;
    private java.lang.String maxTemperatureC;
    private java.lang.String minTemperatureC;

    public WeatherData() {
    }

    public WeatherData(
           java.lang.String day,
           java.lang.String weatherImage,
           java.lang.String maxTemperatureF,
           java.lang.String minTemperatureF,
           java.lang.String maxTemperatureC,
           java.lang.String minTemperatureC) {
           this.day = day;
           this.weatherImage = weatherImage;
           this.maxTemperatureF = maxTemperatureF;
           this.minTemperatureF = minTemperatureF;
           this.maxTemperatureC = maxTemperatureC;
           this.minTemperatureC = minTemperatureC;
    }


    /**
     * Gets the day value for this WeatherData.
     * 
     * @return day
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this WeatherData.
     * 
     * @param day
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the weatherImage value for this WeatherData.
     * 
     * @return weatherImage
     */
    public java.lang.String getWeatherImage() {
        return weatherImage;
    }


    /**
     * Sets the weatherImage value for this WeatherData.
     * 
     * @param weatherImage
     */
    public void setWeatherImage(java.lang.String weatherImage) {
        this.weatherImage = weatherImage;
    }


    /**
     * Gets the maxTemperatureF value for this WeatherData.
     * 
     * @return maxTemperatureF
     */
    public java.lang.String getMaxTemperatureF() {
        return maxTemperatureF;
    }


    /**
     * Sets the maxTemperatureF value for this WeatherData.
     * 
     * @param maxTemperatureF
     */
    public void setMaxTemperatureF(java.lang.String maxTemperatureF) {
        this.maxTemperatureF = maxTemperatureF;
    }


    /**
     * Gets the minTemperatureF value for this WeatherData.
     * 
     * @return minTemperatureF
     */
    public java.lang.String getMinTemperatureF() {
        return minTemperatureF;
    }


    /**
     * Sets the minTemperatureF value for this WeatherData.
     * 
     * @param minTemperatureF
     */
    public void setMinTemperatureF(java.lang.String minTemperatureF) {
        this.minTemperatureF = minTemperatureF;
    }


    /**
     * Gets the maxTemperatureC value for this WeatherData.
     * 
     * @return maxTemperatureC
     */
    public java.lang.String getMaxTemperatureC() {
        return maxTemperatureC;
    }


    /**
     * Sets the maxTemperatureC value for this WeatherData.
     * 
     * @param maxTemperatureC
     */
    public void setMaxTemperatureC(java.lang.String maxTemperatureC) {
        this.maxTemperatureC = maxTemperatureC;
    }


    /**
     * Gets the minTemperatureC value for this WeatherData.
     * 
     * @return minTemperatureC
     */
    public java.lang.String getMinTemperatureC() {
        return minTemperatureC;
    }


    /**
     * Sets the minTemperatureC value for this WeatherData.
     * 
     * @param minTemperatureC
     */
    public void setMinTemperatureC(java.lang.String minTemperatureC) {
        this.minTemperatureC = minTemperatureC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherData)) return false;
        WeatherData other = (WeatherData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.weatherImage==null && other.getWeatherImage()==null) || 
             (this.weatherImage!=null &&
              this.weatherImage.equals(other.getWeatherImage()))) &&
            ((this.maxTemperatureF==null && other.getMaxTemperatureF()==null) || 
             (this.maxTemperatureF!=null &&
              this.maxTemperatureF.equals(other.getMaxTemperatureF()))) &&
            ((this.minTemperatureF==null && other.getMinTemperatureF()==null) || 
             (this.minTemperatureF!=null &&
              this.minTemperatureF.equals(other.getMinTemperatureF()))) &&
            ((this.maxTemperatureC==null && other.getMaxTemperatureC()==null) || 
             (this.maxTemperatureC!=null &&
              this.maxTemperatureC.equals(other.getMaxTemperatureC()))) &&
            ((this.minTemperatureC==null && other.getMinTemperatureC()==null) || 
             (this.minTemperatureC!=null &&
              this.minTemperatureC.equals(other.getMinTemperatureC())));
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
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getWeatherImage() != null) {
            _hashCode += getWeatherImage().hashCode();
        }
        if (getMaxTemperatureF() != null) {
            _hashCode += getMaxTemperatureF().hashCode();
        }
        if (getMinTemperatureF() != null) {
            _hashCode += getMinTemperatureF().hashCode();
        }
        if (getMaxTemperatureC() != null) {
            _hashCode += getMaxTemperatureC().hashCode();
        }
        if (getMinTemperatureC() != null) {
            _hashCode += getMinTemperatureC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WeatherData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservicex.net", "WeatherData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "WeatherImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTemperatureF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "MaxTemperatureF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minTemperatureF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "MinTemperatureF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTemperatureC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "MaxTemperatureC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minTemperatureC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "MinTemperatureC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
