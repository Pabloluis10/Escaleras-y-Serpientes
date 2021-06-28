package escalerasyserpientes.ManejoDeArchivos;

import escalerasyserpientes.tablero.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author pabloluis
 */
public class ManejoArchivos {
    
    private final String tamTablero = "tablero("; 
    private final String pierde = "pierdeturno(";
    private final String tiraDados = "tiradados(";
    private final String avanza = "avanza(";
    private final String retrocede = "retrocede(";
    private final String subida = "subida(";
    private final String bajada = "bajada(";
    
    public ManejoArchivos(){
        
    }
    
    public void leerArchivo(Tablero tablero, String pathname){
        File arch = new File(pathname);
        String linea; 
        
        if(arch.exists()){
            try {
                BufferedReader bf = new BufferedReader(new FileReader(arch));
                while ( (linea = bf.readLine()) != null ) {
                    determinarTablero(linea, tablero);
                }
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡ERROR! no se encontro el archivo");
        }
    }
    
    public void determinarTablero(String linea, Tablero tablero){
        String datos;
        if( linea.substring(0, tamTablero.length()).equals(tamTablero)){
            datos = linea.substring(tamTablero.length(), linea.length()-1);
            String[] datSeparado = datos.split("\\,");
            int filas, columnas;
            try{
                filas = Integer.valueOf(datSeparado[0]);
                columnas = Integer.valueOf(datSeparado[1]);
                tablero = new Tablero(filas, columnas);//creamos el objeto Tablero
            } catch (Exception e){
                System.out.println("Datos Incorrectos");
            }
        } else if (linea.substring(0,pierde.length()).equals(pierde)){
            datos = linea.substring(pierde.length(), linea.length()-1);
            String[] datSeparado = datos.split("\\,");
            int fila, columna;
            try{
                fila = Integer.valueOf(datSeparado[0]);
                columna = Integer.valueOf(datSeparado[1]);
                tablero.getTablero()[fila][columna] = new PierdeTurno();
            } catch (Exception e){
                System.out.println("Datos Incorrectos");
            }
        } else if (linea.substring(0, tiraDados.length()).equals(tiraDados)){
            datos = linea.substring(tiraDados.length(), linea.length()-1);
            String[] datSeparado = datos.split("\\,");
            int fila, columna;
            try{
                fila = Integer.valueOf(datSeparado[0]);
                columna = Integer.valueOf(datSeparado[1]);
                tablero.getTablero()[fila][columna] = new TiraDados();
            } catch (Exception e){
                System.out.println("Datos Incorrectos");
            }
        } else if (linea.substring(0,avanza.length()).equals(avanza)){
            datos = linea.substring(avanza.length(), linea.length()-1);
            String[] datSeparado = datos.split("\\,");
            int fila, columna, cantAvanza;
            try{
                fila = Integer.valueOf(datSeparado[0]);
                columna = Integer.valueOf(datSeparado[1]);
                cantAvanza = Integer.valueOf(datSeparado[2]);
                tablero.getTablero()[fila][columna] = new Avanza(cantAvanza);
            } catch (Exception e){
                System.out.println("Datos Incorrectos");
            }
        } else if (linea.substring(0, retrocede.length()).equals(retrocede)) {
            datos = linea.substring(retrocede.length(), linea.length()-1);
            String[] datSeparado = datos.split("\\,");
            int fila, columna, cantRetrocede;
            try{
                fila = Integer.valueOf(datSeparado[0]);
                columna = Integer.valueOf(datSeparado[1]);
                cantRetrocede = Integer.valueOf(datSeparado[2]);
                tablero.getTablero()[fila][columna] = new Retrocede(cantRetrocede);
            } catch (Exception e){
                System.out.println("Datos Incorrectos");
            }
        } else if (linea.substring(0, subida.length()).equals(subida)) {
            datos = linea.substring(subida.length(), linea.length()-1);
            String[] datSeparado = datos.split("\\,");
            int fila, columna, filaFinal, colFinal;
            try{
                fila = Integer.valueOf(datSeparado[0]);
                columna = Integer.valueOf(datSeparado[1]);
                filaFinal = Integer.valueOf(datSeparado[2]);
                colFinal = Integer.valueOf(datSeparado[3]);
                tablero.getTablero()[fila][columna] = new Subida(filaFinal, colFinal);
            } catch (Exception e){
                System.out.println("Datos Incorrectos");
            }
        } else if (linea.substring(0, bajada.length()).equals(bajada)) {
            datos = linea.substring(bajada.length(), linea.length()-1);
            String[] datSeparado = datos.split("\\,");
            int fila, columna, filaFinal, colFinal;
            try{
                fila = Integer.valueOf(datSeparado[0]);
                columna = Integer.valueOf(datSeparado[1]);
                filaFinal = Integer.valueOf(datSeparado[2]);
                colFinal = Integer.valueOf(datSeparado[3]);
                tablero.getTablero()[fila][columna] = new Bajada(filaFinal, colFinal);
            } catch (Exception e){
                System.out.println("Datos Incorrectos");
            }
        } else {
            System.out.println("No existe formato para esta celda");
        }
    }
}
