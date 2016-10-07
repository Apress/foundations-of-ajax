/**
 * GetQuotesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.stockquote;

public class GetQuotesResponse  implements java.io.Serializable {
    private ajaxdashboard.ws.stockquote.ArrayOfQuote getQuotesResult;

    public GetQuotesResponse() {
    }

    public GetQuotesResponse(
           ajaxdashboard.ws.stockquote.ArrayOfQuote getQuotesResult) {
           this.getQuotesResult = getQuotesResult;
    }


    /**
     * Gets the getQuotesResult value for this GetQuotesResponse.
     * 
     * @return getQuotesResult
     */
    public ajaxdashboard.ws.stockquote.ArrayOfQuote getGetQuotesResult() {
        return getQuotesResult;
    }


    /**
     * Sets the getQuotesResult value for this GetQuotesResponse.
     * 
     * @param getQuotesResult
     */
    public void setGetQuotesResult(ajaxdashboard.ws.stockquote.ArrayOfQuote getQuotesResult) {
        this.getQuotesResult = getQuotesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQuotesResponse)) return false;
        GetQuotesResponse other = (GetQuotesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getQuotesResult==null && other.getGetQuotesResult()==null) || 
             (this.getQuotesResult!=null &&
              this.getQuotesResult.equals(other.getGetQuotesResult())));
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
        if (getGetQuotesResult() != null) {
            _hashCode += getGetQuotesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetQuotesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://swanandmokashi.com", ">GetQuotesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQuotesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "GetQuotesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://swanandmokashi.com", "ArrayOfQuote"));
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
