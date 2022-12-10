package fr.leo.dp.Proxy_1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) {
		try {
			InterfaceDistributeurDistant distrib111 = (InterfaceDistributeurDistant) Naming
					.lookup("rmi://127.0.0.1/distributeur1");
			System.out.println(distrib111.getEmplacement());
			System.out.println(distrib111.getNombre());
			System.out.println(distrib111.getEtat());
			System.out.println("");

			InterfaceDistributeurDistant distrib2 = (InterfaceDistributeurDistant) Naming
					.lookup("rmi://127.0.0.2/distributeur2");
			System.out.println(distrib2.getEmplacement());
			System.out.println(distrib2.getNombre());
			System.out.println(distrib2.getEtat());
			System.out.println("");

			InterfaceDistributeurDistant distrib14 = (InterfaceDistributeurDistant) Naming
					.lookup("rmi://127.0.0.3/distributeur3");
			System.out.println(distrib14.getEmplacement());
			System.out.println(distrib14.getNombre());
			System.out.println(distrib14.getEtat());
			System.out.println("");

		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
