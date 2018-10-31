/**
 * PruebaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicioweb3;

public interface PruebaService extends javax.xml.rpc.Service {
    public java.lang.String getPruebaAddress();

    public servicioweb3.Prueba getPrueba() throws javax.xml.rpc.ServiceException;

    public servicioweb3.Prueba getPrueba(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
