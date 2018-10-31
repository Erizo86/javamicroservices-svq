/**
 * PruebaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicioweb3;

public class PruebaServiceLocator extends org.apache.axis.client.Service implements servicioweb3.PruebaService {

    public PruebaServiceLocator() {
    }


    public PruebaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PruebaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Prueba
    private java.lang.String Prueba_address = "http://localhost:8080/servicioweb3/services/Prueba";

    public java.lang.String getPruebaAddress() {
        return Prueba_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PruebaWSDDServiceName = "Prueba";

    public java.lang.String getPruebaWSDDServiceName() {
        return PruebaWSDDServiceName;
    }

    public void setPruebaWSDDServiceName(java.lang.String name) {
        PruebaWSDDServiceName = name;
    }

    public servicioweb3.Prueba getPrueba() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Prueba_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPrueba(endpoint);
    }

    public servicioweb3.Prueba getPrueba(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            servicioweb3.PruebaSoapBindingStub _stub = new servicioweb3.PruebaSoapBindingStub(portAddress, this);
            _stub.setPortName(getPruebaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPruebaEndpointAddress(java.lang.String address) {
        Prueba_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (servicioweb3.Prueba.class.isAssignableFrom(serviceEndpointInterface)) {
                servicioweb3.PruebaSoapBindingStub _stub = new servicioweb3.PruebaSoapBindingStub(new java.net.URL(Prueba_address), this);
                _stub.setPortName(getPruebaWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Prueba".equals(inputPortName)) {
            return getPrueba();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicioweb3", "PruebaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicioweb3", "Prueba"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Prueba".equals(portName)) {
            setPruebaEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
