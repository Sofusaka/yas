public class n_trabajadores {


        long documento;
        int tipovendedor;
        double valorVentas;
        double ValorComision;




        public n_trabajadores(long documento, int tipovendedor, double valorVentas)
        {
            this.documento = documento;
            this.tipovendedor = tipovendedor;
            this.valorVentas = valorVentas;

        }

        public double calcularComision(){

            double porcentaje=0;

            if (tipovendedor==1){
                porcentaje=0.25;

            }else if (tipovendedor==2){
                porcentaje=0.20;
            }

            ValorComision=valorVentas*porcentaje;


            return ValorComision;

        }




    }






