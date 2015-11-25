package d1;

import java.util.Scanner;

public class d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Desea Ingresar al Sistema");
		Scanner resp=new Scanner(System.in);
		String res=resp.next();
		while(res.equals("si"))
		{
		System.out.println("Bienvenidos");
		Scanner sc= new Scanner (System.in);
		double acum=0;

		int x;
		
		double[]num=new double[50];
		for(x=0; x < 50; x++){
			System.out.println("Ingrese las notas:");
			num[x]=sc.nextDouble();
			acum=acum+num[x];
		}
		acum=acum/50;
		System.out.println("El promedio es:"+acum);
		
		if(acum>=7){
			System.out.println("esta aprobado");
		}else if(acum<7){

		System.out.println("esta reprobado");
		System.exit(0);
		}
		}
	}

}
