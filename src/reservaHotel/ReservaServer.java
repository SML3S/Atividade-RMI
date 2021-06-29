package reservaHotel;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ReservaServer extends UnicastRemoteObject
implements Reserva{
	
	public ReservaServer() throws RemoteException{
		super();
		}
	
	int inicia = 0;
	
	int qtdQuarto_1 = 10;
	double priceQuarto_1 = 55.00;
	
	int qtdQuarto_2 = 20;
	double priceQuarto_2 = 75.00;
	
	int qtdQuarto_3 = 5;
	double priceQuarto_3 = 80.00;
	
	int qtdQuarto_4 = 3;
	double priceQuarto_4 = 150.00;
			
	int qtdQuarto_5 = 2;
	double priceQuarto_5 = 230.00;
			
	
	@Override
	public int getQtdQuarto_1() throws RemoteException{
		
		if( inicia != 0 &&  qtdQuarto_1 > 0) {
			
			qtdQuarto_1--;
			
			}else if( qtdQuarto_1 <= 0){ 
				qtdQuarto_1 =0;
				
			}
		
		
		System.out.println(" Quantidade de quartos " + qtdQuarto_1);
		return  qtdQuarto_1;
		
		}
	@Override
	public double getPriceQuarto_1() throws RemoteException{
		
		System.out.println(" Quantidade de quartos " + qtdQuarto_1);
		return  priceQuarto_1;
		
		}


	@Override
	public int getQtdQuarto_2() throws RemoteException{
		
		if( inicia != 0 &&  qtdQuarto_2 > 0) {
			
			qtdQuarto_2--;
			
			}else if( qtdQuarto_2 <= 0){ 
				qtdQuarto_2 =0;
				
			}
		
		
		System.out.println(" Quantidade de quartos " + qtdQuarto_2);
		return  qtdQuarto_2;
		
		}
	
	@Override
	public double getPriceQuarto_2() throws RemoteException{
		
		System.out.println(" Quantidade de quartos " + priceQuarto_2);
		return  priceQuarto_2;
		
		}

	@Override
	public int getQtdQuarto_3() throws RemoteException{
		
		if( inicia != 0 &&  qtdQuarto_3 > 0) {
			
			qtdQuarto_3--;
			
			}else if( qtdQuarto_3 <= 0){ 
				qtdQuarto_3 =0;
				
			}
		
		
		System.out.println(" Quantidade de quartos " + qtdQuarto_3);
		return  qtdQuarto_3 ;
		
		}
	@Override
	public double getPriceQuarto_3() throws RemoteException{
		
		System.out.println(" Quantidade de quartos " + priceQuarto_3);
		return  priceQuarto_3;
		
		}
	@Override
	public int getQtdQuarto_4() throws RemoteException{
		

		if( inicia != 0 &&  qtdQuarto_4 > 0) {
			
			 qtdQuarto_4--;
			
			}else if( qtdQuarto_4 <= 0){ 
				 qtdQuarto_4 =0;
				
			}
		
		
		System.out.println(" Quantidade de quartos " + qtdQuarto_4);
		return  qtdQuarto_4 ;
		
		}
	@Override
	public double getPriceQuarto_4() throws RemoteException{
		
		System.out.println(" Quantidade de quartos " + priceQuarto_4);
		return  priceQuarto_4;
		
		}
	
	@Override
	public int getQtdQuarto_5() throws RemoteException{
		
		
		if( inicia != 0 && qtdQuarto_5 > 0) {
			
			qtdQuarto_5--;
			
			}else if(qtdQuarto_5 <= 0){ 
				qtdQuarto_5 =0;
				
			}
		
		inicia=1;
		
		System.out.println(" Quantidade de quartos " + qtdQuarto_5);
		return   qtdQuarto_5;
		
		}
	@Override
	public double getPriceQuarto_5() throws RemoteException{
		
		System.out.println(" Quantidade de quartos " + priceQuarto_5);
		return  priceQuarto_5;
		
		}
	
	public static void main(String[] args) {
		try {
		
		LocateRegistry.createRegistry(2335);
		ReservaServer f = new ReservaServer();
		Naming.rebind("//localhost:2335/calc", f);
		System.out.println("Servidor reserva pronto.");
		}
		catch (RemoteException re) {
		System.out.println(" Exception in " + re);
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
}
