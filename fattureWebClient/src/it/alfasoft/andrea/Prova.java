package it.alfasoft.andrea;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Prova {

	public static void main(String[] args){
		FatturaServiceServiceLocator locator= new FatturaServiceServiceLocator();
		
		try{
			FatturaService f=locator.getFatturaService();
			Fattura[] fatt= f.prendiTutteFatture();
			for(int i=0; i<fatt.length;i++){
				System.out.println(fatt[i].getCodiceCliente()+" "+fatt[i].getRagioneSociale()+" "+fatt[i].getImporto());
			}
			
			
			

			
//			Fattura f1= f.prendiFatturaConCodice("bbb");
//			System.out.println(f1.getCodiceCliente()+" "+f1.getRagioneSociale()+" "+f1.getImporto());
			
		} catch(ServiceException e){
			e.printStackTrace();
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
}