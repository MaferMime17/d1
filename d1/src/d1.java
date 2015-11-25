package d1;

import java.util.Scanner;

public class d1 {

	public static void main(String[] args) {

		
		System.out.println("Desea ingresar al sistema");
		int x;
		x=1;
		double not=0,  pro=0;
		Scanner res=new Scanner(System.in);
		String r=res.next();
		System.out.println("Bienvenidos");
		System.out.println("Ingrese el numero de estudiantes");
		Scanner num=new Scanner(System.in);
		int N=num.nextInt();
		while (r.equals("si")&(x<=N)){ 
			System.out.print("Ingrese la nota por favor:");
			Scanner not1=new Scanner(System.in);
			double n=not1.nextDouble();
			x=x+1;
			not=not+n;
			pro=not/N;	}
			System.out.println("El promedio es: "+pro);
		System.out.println("Gracias por utilizar Nuestro sistema");
		System.exit(0);
	


	}

}
