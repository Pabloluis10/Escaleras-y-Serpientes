package escalerasyserpientes.jugadores;

import java.util.Random;

/**
 *
 * @author pabloluis
 */
public class Jugador {
    
    //atributos
    private int id;
    private String nombre;
    private String apellido;
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasPerdidas;
    private FichaJugador ficha;
    
    private Random aleatorio = new Random();

    public Jugador(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ficha = ficha;
        this.partidasGanadas = 0;
        this.partidasJugadas = 0;
        this.partidasPerdidas = 0;
        this.ficha = new FichaJugador(id);
    }
    //metodos
    public int tirarDados(){
        int dado = aleatorio.nextInt(6)+1;
        return dado;
    }
    
    public void aumentarPartidas(){
        this.partidasJugadas++;
    }
    
    public void aumentarPartidasGanadas(){
        this.partidasGanadas++;
    }

    public void aumentarPartidasPerdidas(){
        this.partidasPerdidas++;
    }
    
    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", partidasJugadas=" + partidasJugadas + ", partidasGanadas=" + partidasGanadas + ", partidasPerdidas=" + partidasPerdidas + '}';
    }
    
    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public FichaJugador getFicha() {
        return ficha;
    }
    
    
}
