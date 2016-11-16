package it.alfasoft.andrea;

public class FatturaServiceProxy implements it.alfasoft.andrea.FatturaService {
  private String _endpoint = null;
  private it.alfasoft.andrea.FatturaService fatturaService = null;
  
  public FatturaServiceProxy() {
    _initFatturaServiceProxy();
  }
  
  public FatturaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFatturaServiceProxy();
  }
  
  private void _initFatturaServiceProxy() {
    try {
      fatturaService = (new it.alfasoft.andrea.FatturaServiceServiceLocator()).getFatturaService();
      if (fatturaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fatturaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fatturaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fatturaService != null)
      ((javax.xml.rpc.Stub)fatturaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.alfasoft.andrea.FatturaService getFatturaService() {
    if (fatturaService == null)
      _initFatturaServiceProxy();
    return fatturaService;
  }
  
  public it.alfasoft.andrea.Fattura[] prendiTutteFatture() throws java.rmi.RemoteException{
    if (fatturaService == null)
      _initFatturaServiceProxy();
    return fatturaService.prendiTutteFatture();
  }
  
  public it.alfasoft.andrea.Fattura prendiFatturaConCodice(java.lang.String codice) throws java.rmi.RemoteException{
    if (fatturaService == null)
      _initFatturaServiceProxy();
    return fatturaService.prendiFatturaConCodice(codice);
  }
  
  
}