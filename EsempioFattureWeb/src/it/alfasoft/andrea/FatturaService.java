package it.alfasoft.andrea;



import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="andreaFattura", serviceName="Fatture")
public class FatturaService implements IFatturaService {
	
	@WebMethod
	public Fattura[] prendiTutteFatture(){
		FatturaDao fDao=new FatturaDao();
		return fDao.getTutteFatture();
	}
	
	@WebMethod
	public Fattura prendiFatturaConCodice(String codice){
		FatturaDao fDao=new FatturaDao();
		return fDao.getFatturaConCodiceCliente(codice);
	}

}
