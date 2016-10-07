/**
 * Quote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.stockquote;

public class Quote  implements java.io.Serializable {
    private java.lang.String companyName;
    private java.lang.String stockTicker;
    private java.lang.String stockQuote;
    private java.lang.String lastUpdated;
    private java.lang.String change;
    private java.lang.String openPrice;
    private java.lang.String dayHighPrice;
    private java.lang.String dayLowPrice;
    private java.lang.String volume;
    private java.lang.String marketCap;
    private java.lang.String yearRange;

    public Quote() {
    }

    public Quote(
           java.lang.String companyName,
           java.lang.String stockTicker,
           java.lang.String stockQuote,
           java.lang.String lastUpdated,
           java.lang.String change,
           java.lang.String openPrice,
           java.lang.String dayHighPrice,
           java.lang.String dayLowPrice,
           java.lang.String volume,
           java.lang.String marketCap,
           java.lang.String yearRange) {
           this.companyName = companyName;
           this.stockTicker = stockTicker;
           this.stockQuote = stockQuote;
           this.lastUpdated = lastUpdated;
           this.change = change;
           this.openPrice = openPrice;
           this.dayHighPrice = dayHighPrice;
           this.dayLowPrice = dayLowPrice;
           this.volume = volume;
           this.marketCap = marketCap;
           this.yearRange = yearRange;
    }


    /**
     * Gets the companyName value for this Quote.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this Quote.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the stockTicker value for this Quote.
     * 
     * @return stockTicker
     */
    public java.lang.String getStockTicker() {
        return stockTicker;
    }


    /**
     * Sets the stockTicker value for this Quote.
     * 
     * @param stockTicker
     */
    public void setStockTicker(java.lang.String stockTicker) {
        this.stockTicker = stockTicker;
    }


    /**
     * Gets the stockQuote value for this Quote.
     * 
     * @return stockQuote
     */
    public java.lang.String getStockQuote() {
        return stockQuote;
    }


    /**
     * Sets the stockQuote value for this Quote.
     * 
     * @param stockQuote
     */
    public void setStockQuote(java.lang.String stockQuote) {
        this.stockQuote = stockQuote;
    }


    /**
     * Gets the lastUpdated value for this Quote.
     * 
     * @return lastUpdated
     */
    public java.lang.String getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this Quote.
     * 
     * @param lastUpdated
     */
    public void setLastUpdated(java.lang.String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the change value for this Quote.
     * 
     * @return change
     */
    public java.lang.String getChange() {
        return change;
    }


    /**
     * Sets the change value for this Quote.
     * 
     * @param change
     */
    public void setChange(java.lang.String change) {
        this.change = change;
    }


    /**
     * Gets the openPrice value for this Quote.
     * 
     * @return openPrice
     */
    public java.lang.String getOpenPrice() {
        return openPrice;
    }


    /**
     * Sets the openPrice value for this Quote.
     * 
     * @param openPrice
     */
    public void setOpenPrice(java.lang.String openPrice) {
        this.openPrice = openPrice;
    }


    /**
     * Gets the dayHighPrice value for this Quote.
     * 
     * @return dayHighPrice
     */
    public java.lang.String getDayHighPrice() {
        return dayHighPrice;
    }


    /**
     * Sets the dayHighPrice value for this Quote.
     * 
     * @param dayHighPrice
     */
    public void setDayHighPrice(java.lang.String dayHighPrice) {
        this.dayHighPrice = dayHighPrice;
    }


    /**
     * Gets the dayLowPrice value for this Quote.
     * 
     * @return dayLowPrice
     */
    public java.lang.String getDayLowPrice() {
        return dayLowPrice;
    }


    /**
     * Sets the dayLowPrice value for this Quote.
     * 
     * @param dayLowPrice
     */
    public void setDayLowPrice(java.lang.String dayLowPrice) {
        this.dayLowPrice = dayLowPrice;
    }


    /**
     * Gets the volume value for this Quote.
     * 
     * @return volume
     */
    public java.lang.String getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this Quote.
     * 
     * @param volume
     */
    public void setVolume(java.lang.String volume) {
        this.volume = volume;
    }


    /**
     * Gets the marketCap value for this Quote.
     * 
     * @return marketCap
     */
    public java.lang.String getMarketCap() {
        return marketCap;
    }


    /**
     * Sets the marketCap value for this Quote.
     * 
     * @param marketCap
     */
    public void setMarketCap(java.lang.String marketCap) {
        this.marketCap = marketCap;
    }


    /**
     * Gets the yearRange value for this Quote.
     * 
     * @return yearRange
     */
    public java.lang.String getYearRange() {
        return yearRange;
    }


    /**
     * Sets the yearRange value for this Quote.
     * 
     * @param yearRange
     */
    public void setYearRange(java.lang.String yearRange) {
        this.yearRange = yearRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Quote)) return false;
        Quote other = (Quote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.stockTicker==null && other.getStockTicker()==null) || 
             (this.stockTicker!=null &&
              this.stockTicker.equals(other.getStockTicker()))) &&
            ((this.stockQuote==null && other.getStockQuote()==null) || 
             (this.stockQuote!=null &&
              this.stockQuote.equals(other.getStockQuote()))) &&
            ((this.lastUpdated==null && other.getLastUpdated()==null) || 
             (this.lastUpdated!=null &&
              this.lastUpdated.equals(other.getLastUpdated()))) &&
            ((this.change==null && other.getChange()==null) || 
             (this.change!=null &&
              this.change.equals(other.getChange()))) &&
            ((this.openPrice==null && other.getOpenPrice()==null) || 
             (this.openPrice!=null &&
              this.openPrice.equals(other.getOpenPrice()))) &&
            ((this.dayHighPrice==null && other.getDayHighPrice()==null) || 
             (this.dayHighPrice!=null &&
              this.dayHighPrice.equals(other.getDayHighPrice()))) &&
            ((this.dayLowPrice==null && other.getDayLowPrice()==null) || 
             (this.dayLowPrice!=null &&
              this.dayLowPrice.equals(other.getDayLowPrice()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.marketCap==null && other.getMarketCap()==null) || 
             (this.marketCap!=null &&
              this.marketCap.equals(other.getMarketCap()))) &&
            ((this.yearRange==null && other.getYearRange()==null) || 
             (this.yearRange!=null &&
              this.yearRange.equals(other.getYearRange())));
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
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getStockTicker() != null) {
            _hashCode += getStockTicker().hashCode();
        }
        if (getStockQuote() != null) {
            _hashCode += getStockQuote().hashCode();
        }
        if (getLastUpdated() != null) {
            _hashCode += getLastUpdated().hashCode();
        }
        if (getChange() != null) {
            _hashCode += getChange().hashCode();
        }
        if (getOpenPrice() != null) {
            _hashCode += getOpenPrice().hashCode();
        }
        if (getDayHighPrice() != null) {
            _hashCode += getDayHighPrice().hashCode();
        }
        if (getDayLowPrice() != null) {
            _hashCode += getDayLowPrice().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getMarketCap() != null) {
            _hashCode += getMarketCap().hashCode();
        }
        if (getYearRange() != null) {
            _hashCode += getYearRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Quote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://swanandmokashi.com", "Quote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockTicker");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "StockTicker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockQuote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "StockQuote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "LastUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "Change"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "OpenPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayHighPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "DayHighPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayLowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "DayLowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "Volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketCap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "MarketCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swanandmokashi.com", "YearRange"));
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
