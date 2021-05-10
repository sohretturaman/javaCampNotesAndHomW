package Adapters;

import java.rmi.RemoteException;

import Abstracts.CheckCustomerService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckCustomerService{

	@Override
	public boolean CheckPerson(Customer customer) {
		KPSPublicSoapProxy clientKpsPublicSoapProxy=new KPSPublicSoapProxy();
		
		try {
			return clientKpsPublicSoapProxy.TCKimlikNoDogrula(customer.getNationalityNumber(),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		return true;
	}

}
