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
public class Gato extends Animal{
    private String Raza;
    private String CategoriaDeRaza;
    private int EsperanzaDeVida;
    private int Tamanio;

    public Gato() {
    }

    public Gato(String Raza, String CategoriaDeRaza, int EsperanzaDeVida, int Tamanio, int NumeroPatas, String TipoDeAlimentacion, String TipoDeReproduccion, String TipoDeHabitatNatural) {
        super(NumeroPatas, TipoDeAlimentacion, TipoDeReproduccion, TipoDeHabitatNatural);
        this.Raza = Raza;
        this.CategoriaDeRaza = CategoriaDeRaza;
        this.EsperanzaDeVida = EsperanzaDeVida;
        this.Tamanio = Tamanio;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getCategoriaDeRaza() {
        return CategoriaDeRaza;
    }

    public void setCategoriaDeRaza(String CategoriaDeRaza) {
        this.CategoriaDeRaza = CategoriaDeRaza;
    }

    public int getEsperanzaDeVida() {
        return EsperanzaDeVida;
    }

    public void setEsperanzaDeVida(int EsperanzaDeVida) {
        this.EsperanzaDeVida = EsperanzaDeVida;
    }

    public int getTamanio() {
        return Tamanio;
    }

    public void setTamanio(int Tamanio) {
        this.Tamanio = Tamanio;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "Raza=" + Raza + ", CategoriaDeRaza=" + CategoriaDeRaza + ", EsperanzaDeVida=" + EsperanzaDeVida + ", Tamanio=" + Tamanio + '}';
    }

   
}
