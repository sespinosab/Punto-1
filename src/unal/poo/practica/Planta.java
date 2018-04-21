package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.icons.Icon;

/**
 *
 * @author Estudiante
 */
public class Planta extends Thing{
    private String icono; 
    private String color;
    private double humedad;
    private double temperatura;
    private int fertilizante;
    

    public Planta(City city, int x, int y, int humedad, double temperatura, int fertilizante) {
        super(city, x, y);
        this.humedad=humedad;
        this.fertilizante=fertilizante;
        setIcon(new Bicon("SuperMario.gif"));
    }
    
    
    public boolean adicionar_fertilizante(int fertilizante){
        this.fertilizante=this.fertilizante+fertilizante;
        return true;
    }
    
    public void set_humedad(double humedad){
        this.humedad=humedad;
    }
    
    public void set_temperatura(double temperatura){
        this.temperatura=temperatura;
    }
    public int get_fertilizante(){
        return this.fertilizante;
    }
    
    public boolean cambiar_color(String color){
        this.color=color;
        return true;
    }
    
}
