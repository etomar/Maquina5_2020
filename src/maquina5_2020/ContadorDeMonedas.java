package maquina5_2020;
/**
 *
 * @author Iván
 */
public class ContadorDeMonedas
{
private float cantidad; /*Dinero introducido por el usuario
actual.*/
private float disponible; /*/Dinero almacenado en la maquina,
se utiliza para dar cambio.*/
/* Inicializa el objeto y fija el cambio inicialmente
disponible. */
/* Entradas: float i, saldo inicialmente disponible para
cambios */
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
    cantidad += m;
}
