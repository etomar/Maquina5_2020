package maquina5_2020;
/**
 *
 * @author Iván (modificado @mithjack)
 */
public class ContadorDeMonedas{
    private float cantidad; /*Dinero introducido por el usuario actual.*/
    private float disponible; /*/Dinero almacenado en la maquina, se utiliza para dar cambio.*/
/* Inicializa el objeto y fija el cambio inicialmente disponible. */
/* Entradas: float i, saldo inicialmente disponible para cambios */
/* Salidas: Ninguna*/

    public void iniciarContadorDeMonedas (float i){
        disponible = i;
    }

/* Informa sobre el saldo actual del cliente */
/* Entradas: Ninguna */
/* Salidas: float, el saldo del cliente */
    public float saldo (){
        return cantidad;
    }

/* Insertar la moneda m */
/* Entrada: float m, la cantidad de dinero introducida */
/* Salidas: Ninguna */
    public void insertarMoneda (float m){
        cantidad+=m;
    }

/* Devuelve el cambio, si es posible */
/* Una vez entregado el cambio, el dinero introducido por el
cliente */
/* pasa a engrosar el disponible de la maquina
/* Entradas: float c, el precio del producto*/
/* Salidas: el cambio, negativo si falta dinero */
    public float darCambioDe (float c){
        float calculo=0;
	calculo=cantidad-c;
	disponible+=c;
	disponible-=0.75;
	return calculo;
}
    
/* El cliente recupera el dinero introducido si todavia */
/* no se ha realizado la venta */
/* Entradas: Ninguna */
/* Salidas: float, la cantidad devuelta */
    public float Retornar (){
        return cantidad;
    }
}
