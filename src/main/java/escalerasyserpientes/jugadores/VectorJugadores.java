package escalerasyserpientes.jugadores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pabloluis
 */
public class VectorJugadores implements Serializable {
    //atributos
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Scanner entrada = new Scanner(System.in);

    public VectorJugadores() {
    }
    
    public void ingresarUsuario(int id, String nombre, String apellido){
        jugadores.add(new Jugador(id, nombre, apellido));
    }
    
    public ArrayList<String> infoJugadores(){
        ArrayList<String> info = new ArrayList<>();
        
        for(int i=0; i<jugadores.size(); i++){
            info.add(jugadores.get(i).toString());
        }
  
        return info;
    }
    
    
}
