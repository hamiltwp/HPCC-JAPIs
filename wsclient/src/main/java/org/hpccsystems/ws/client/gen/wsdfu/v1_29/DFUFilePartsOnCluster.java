/**
 * DFUFilePartsOnCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_29;

public class DFUFilePartsOnCluster  implements java.io.Serializable {
    private java.lang.String cluster;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUPart[] DFUFileParts;

    public DFUFilePartsOnCluster() {
    }

    public DFUFilePartsOnCluster(
           java.lang.String cluster,
           org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUPart[] DFUFileParts) {
           this.cluster = cluster;
           this.DFUFileParts = DFUFileParts;
    }


    /**
     * Gets the cluster value for this DFUFilePartsOnCluster.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this DFUFilePartsOnCluster.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the DFUFileParts value for this DFUFilePartsOnCluster.
     * 
     * @return DFUFileParts
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUPart[] getDFUFileParts() {
        return DFUFileParts;
    }


    /**
     * Sets the DFUFileParts value for this DFUFilePartsOnCluster.
     * 
     * @param DFUFileParts
     */
    public void setDFUFileParts(org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUPart[] DFUFileParts) {
        this.DFUFileParts = DFUFileParts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFilePartsOnCluster)) return false;
        DFUFilePartsOnCluster other = (DFUFilePartsOnCluster) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.DFUFileParts==null && other.getDFUFileParts()==null) || 
             (this.DFUFileParts!=null &&
              java.util.Arrays.equals(this.DFUFileParts, other.getDFUFileParts())));
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
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getDFUFileParts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDFUFileParts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDFUFileParts(), i);
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
        new org.apache.axis.description.TypeDesc(DFUFilePartsOnCluster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFilePartsOnCluster"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFUFileParts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPart"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPart"));
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