package it.alfasoft.andrea;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="andreaFattura", serviceName="Fatture")
public class FatturaService implements IFatturaService {
	
	@WebMethod
	public List<Fattura> prendiTutteFatture(){
		FatturaDao fDao=new FatturaDao();
		return fDao.getTutteFatture();
	}
	
	@WebMethod
	public Fattura prendiFatturaConCodice(String codice){
		FatturaDao fDao=new FatturaDao();
		return fDao.getFatturaConCodiceCliente(codice);
	}

}