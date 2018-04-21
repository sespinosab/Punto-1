/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Cultivo extends City{
    protected int ancho;
    protected int largo;
    private ArrayList<Planta> plantas;
    private ArrayList<Panel> paneles;
    private Sembrador sembrador;
    private Monitor monitor;
    
    public Cultivo(int ancho, int largo){
        this.ancho=ancho;
        this.largo=largo;
        this.plantas= new ArrayList();
        this.paneles= new ArrayList();
    }
    
    public boolean medir_fertilizante(int fertilizante){
        return true;
    }
    
    public boolean poner_fertilizante(int fertilizante, int x, int y){
        return true;
    }
    public boolean add_planta(Planta planta){
        this.plantas.add(planta);
        return true;
    }
    
    public boolean addPanel(Panel panel){
        this.paneles.add(panel);
        return true;
    }
    public boolean addDrone(Drone drone){
        return true;
    }
}
