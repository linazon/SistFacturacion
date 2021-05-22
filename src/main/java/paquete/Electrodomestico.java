package paquete;

public class Electrodomestico {
    private  double valConsumo;
    private  double valImportado;
    private String opcConsumo;
    private String opcImportado;
    private double total;

    public Electrodomestico(String opcConsumo, String opcImportado) {
        this.opcConsumo = opcConsumo;
        this.opcImportado = opcImportado;

    }

    public String getOpcConsumo() {
        return opcConsumo;
    }

    public String getOpcImportado() {
        return opcImportado;
    }

    public double getValConsumo() {
        return valConsumo;
    }

    public void setValConsumo(double valConsumo) {
        this.valConsumo = valConsumo;
    }

    public double getValImportado() {
        return valImportado;
    }

    public void setValImportado(double valImportado) {
        this.valImportado = valImportado;
    }

    public enum Consumo {
        A(450000D), B(350000D), C(250000D);
        private final double consumo;

        Consumo(double consumo) {
            this.consumo = consumo;
        }

        public double getConsumo() {
            return consumo;
        }
    }
    /*public void transformarAValorConsumo(){

                switch (getOpcConsumo()){
            case "A":
                setValConsumo(450000);
                break;
            case "B":
                setValConsumo(350000);
                break;
            case "C":
                setValConsumo(250000);
                break;
        }
    }*/
    public void transformarAValorProcedencia(){
        double result = (getOpcImportado().equals("Nacional") ) ? 250000 : 350000;
        setValImportado(result);
        /*switch (getOpcImportado()){
            case "Nacional":
                setValImportado(250000);
                break;
            case "Importado":
                setValImportado(350000);
            break;
        }*/
    }

    public  double calcularPrecioBase(Consumo consumo){
        return consumo.getConsumo()+ getValImportado();
    }
}
