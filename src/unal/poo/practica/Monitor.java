package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;

/**
 *
 * @author Estudiante
 */
public class Monitor extends Drone{
    protected String tipoCamara;
    public Monitor(String tipoCamara, City city,Direction drctn,int energia, int x , int y) {
        super(city, x, y, drctn,energia);
        setIcon(new Bicon("drone1.png"));
    }
    @Override
    public void consumir_energia(){
        this.energia--;
    }
    @Override
    public void cargar_energia(int energia){
        this.energia=energia;
    }
    
    public boolean realizar_monitoreo(int x, int y, int numero_plantas){ //Cambiar después a int
        return true;
    }
    
    public boolean medir_fertilizante(int x, int y){
        return true;
    }
    
    public boolean poner_fertilizante(int x, int y, int fertilizante){ //colocar con if y la planta determinada del arrayList
        return true;
    }
    
    @Override
    public boolean irZonaCarga(int x, int y ){
        
        return true;
    }
    
}
