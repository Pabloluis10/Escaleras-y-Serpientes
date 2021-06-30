package escalerasyserpientes.jugadores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        boolean existe = false;
        //verificar si existe el jugador según el id
        for(int i=0; i<jugadores.size(); i++){
            if ( jugadores.get(i).getId() == id ) {
                JOptionPane.showMessageDialog(null, "El jugador ya existe");
                return;
            }
        }
        jugadores.add(new Jugador(id, nombre, apellido));
        JOptionPane.showMessageDialog(null, "Se ingreso exitosamente");
    }
    
    public ArrayList<String> infoJugadores(){
        ArrayList<String> info = new ArrayList<>();
        
        for(int i=0; i<jugadores.size(); i++){
            info.add(jugadores.get(i).toString());
        }
  
        return info;
    }
    
    public Jugador obtenerUsuario(int i){
        Jugador aux = jugadores.get(i);
        return aux;
    }
    
    public int cantUsuarios(){
        return jugadores.size();
    }
    
    
}
