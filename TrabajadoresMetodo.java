import java.util.Scanner;

public class TrabajadoresMetodo {

    public static void main(String[] args) {

        Scanner entraditx = new Scanner(System.in);

        long documento;
        int tipoVendedor;
        double valorVentas;
        int n_vendedor;

        n_trabajadores n1_vendedor;

        System.out.println("Escriba el número de trabajadores a evaluar: ");
        n_vendedor=Integer.parseInt(entraditx.nextLine());

        for (int i=1; i==n_vendedor;i++){

            System.out.println("Documento: ");
            documento=Long.parseLong(entraditx.nextLine());

            System.out.println("Tipo de vendedor:\n 1=puerta a puerta,\n 2=telemercado");
            tipoVendedor= Integer.parseInt(entraditx.nextLine());

            System.out.println("Valor de las ventas:" );
            valorVentas= Double.parseDouble(entraditx.nextLine());


            n1_vendedor =new n_trabajadores(documento, tipoVendedor, valorVentas);


        }


    }



}