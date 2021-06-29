package reservaHotel;

import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClienteReserva {

	public static void main(String args[]) throws MalformedURLException, RemoteException, NotBoundException {
		Reserva reserva;
		Scanner sc = new Scanner(System.in);

		reserva = (Reserva) Naming.lookup("rmi://localhost:2335/calc");
		
		
		int quarto_1 = reserva.getQtdQuarto_1();
		double priceQuarto_1 = reserva.getPriceQuarto_1();
		
		int quarto_2 = reserva.getQtdQuarto_2();
		double priceQuarto_2 = reserva.getPriceQuarto_2();
		
		int quarto_3 = reserva.getQtdQuarto_3();
		double priceQuarto_3 = reserva.getPriceQuarto_3();
		
		int quarto_4 = reserva.getQtdQuarto_4();
		double priceQuarto_4 = reserva.getPriceQuarto_4();
		
		int quarto_5 = reserva.getQtdQuarto_5();
		double priceQuarto_5 = reserva.getPriceQuarto_5();

		
		while (true) {
			System.out.println("\n ==============================\n" 
								+ "\n 1. Quarto tipo 1 "
								+"\n=> Quartos = "+ quarto_1
								+"\n=> Valor = "+ priceQuarto_1
								+"\n________________________________"
								+ "\n 2. Quarto tipo 2 "
								+"\n=> Quartos = "+ quarto_2
								+"\n=> Valor = "+ priceQuarto_2
								+"\n________________________________"
								+ "\n 3. Quarto 3 "
								+"\n=> Quartos = "+ quarto_3
								+"\n=> Valor = "+ priceQuarto_3
								+"\n________________________________"
								+ "\n 4. Quarto 4 "
								+"\n=> Quartos = "+ quarto_4
								+"\n=> Valor = "+ priceQuarto_4
								+"\n________________________________"
								+ "\n 5. Quarto 5 "
								+"\n=> Quartos = "+ quarto_5
								+"\n=> Valor = "+ priceQuarto_5
								+"\n________________________________"
								+ "\n 6. Sair" 
								+ "\n==============================");
			
			System.out.print("Escolha uma opção = ");
			int opt = sc.nextInt();
			
			
			if (opt == 6) {
				break;
			}
			

			reserva = (Reserva) Naming.lookup("rmi://localhost:2335/calc");
			int resposta;
			
			switch(opt) {
			
			case 1:
				if(quarto_1 == 0) {
					System.out.println("\nQuarto 1 = " + quarto_1);
					System.out.println("Não foi possivel fazer a reserva no quarto 1");
					break;	
				}				
				System.out.println("Sua reserva no quarto 1, com sucesso");
				quarto_1 = reserva.getQtdQuarto_1();
				System.out.println("\nQuarto 1 = "+"  " + quarto_1);
				
				break;
				
			case 2:
				if(quarto_2 == 0) {
					System.out.println("\nQuarto 2 = " + quarto_2);
					System.out.println("Não foi possivel fazer a reserva no quarto 2");
					break;	
				}				
				System.out.println("Sua reserva no quarto 2, com sucesso");
				quarto_2 = reserva.getQtdQuarto_2();
				System.out.println("\nQuarto 2 = " + quarto_2);
				break;
				
			case 3:
				if(quarto_3 == 0) {
					System.out.println("\nQuarto 3 = " + quarto_3);
					System.out.println("Não foi possivel fazer a reserva no quarto 3");
					break;	
				}				
				System.out.println("Sua reserva no quarto 3, com sucesso");
				quarto_3 = reserva.getQtdQuarto_3();
				System.out.println("\nQuarto 3 = " + quarto_3);
				break;
			case 4:
				
				if(quarto_4 == 0) {
					System.out.println("\nQuarto 4 = " + quarto_4);
					System.out.println("Não foi possivel fazer a reserva no quarto 4");
					break;	
				}				
				System.out.println("Sua reserva no quarto 4, com sucesso");
				quarto_4 = reserva.getQtdQuarto_4();
				System.out.println("\nQuarto 4 = " + quarto_4);
				break;
				
			case 5:
				
				if(quarto_5 == 0) {
					System.out.println("\nQuarto 5 = " + quarto_5);
					System.out.println("Não foi possivel fazer a reserva no quarto 5");
					break;	
				}
				
				System.out.println("Sua reserva no quarto 5, com sucesso");
				quarto_5 = reserva.getQtdQuarto_5();
				System.out.println("\nQuarto 5 = " + quarto_5);
				break;	
			}
		}
	}
}
