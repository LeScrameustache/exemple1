package eu.fr.mulesoft.calcdemo.serveur;

import eu.fr.mulesoft.calcdemo.service.impl.CalculatriceServiceImpl;
import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		/*CalculatriceServiceImpl calcService = new CalculatriceServiceImpl();
		int result = calcService.additioner(2,3);
		int result2 = calcService.diviser(5,2);
		System.out.println("Somme: " + result);
		System.out.println("Quotient: "+result2);*/
		System.out.println("Publication du WS ...");
		Endpoint.publish("http://127.0.0.1:9999/calculator", new CalculatriceServiceImpl());
		System.out.println("WS OK");
	}

}
