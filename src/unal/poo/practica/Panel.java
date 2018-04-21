package unal.poo.practica;

/**
 *
 * @author Estudiante
 */
import becker.robots.Thing;
import becker.robots.City;

public class Panel extends Thing{
    public String icono;
    
    public Panel(String icono, int x, int y, City city){
        super(city,x,y);
        this.icono=icono;
        setIcon(new Bicon("RedLight.gif"));
    }
}
