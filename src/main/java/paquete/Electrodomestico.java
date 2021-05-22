package paquete;

public class Electrodomestico {
    private  double valConsumo;
    private  double valImportado;
    private String opcConsumo;
    private String opcImportado;

    public Electrodomestico(String opcConsumo, String opcImportado) {
        this.opcConsumo = opcConsumo;
        this.opcImportado = opcImportado;
    }

    public Electrodomestico(double valConsumo, double valImportado) {
        this.valConsumo = valConsumo;
        this.valImportado = valImportado;
    }

    public Electrodomestico(){}

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

    public void transformarAValorConsumo(){
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
    }
    public void transformarAValorProcedencia(){
        switch (getOpcImportado()){
            case "Nacional":
                setValImportado(250000);
                break;
            case "Importado":
                setValImportado(350000);
            break;
        }
    }

    public  double calcularPrecioBase(){
        return getValConsumo()+ getValImportado();
    }
}
