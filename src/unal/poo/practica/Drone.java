/*
Imagenes tomadas de:
 https://www.flaticon.com/free-icon/drone_90905
 */
package unal.poo.practica;

/**
 *
 * @author Fabian Giraldo
 */
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
public abstract class Drone extends Robot{
    protected String icono;
    protected int energia;
    protected Direction direction;
    

    public Drone(City city, int x, int y, Direction drctn, int energia) {
        super(city, x, y, drctn,energia);
    }
    public int medir_distancia(int x, int y){
        return 0;
    }
    abstract public void consumir_energia();
    abstract public void cargar_energia(int energia);
    abstract public boolean irZonaCarga(int x, int y);
}