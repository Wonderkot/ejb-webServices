/**
 * 
 */
package serviceEJB;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Wonderkot
 *
 */
@Stateless
@WebService(name="getData")
public class GetData implements IGetData {

	/* (non-Javadoc)
	 * @see serviceEJB.IGetData#get()
	 */
	@Override
	@WebMethod(operationName="get")
	public String get() {
		// TODO Auto-generated method stub
		return "hello world";
	}

}
