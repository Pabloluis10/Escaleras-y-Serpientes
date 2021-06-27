package escalerasyserpientes.tablero;

import javax.swing.JLabel;

/**
 *
 * @author pabloluis
 */
public class Tablero {
    
    private Celda[][] tablero;
    private JLabel [][] diseñoTablero;
    private int filas;
    private int columnas;

    public Tablero(int filas, int columnas) {
        this.tablero = new Celda[filas][columnas];
        this.diseñoTablero = new JLabel[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
    }
    
    public void diseñarTablero(){
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                if(tablero[i][j] != null){//asignamos un número de columna
                   
                }
            }
        }
    }
    
    
    
}
