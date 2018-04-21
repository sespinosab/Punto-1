package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;

/**
 *
 * @author Estudiante
 */
public class Sembrador extends Drone{
    private int semillas;

    public Sembrador(int semillas, City city, int x, int y, Direction drctn, int energia) {
        super(city,x, y, drctn, energia);
        this.semillas=semillas;
        setIcon(new Bicon("drone.png"));
    }
    
    public void sembrar(City ciudad,int x,int y){
        Planta planta=new Planta(ciudad,x,y,3,5,6);
        semillas--;
        
    }
    @Override
    public void consumir_energia(){
        this.energia--;
    }
    @Override
    public void cargar_energia(int energia){
        this.energia=this.energia+energia;
    }
    public boolean irZonaCarga(int x, int y, int x1, int y1){
//        boolean resultado=false;
//        int total= (abs(x- x1)+abs(y-y1));
//        
//        if (total>this.energia){
//            return false;
//        }
//        else{
//            for(int a= 0; a<(x-x1); a++){
//            this.move();
//            }
//            
//            for(int a= 0; a<(y-y1); a++){
//            this.move();
//            }
//        resultado=true;
//    }
//        return resultado;

        if(x<x1){
            if(y<y1){
                int total= (x1- x)+(y1-y);
                if (total>this.energia){
                    return false;
                }
                this.direction= direction.EAST;
                for(int a= 0; a<(x1-x); a++){
                    this.move();
                }
                this.turnLeft();
                this.turnLeft();
                this.turnLeft();
                for(int a= 0; a<(y1-y); a++){
                    this.move();
                }
            }
            else{
                int total= (x1- x)+(y-y1);
                if (total>this.energia){
                    return false;
                }
                this.direction= direction.EAST;
                for(int a= 0; a<(x1-x); a++){
                    this.move();
                }
                this.turnLeft();
                for(int a= 0; a<(y-y1); a++){
                    this.move();
                }
            }
        }
        else{
            if(y<y1){
                int total= (x- x1)+(y1-y);
                if (total>this.energia){
                    return false;
                }
                this.direction= direction.WEST;
                for(int a= 0; a<(x-x1); a++){
                    this.move();
                }
               
                this.turnLeft();
                for(int a= 0; a<(y1-y); a++){
                    this.move();
                }
            }
            else{
                int total= (x- x1)+(y-y1);
                if (total>this.energia){
                    return false;
                }
                this.direction= direction.WEST;
                for(int a= 0; a<(x-x1); a++){
                    this.move();
                }
                this.turnLeft();
                this.turnLeft();
                this.turnLeft();
                for(int a= 0; a<(y-y1); a++){
                    this.move();
                }
            }
        }
        return true;
    }
    
    public int get_energia(){
        return this.energia;
    }

    @Override
    public boolean irZonaCarga(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
