/**
 * FatturaServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.andrea;

public interface FatturaServiceService extends javax.xml.rpc.Service {
    public java.lang.String getFatturaServiceAddress();

    public it.alfasoft.andrea.FatturaService getFatturaService() throws javax.xml.rpc.ServiceException;

    public it.alfasoft.andrea.FatturaService getFatturaService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
