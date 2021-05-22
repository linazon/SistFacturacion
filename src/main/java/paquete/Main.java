package paquete;


public class Main {

    public static void main(String[] args) {
                    Electrodomestico electrodomestico = new Electrodomestico("Importado", Electrodomestico.Consumo.B);
                    //electrodomestico.transformarAValorProcedencia();

                    System.out.println("electrodomestico "+electrodomestico.calcularPrecioBase());

                    Nevera nevera = new Nevera("Importado", Electrodomestico.Consumo.A,250);
                    //nevera.transformarAValorConsumo();
                    nevera.transformarAValorProcedencia();
                    nevera.calcularCapacidad();
                    System.out.println(nevera.calcularPrecioBase());

                    //Televisor televisor = new Televisor("A","Nacional",10,false);
                    //televisor.transformarAValorConsumo();
                   // televisor.transformarAValorProcedencia();
                   // System.out.println(televisor.calcularPrecioBase(televisor.adicionarPulgadas(),televisor.adicionarSintetizdor()));
    }
}
