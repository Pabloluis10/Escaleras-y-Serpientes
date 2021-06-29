package escalerasyserpientes.Juego;

import escalerasyserpientes.jugadores.*;
import escalerasyserpientes.tablero.*;
import javax.swing.JLabel;

/**
 *
 * @author pabloluis
 */
public class Juego {
   
    private Tablero tablero;
    private Jugador[] jugadores;
    private boolean hayGanador;
    
    public Juego(Tablero tablero, Jugador[] jugadores){
        this.tablero = tablero;
        this.jugadores = jugadores;
        hayGanador = false;
    }
    
    public String tirarDadoJugadorEnTurno(int turno){
        int valorDado = jugadores[turno].tirarDados();
        FichaJugador ficha = jugadores[turno].getFicha();
        if(ficha.getPierdeTurno()){
            ficha.setPierdeTurno(false);
            return "El jugador Pierde un turno";
        }
        int avanzaCasilla = ficha.getPosActual()+valorDado;
        if(avanzaCasilla >= (tablero.getFilas()*tablero.getColumnas())){
            hayGanador = true;
            return "¡¡¡¡¡ YA HAY GANADOR, Y ES: "+jugadores[turno].getNombre()+" CON ID: "+jugadores[turno].getId();
        } else {
            String mensaje = verificarCasilla(avanzaCasilla, jugadores[turno]);
            return mensaje;
        }
    }
    
    private String verificarCasilla(int avanzaCasilla, Jugador jugador){
        Celda casilla = null;
        int fila = 0;
        //obtenemos la casilla
        do{
            for(int j=0; j<tablero.getColumnas(); j++){
                if(tablero.getTablero()[fila][j].getNumCelda() == avanzaCasilla){
                    casilla = tablero.getTablero()[fila][j];
                }
            }
            fila++;
        }while(casilla == null);
        
        if(casilla == null){
            return "No hay formato par la casilla";
        }
        jugador.getFicha().setPosActual(avanzaCasilla);
        String penalizacion = tipoCasilla(casilla, jugador);
        return penalizacion;
    }
    
    private String tipoCasilla(Celda casilla, Jugador jugador){
        String tipo = casilla.getTipo();
        JLabel celda = casilla.getCelda();
        FichaJugador ficha = jugador.getFicha();
        if("Normal".equals(tipo)){
            ficha.setLocation(celda.getX(), celda.getY());
            return "El jugador no tiene penalización";
        } else if ("Pierde turno".equals(casilla)) {
            ficha.setPierdeTurno(true);
            ficha.setLocation(celda.getX(), celda.getY());
            return "El jugador pierde un turno";
            
        } else if ("Tira Dados".equals(tipo)){
            ficha.setLocation(celda.getX(), celda.getY());
            int dado = jugador.tirarDados();
            int casillaAvanzada = dado + ficha.getPosActual();
            if(casillaAvanzada >= (tablero.getFilas()*tablero.getColumnas())){
                hayGanador = true;
                return "¡¡¡¡¡ YA HAY GANADOR, Y ES: "+jugador.getNombre()+" CON ID: "+jugador.getId();
            } else {
                String mensaje = verificarCasilla(casillaAvanzada, jugador);
                return mensaje;
            }
        } else if ("Avanza".equals(tipo)) {
            Avanza aux = (Avanza)(casilla);
            int numCasilla = ficha.getPosActual()+aux.getCantAvanza();
            if(numCasilla >= (tablero.getColumnas()*tablero.getFilas())){
                hayGanador = true;
                return "¡¡¡¡¡ YA HAY GANADO, Y ES: "+jugador.getNombre()+" CON ID: "+jugador.getId();
            }
            int fila =0;
            Celda avanza = null;
            do{
                for(int j=0; j<tablero.getColumnas(); j++){
                    if(numCasilla == tablero.getTablero()[fila][j].getNumCelda()){
                        avanza = tablero.getTablero()[fila][j];
                        break;
                    }
                }
                fila++;
            }while(avanza == null);
            celda = avanza.getCelda();
            ficha.setLocation(celda.getX(), celda.getY());
            ficha.setPosActual(numCasilla);
            return "El jugador avanza ";
        } else if ("Retrocede".equals(tipo)){
            Retrocede aux = (Retrocede)(casilla);
            int numCasilla = ficha.getPosActual()-aux.getCantRetrocede();
            int fila =0;
            Celda retrocede = null;
            do{
                for(int j=0; j<tablero.getColumnas(); j++){
                    if(numCasilla == tablero.getTablero()[fila][j].getNumCelda()){
                        retrocede = tablero.getTablero()[fila][j];
                        break;
                    }
                }
                fila++;
            }while(retrocede == null);
            celda = retrocede.getCelda();
            ficha.setLocation(celda.getX(), celda.getY());
            ficha.setPosActual(numCasilla);
            return "El jugador retrocede ";
        } else if ("Baja".equals(tipo)){
            Bajada baja = (Bajada)(casilla);
            int numCasilla = baja.getNumCeldaBaja();
            ficha.setPosActual(numCasilla);
            celda = baja.getCelda();
            ficha.setLocation(celda.getX(), celda.getY());
            return "El jugador baja ";
        } else {
            Subida sube = (Subida)(casilla);
            int numCasilla = sube.getNumCeldaSube();
            ficha.setPosActual(numCasilla);
            celda = sube.getCelda();
            ficha.setLocation(celda.getX(), celda.getY());
            return "El jugador sube ";
        }
    }
}
