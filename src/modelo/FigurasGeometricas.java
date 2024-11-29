/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public abstract class FigurasGeometricas {
    private String nombre;
    private double perimetro;
    private double area;
    private final double PI=3.1416;
    
    //Metodos Constructores
    
    public FigurasGeometricas(){
        
    } 

    public FigurasGeometricas(String nombre, double perimetro,double area, String PI) {
        this.nombre = nombre;
        this.perimetro = perimetro;
        this.area = area;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPI(){
        return PI;
    }

    @Override
    public String toString() {
        return "DATOS DE LA FIGURA GEOMETRICA:\n:"+
                "Nombre de la figura" + getNombre()+"\n:"+
                "Perimetro"+getPerimetro()+"\n:"+
                "PI"+getPI()+"\n:";
                
    }
    
    
    //Metodos Abstractos
    public abstract double area();
    public abstract double perimetro();
    
    
    
}
