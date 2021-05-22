package paquete;


public class Main {

    public static void main(String[] args) {
                    Electrodomestico electrodomestico = new Electrodomestico("A","Nacional", Electrodomestico.Consumo.A);
                    electrodomestico.transformarAValorProcedencia();

                    System.out.println(electrodomestico.getTotalBase());

                    //Nevera nevera = new Nevera("C","Importado",100);
                    //nevera.transformarAValorConsumo();
                   // nevera.transformarAValorProcedencia();
                  //  nevera.calcularCapacidad();
                   // System.out.println(nevera.calcularPrecioBase(nevera.getValorCapacidad()));

                    //Televisor televisor = new Televisor("A","Nacional",10,false);
                    //televisor.transformarAValorConsumo();
                   // televisor.transformarAValorProcedencia();
                   // System.out.println(televisor.calcularPrecioBase(televisor.adicionarPulgadas(),televisor.adicionarSintetizdor()));
    }
}
