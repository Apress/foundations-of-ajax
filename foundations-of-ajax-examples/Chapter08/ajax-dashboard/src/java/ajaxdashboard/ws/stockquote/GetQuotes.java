/**
 * GetQuotes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.stockquote;

public class GetQuotes  implements java.io.Serializable {
    private java.lang.String quoteTicker;

    public GetQuotes() {
    }

    public GetQuotes(
           java.lang.String quoteTicker) {
           this.quoteTicker = quoteTicker;
    }


    /**
     * Gets the quoteTicker value for this GetQuotes.
     * 
     * @return quoteTicker
     */
    public java.lang.String getQuoteTicker() {
        return quoteTicker;
    }


    /**
     * Sets the quoteTicker value for this GetQuotes.
     * 
     * @param quoteTicker
     */
    public void setQuoteTicker(java.lang.String quoteTicker) {
        this.quoteTicker = quoteTicker;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQuotes)) return false;
        GetQuotes other = (GetQuotes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quoteTicker==null && other.getQuoteTicker()==null) || 
             (this.quoteTicker!=null &&
              this.quoteTicker.equals(other.getQuoteTicker())));
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
        if (getQuoteTicker() != null) {
            _hashCode += getQuoteTicker().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetQuotes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://swanandmokashi.com", ">GetQuotes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteTicker");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "QuoteTicker"));
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
