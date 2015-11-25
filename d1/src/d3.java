package d1;

import java.util.Scanner;

public class d3 {

	public static void main(String[] args) {
		double iva;
		double acum=0, acum1 = 0, acum2 = 0;


			System.out.println("Bienvenidos");

			System.out.println("Ingrese el monto de la compra");
			Scanner monto=new Scanner(System.in);
			double mo=monto.nextDouble();
			System.out.println("Menú");
			System.out.println("Escoja un color");
			System.out.println("1. Bolita Roja");
			System.out.println("2. Bolita Amarilla");
			System.out.println("3. Bolita Blanco");
			System.out.println("Elija una opcion");
			Scanner bolita=new Scanner(System.in);
			int bo=bolita.nextInt();
			
			switch (bo){
			case 1:
				iva=((mo)+mo-0.12);
				System.out.println("Su total a pagar incluido el iva y el descuento es:"+((iva)-iva*0.40));
				acum=acum+((iva)-iva*0.40);
				break;
			case 2:
				iva=((mo)+mo-0.12);
				System.out.println("Su total a pagar incluido el iva y el descuento es:"+((iva)-iva*0.25));
				acum1=acum1+((iva)-iva*0.25);
				break;
			case 3:
				iva=((mo)+mo-0.12);
				System.out.println("Su total a pagar incluido el iva y el descuento es:"+iva);
				acum2=acum2+iva;
				break;
			
			}
		
			System.out.println("Gracias por utilizar nuestro sistema");
			System.exit(0);
				
	}

}
