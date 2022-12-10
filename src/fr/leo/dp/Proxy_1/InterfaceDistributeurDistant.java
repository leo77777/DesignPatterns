package fr.leo.dp.Proxy_1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceDistributeurDistant extends Remote {

	Etat getEtat() throws RemoteException;

	int getNombre() throws RemoteException;

	String getEmplacement() throws RemoteException;

}
