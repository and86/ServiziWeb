package it.alfasoft.andrea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FatturaDao {

	private Map<String,Fattura> fatture;

	public FatturaDao() {
		
		fatture=new HashMap<>();
		Fattura f1=new Fattura("aaa",100,"alfasoft");
		Fattura f2=new Fattura("bbb",123.5,"IBM");
		Fattura f3=new Fattura("ccc",364,"reply");
		Fattura f4=new Fattura("ddd",987,"rgi");
		
		fatture.put(f1.getCodiceCliente(), f1);
		fatture.put(f2.getCodiceCliente(), f2);
		fatture.put(f3.getCodiceCliente(), f3);
		fatture.put(f4.getCodiceCliente(), f4);
		
	}
	
public List<Fattura> getTutteFatture() {
		
	List<Fattura> lista = new ArrayList<Fattura>(fatture.values());
		return lista;
	}
public Fattura getFatturaConCodiceCliente(String codice){
	return fatture.get(codice);
}
	
	
}
