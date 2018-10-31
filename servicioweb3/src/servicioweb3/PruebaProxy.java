package servicioweb3;

import java.rmi.RemoteException;

public class PruebaProxy implements servicioweb3.Prueba {
  private String _endpoint = null;
  private servicioweb3.Prueba prueba = null;
  
  public PruebaProxy() {
    _initPruebaProxy();
  }
  
  public PruebaProxy(String endpoint) {
    _endpoint = endpoint;
    _initPruebaProxy();
  }
  
  private void _initPruebaProxy() {
    try {
      prueba = (new servicioweb3.PruebaServiceLocator()).getPrueba();
      if (prueba != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)prueba)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)prueba)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (prueba != null)
      ((javax.xml.rpc.Stub)prueba)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicioweb3.Prueba getPrueba() {
    if (prueba == null)
      _initPruebaProxy();
    return prueba;
  }
  
  public java.lang.String sayHello() throws RemoteException{
    if (prueba == null)
      _initPruebaProxy();
    return prueba.sayHello();
  }
  
  
}