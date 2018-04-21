package unal.poo.practica;

import becker.robots.*;


/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args) throws InterruptedException{
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
            objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            //estudiante = new Drone(objetos,0, 2, Direction.EAST,10);
           //Flor flor = new Flor(objetos, 0, 3);
            //Semaforo semaforo = new Semaforo(objetos, 0, 6);
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            //estudiante.move ();
            Sembrador sembrador= new Sembrador(3,objetos,0,0,Direction.EAST,10);
            Monitor monitor=new Monitor("A",objetos,Direction.EAST,50,3,4);
            Panel panel_uno=new Panel("Hola",4,4,objetos);
            Planta uno=new Planta(objetos, 10,10,50,30,20);
            Planta dos=new Planta(objetos, 5,10,40,15,30);
            Planta tres= new Planta(objetos,15,7,43,23,41);
            int a= 3;
            int b= 3;
            
            for(int u=0; u<4; u++){
                if(u%2==0){
                    for(int c=0; c<a; c++){
                        int x=sembrador.getStreet();
                        int y=sembrador.getAvenue();
                        sembrador.sembrar(objetos,x,y);
                        sembrador.move();
                        sembrador.consumir_energia();
                        sembrador.irZonaCarga(x, y, 4, 4);
                    }
                }
                else if(u%2!=0){
                    for(int c=0; c<b; c++){
                        int x=sembrador.getStreet();
                        int y=sembrador.getAvenue();
                        sembrador.sembrar(objetos,x,y);
                        sembrador.move();
                        sembrador.consumir_energia();
                        sembrador.irZonaCarga(x, y, 4, 4);
                    }
                }
                sembrador.turnLeft();
                sembrador.turnLeft();
                sembrador.turnLeft();
            }
            
//            sembrador.move();
//            int x=sembrador.getStreet();
//            int y=sembrador.getAvenue();
//            sembrador.sembrar(objetos,x,y);
//            sembrador.irZonaCarga(x, y, 4, 4);
//            sembrador.move();
            Thing t = estudiante.examineThings(new FlorPred()).next();
            if(t instanceof Flor){
               estudiante.pickThing();
            }
            
            estudiante.move();
            //semaforo.cambiarEstado();
            Thread.sleep(500);
           // semaforo.cambiarEstado();
           
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

