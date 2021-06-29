package reservaHotel;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Reserva extends Remote {
	public int getQtdQuarto_1() throws RemoteException;
	public double getPriceQuarto_1() throws RemoteException;

	public int getQtdQuarto_2() throws RemoteException;
	public double getPriceQuarto_2() throws RemoteException;

	public int getQtdQuarto_3() throws RemoteException;
	public double getPriceQuarto_3() throws RemoteException;

	public int getQtdQuarto_4() throws RemoteException;
	public double getPriceQuarto_4() throws RemoteException;
	
	public int getQtdQuarto_5() throws RemoteException;
	public double getPriceQuarto_5() throws RemoteException;
}
