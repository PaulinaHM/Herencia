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
public class Perro extends Animal{
    private String Raza;
    private String EmitirSonido;
    private int EsperanzaDeVida;
    private int TamanioDeRaza;
    private String Color;     

    public Perro() {
    }

    public Perro(String Raza, String EmitirSonido, int EsperanzaDeVida, int TamanioDeRaza, String Color, int NumeroPatas, String TipoDeAlimentacion, String TipoDeReproduccion, String TipoDeHabitatNatural) {
        super(NumeroPatas, TipoDeAlimentacion, TipoDeReproduccion, TipoDeHabitatNatural);
        this.Raza = Raza;
        this.EmitirSonido = EmitirSonido;
        this.EsperanzaDeVida = EsperanzaDeVida;
        this.TamanioDeRaza = TamanioDeRaza;
        this.Color = Color;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getEmitirSonido() {
        return EmitirSonido;
    }

    public void setEmitirSonido(String EmitirSonido) {
        this.EmitirSonido = EmitirSonido;
    }

    public int getEsperanzaDeVida() {
        return EsperanzaDeVida;
    }

    public void setEsperanzaDeVida(int EsperanzaDeVida) {
        this.EsperanzaDeVida = EsperanzaDeVida;
    }

    public int getTamanioDeRaza() {
        return TamanioDeRaza;
    }

    public void setTamanioDeRaza(int TamanioDeRaza) {
        this.TamanioDeRaza = TamanioDeRaza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "Raza=" + Raza + ", EmitirSonido=" + EmitirSonido + ", EsperanzaDeVida=" + EsperanzaDeVida + ", TamanioDeRaza=" + TamanioDeRaza + ", Color=" + Color + '}';
    }

   

    
    
}
