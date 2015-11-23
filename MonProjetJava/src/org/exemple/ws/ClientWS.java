package org.exemple.ws;

import java.util.ArrayList;
import java.util.List;

import org.exemple.*;
import org.exemple.model.Salutation;
import org.exemple.model.SalutationService;

import com.m2i.formation.ws.Welcome;
import com.m2i.formation.ws.WelcomeService;

public class ClientWS {
	
	public static Salutations serviceOlive(){
		SalutationsService service = new SalutationsService();
		return service.getSalutationsPort();
		
	}

	public static Welcome serviceTotophe(){
		WelcomeService service = new WelcomeService();
		return service.getWelcomePort();
		
	}
	
	public static Salutation serviceMax(){
		SalutationService service = new SalutationService();
		return service.getSalutationPort();
	}
	
 public static void main(String[] args){
	 System.out.println(ClientWS.serviceTotophe().getMessStart());
	 System.out.println(ClientWS.serviceMax().bonjour());
	 //List<user> list = new ArrayList<user>();
	 System.out.println(ClientWS.serviceMax().getAllUser());
	 
 }

}


