/**
 * ArrayOfQuote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.stockquote;

public class ArrayOfQuote  implements java.io.Serializable {
    private ajaxdashboard.ws.stockquote.Quote[] quote;

    public ArrayOfQuote() {
    }

    public ArrayOfQuote(
           ajaxdashboard.ws.stockquote.Quote[] quote) {
           this.quote = quote;
    }


    /**
     * Gets the quote value for this ArrayOfQuote.
     * 
     * @return quote
     */
    public ajaxdashboard.ws.stockquote.Quote[] getQuote() {
        return quote;
    }


    /**
     * Sets the quote value for this ArrayOfQuote.
     * 
     * @param quote
     */
    public void setQuote(ajaxdashboard.ws.stockquote.Quote[] quote) {
        this.quote = quote;
    }

    public ajaxdashboard.ws.stockquote.Quote getQuote(int i) {
        return this.quote[i];
    }

    public void setQuote(int i, ajaxdashboard.ws.stockquote.Quote _value) {
        this.quote[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfQuote)) return false;
        ArrayOfQuote other = (ArrayOfQuote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quote==null && other.getQuote()==null) || 
             (this.quote!=null &&
              java.util.Arrays.equals(this.quote, other.getQuote())));
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
        if (getQuote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuote(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfQuote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://swanandmokashi.com", "ArrayOfQuote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "Quote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://swanandmokashi.com", "Quote"));
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
