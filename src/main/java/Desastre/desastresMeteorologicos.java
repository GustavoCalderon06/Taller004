package Desastre;

import Desaparecido.Desaparecido;

import java.util.ArrayList;

public class desastresMeteorologicos {
    private String nombre;
    private String lugar;
    private String fecha;
    private int velocidadDiametro;
    tipos tipos;
    private ArrayList<Desaparecido> desaparecidos;

    public desastresMeteorologicos(String nombre, String lugar, String fecha, int velocidadDiametro,
                                   tipos tipos, ArrayList<Desaparecido> desaparecidos) {
        this.nombre =nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.velocidadDiametro=velocidadDiametro;
        this.tipos= tipos;
        this.desaparecidos=desaparecidos;
    }

    public String getNombre(){
        return nombre;
    }

    public int getVelocidadDiametro(){
        return velocidadDiametro;
    }

    public ArrayList<Desaparecido> getDesaparecidos() {
        return desaparecidos;
    }

    public void setDesaparecidos(ArrayList<Desaparecido> desaparecidos) {
        this.desaparecidos = desaparecidos;
    }

    public void actualizarDesaparecidos(ArrayList<Desaparecido> desaparecidos,Desaparecido desaparecido){
        desaparecidos.add(desaparecido);
    }

    public void visualizarDesapariciones(ArrayList<Desaparecido> desaparecidos){
        for(Desaparecido desaparecido: desaparecidos){
            System.out.println(desaparecido);
        }
    }

    public String getLugar() {
        return lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setVelocidadDiametro(int velocidadDiametro){
        this.velocidadDiametro=velocidadDiametro;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String[] arreglo(){
        String nombre = this.nombre;
        String lugar = this.lugar;
        String fecha = this.fecha;
        return new String[]{nombre, lugar, fecha};

    }

    public String toString(){
        return nombre+";"+ lugar +";"+ fecha;
    }

}
