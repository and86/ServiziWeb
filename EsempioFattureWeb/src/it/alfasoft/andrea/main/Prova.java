package it.alfasoft.andrea.main;

import it.alfasoft.andrea.FatturaService;

import javax.xml.ws.Endpoint;

public class Prova {

	public static void main(String[] args) {
		

		Endpoint.publish("http://localhost:1234/EsempioFattureWeb",
						 new FatturaService());
	}

}
