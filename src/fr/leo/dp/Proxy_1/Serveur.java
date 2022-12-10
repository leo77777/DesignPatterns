package fr.leo.dp.Proxy_1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Serveur {

	public static void main(String[] args) {

		try {
			LocateRegistry.createRegistry(1099);
			ServiceDistributeurDistant distrib = new ServiceDistributeurDistant("Nantes", 100);
			Naming.rebind("rmi://127.0.0.1/distributeur", distrib);
			System.out.println("tout est ok");
			System.out.println(distrib.getEtat());
			distrib.insererPiece();
			System.out.println(distrib.getEtat());
			distrib.ejecterPiece();
			System.out.println(distrib.getEtat());
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
