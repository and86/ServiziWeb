/**
 * FatturaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.alfasoft.andrea;

public interface FatturaService extends java.rmi.Remote {
    public it.alfasoft.andrea.Fattura[] prendiTutteFatture() throws java.rmi.RemoteException;
    public it.alfasoft.andrea.Fattura prendiFatturaConCodice(java.lang.String codice) throws java.rmi.RemoteException;
}
