/**
 * WeatherForecasts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.weatherforecast;

public class WeatherForecasts  implements java.io.Serializable {
    private float latitude;
    private float longitude;
    private float allocationFactor;
    private java.lang.String fipsCode;
    private java.lang.String placeName;
    private java.lang.String stateCode;
    private java.lang.String status;
    private ajaxdashboard.ws.weatherforecast.ArrayOfWeatherData details;

    public WeatherForecasts() {
    }

    public WeatherForecasts(
           float latitude,
           float longitude,
           float allocationFactor,
           java.lang.String fipsCode,
           java.lang.String placeName,
           java.lang.String stateCode,
           java.lang.String status,
           ajaxdashboard.ws.weatherforecast.ArrayOfWeatherData details) {
           this.latitude = latitude;
           this.longitude = longitude;
           this.allocationFactor = allocationFactor;
           this.fipsCode = fipsCode;
           this.placeName = placeName;
           this.stateCode = stateCode;
           this.status = status;
           this.details = details;
    }


    /**
     * Gets the latitude value for this WeatherForecasts.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this WeatherForecasts.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this WeatherForecasts.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this WeatherForecasts.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the allocationFactor value for this WeatherForecasts.
     * 
     * @return allocationFactor
     */
    public float getAllocationFactor() {
        return allocationFactor;
    }


    /**
     * Sets the allocationFactor value for this WeatherForecasts.
     * 
     * @param allocationFactor
     */
    public void setAllocationFactor(float allocationFactor) {
        this.allocationFactor = allocationFactor;
    }


    /**
     * Gets the fipsCode value for this WeatherForecasts.
     * 
     * @return fipsCode
     */
    public java.lang.String getFipsCode() {
        return fipsCode;
    }


    /**
     * Sets the fipsCode value for this WeatherForecasts.
     * 
     * @param fipsCode
     */
    public void setFipsCode(java.lang.String fipsCode) {
        this.fipsCode = fipsCode;
    }


    /**
     * Gets the placeName value for this WeatherForecasts.
     * 
     * @return placeName
     */
    public java.lang.String getPlaceName() {
        return placeName;
    }


    /**
     * Sets the placeName value for this WeatherForecasts.
     * 
     * @param placeName
     */
    public void setPlaceName(java.lang.String placeName) {
        this.placeName = placeName;
    }


    /**
     * Gets the stateCode value for this WeatherForecasts.
     * 
     * @return stateCode
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this WeatherForecasts.
     * 
     * @param stateCode
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }


    /**
     * Gets the status value for this WeatherForecasts.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WeatherForecasts.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the details value for this WeatherForecasts.
     * 
     * @return details
     */
    public ajaxdashboard.ws.weatherforecast.ArrayOfWeatherData getDetails() {
        return details;
    }


    /**
     * Sets the details value for this WeatherForecasts.
     * 
     * @param details
     */
    public void setDetails(ajaxdashboard.ws.weatherforecast.ArrayOfWeatherData details) {
        this.details = details;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WeatherForecasts)) return false;
        WeatherForecasts other = (WeatherForecasts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            this.allocationFactor == other.getAllocationFactor() &&
            ((this.fipsCode==null && other.getFipsCode()==null) || 
             (this.fipsCode!=null &&
              this.fipsCode.equals(other.getFipsCode()))) &&
            ((this.placeName==null && other.getPlaceName()==null) || 
             (this.placeName!=null &&
              this.placeName.equals(other.getPlaceName()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails())));
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
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        _hashCode += new Float(getAllocationFactor()).hashCode();
        if (getFipsCode() != null) {
            _hashCode += getFipsCode().hashCode();
        }
        if (getPlaceName() != null) {
            _hashCode += getPlaceName().hashCode();
        }
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WeatherForecasts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservicex.net", "WeatherForecasts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "AllocationFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fipsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "FipsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "PlaceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "StateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservicex.net", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservicex.net", "ArrayOfWeatherData"));
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
