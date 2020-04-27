/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina5_2020;

/**
 *
 * @author joni
 */
public class DispensadorDeBotes {
    private int botes;//Numero actual de botes.
    /* Inicializa el dispensador y pone i botes en él*/
    /* Entrada: int i, numero de botes en el dispensador*/
    /* Salidas: Ninguna */
    
    
   public void iniciarDispensadorDeBotes(int i) {
		this.botes = i;
	}
    /* Intenta dar un bote, devuelve true si es posible y falso
    si no haybotes */
    /* Entrada: Ninguna */
    /* Salidas: bool, true si entrega el bote */
    public boolean pulsarBoton(){
        boolean ok = false;
		if (this.botes > 0) {
			this.botes--;
			ok = true;
		}
		return ok;
	}
    /*Muestra el numero de botes disponibles en el dispensador*/
    /* Entrada: Ninguna */
    /* Salidas: int, el numero de botes */
    public int botesDisponibles(){
        return this.botes;
	}
}
