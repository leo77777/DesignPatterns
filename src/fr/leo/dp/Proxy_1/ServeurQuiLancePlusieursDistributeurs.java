package fr.leo.dp.Proxy_1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServeurQuiLancePlusieursDistributeurs {
	public static void main(String[] args) {

		try {
			LocateRegistry.createRegistry(1099);
			ServiceDistributeurDistant distrib1 = new ServiceDistributeurDistant("Nantes", 100);
			ServiceDistributeurDistant distrib2 = new ServiceDistributeurDistant("Cherbourg", 50);
			ServiceDistributeurDistant distrib3 = new ServiceDistributeurDistant("La Rochelle", 25);
			Naming.rebind("rmi://127.0.0.1/distributeur1", distrib1);
			Naming.rebind("rmi://127.0.0.2/distributeur2", distrib2);
			Naming.rebind("rmi://127.0.0.3/distributeur3", distrib3);
			distrib3.insererPiece();

			distrib2.insererPiece();
			distrib2.tournerPoignee();

			System.out.println("tout est ok");
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}

	}
}
