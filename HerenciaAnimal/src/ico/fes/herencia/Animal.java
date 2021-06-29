/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;




/**
 *
 * @author USUARIO
 */
public class Animal {
    private int NumeroPatas;
    private String TipoDeAlimentacion;
    private String TipoDeReproduccion;
    private String TipoDeHabitatNatural;

    public Animal() {
    }

    public Animal(int NumeroPatas, String TipoDeAlimentacion, String TipoDeReproduccion, String TipoDeHabitatNatural) {
        this.NumeroPatas = NumeroPatas;
        this.TipoDeAlimentacion = TipoDeAlimentacion;
        this.TipoDeReproduccion = TipoDeReproduccion;
        this.TipoDeHabitatNatural = TipoDeHabitatNatural;
    }

    public int getNumeroPatas() {
        return NumeroPatas;
    }

    public void setNumeroPatas(int NumeroPatas) {
        this.NumeroPatas = NumeroPatas;
    }

    public String getTipoDeAlimentacion() {
        return TipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String TipoDeAlimentacion) {
        this.TipoDeAlimentacion = TipoDeAlimentacion;
    }

    public String getTipoDeReproduccion() {
        return TipoDeReproduccion;
    }

    public void setTipoDeReproduccion(String TipoDeReproduccion) {
        this.TipoDeReproduccion = TipoDeReproduccion;
    }

    public String getTipoDeHabitatNatural() {
        return TipoDeHabitatNatural;
    }

    public void setTipoDeHabitatNatural(String TipoDeHabitatNatural) {
        this.TipoDeHabitatNatural = TipoDeHabitatNatural;
    }

    @Override
    public String toString() {
        return  "Animal{" + "NumeroPatas=" + NumeroPatas + ", TipoDeAlimentacion=" + TipoDeAlimentacion + ", TipoDeReproduccion=" + TipoDeReproduccion + ", TipoDeHabitatNatural=" + TipoDeHabitatNatural + '}';
    }
   

}

   