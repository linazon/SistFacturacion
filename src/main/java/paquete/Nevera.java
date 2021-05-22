package paquete;

public class Nevera extends Electrodomestico{
    private double valorCapacidad;
    private double porcCapacidad;

    public Nevera(String opcConsumo, String opcImportado, double valorCapacidad){
        super(opcConsumo, opcImportado);
        this.valorCapacidad = valorCapacidad;
    }

    public double getPorcCapacidad() {
        return porcCapacidad;
    }

    public void setPorcCapacidad(double porcCapacidad) {
        this.porcCapacidad = porcCapacidad;
    }

    public double getValorCapacidad() {
        return valorCapacidad;
    }

    public void setValorCapacidad(double valorCapacidad) {
        this.valorCapacidad = valorCapacidad;
    }

    //@Override
    /*public  double calcularPrecioBase(double valorCapacidad){
        return (getValConsumo()+ getValImportado())+ getValorCapacidad();
    }*/

    public void calcularporcCapacidad(){
        if (getValorCapacidad()>120) {
            setPorcCapacidad((((getValorCapacidad() - 120) * 5) / 1000));
        } else{
            setPorcCapacidad(0);
        }
    }
    public void calcularCapacidad(){
            calcularporcCapacidad();
          // setValorCapacidad(calcularPrecioBase()*getPorcCapacidad());
        }

    }

