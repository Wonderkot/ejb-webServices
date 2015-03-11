package serviceEJB;

public class GetDataProxy implements serviceEJB.GetData {
  private String _endpoint = null;
  private serviceEJB.GetData getData = null;
  
  public GetDataProxy() {
    _initGetDataProxy();
  }
  
  public GetDataProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetDataProxy();
  }
  
  private void _initGetDataProxy() {
    try {
      getData = (new serviceEJB.GetDataServiceLocator()).getgetDataPort();
      if (getData != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getData)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getData)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getData != null)
      ((javax.xml.rpc.Stub)getData)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public serviceEJB.GetData getGetData() {
    if (getData == null)
      _initGetDataProxy();
    return getData;
  }
  
  public java.lang.String get() throws java.rmi.RemoteException{
    if (getData == null)
      _initGetDataProxy();
    return getData.get();
  }
  
  
}