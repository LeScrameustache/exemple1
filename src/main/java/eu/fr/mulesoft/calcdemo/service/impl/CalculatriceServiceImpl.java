package eu.fr.mulesoft.calcdemo.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import eu.fr.mulesoft.calcdemo.service.iCalculatriceService;

@WebService(serviceName = "calculatrice-service")
public class CalculatriceServiceImpl implements iCalculatriceService{

	@Override
	@WebMethod(operationName = "addition-simple")
	@WebResult(name ="addition-simple-resultat")
	public int additioner(
			@WebParam(name="terme1") int a,
			@WebParam(name="terme2") int b) {
		return a+b;
	}

	@Override
	public int soustraire(int a, int b) {
		return a-b;
	}

	@Override
	public int multiplier(int a, int b) {
		return a*b;
	}

	@Override
	public int diviser(int a, int b) {
		if (b==0) {
			throw new IllegalArgumentException("On ne divise pas par 0 !");
		}
		return (a/b);
	}

}
