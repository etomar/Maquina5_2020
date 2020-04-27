package maquina5_2020;

public class MaquinaBebidas {
	private ContadorDeMonedas contador; //Contador de monedas de la maquina
	private DispensadorDeBotes cola, limon, naranja, tonica, agua;
	private float precio;
	
	//Precio de las bebidas(com�n para	todas)
	/* Inicializa la maquina y todos los elementos asociados */
	/* Entradas: float m, cantidad inicial de monedas para el
	cambio */
	/* int b, cantidad inicial de botes en los dispensadores */
	/* float pvp, precio de las bebidas */
	/* Salidas: Ninguna */
	
	public void iniciarMaquinaDeBebidas (float m, int b, float pvp){
            this.cola= new DispensadorDeBotes(b);
	    this.limon= new DispensadorDeBotes(b);
	    this.naranja= new DispensadorDeBotes(b);
	    this.tonica= new DispensadorDeBotes(b);
	    this.agua= new DispensadorDeBotes(b);
            this.precio= pvp;
            this.contador= new ContadorDeMonedas(m);
		
	}
	
	/* Responder a una acci�n del usuario. Discrimina el tipo de
	accion */
	/* y utiliza las operaciones privadas */
	/* Entradas: char o, la orden del usuario */
	/* Salidas: Ninguna */
	public void darOrden (char o) {
            if(o=='1'||o=='2'||o=='3'||o=='4'||o=='5'){
                ordenSeleccion(o);
            }
            else{
              if(o=='A'||o=='B'||o=='C'||o=='D'||o=='E'||o=='R'){
                ordenMonedas(o);
                }  
            }
	}
        
        
	/* Visualiza la informacion de interes sobre la maquina */
	/* Botes en cada dispensador, precio de las bebidas, saldo
	del cliente */
	/* Entradas: Ninguna */
	/* Salidas: Ninguna */
	public void visualizarMaquina (){
            System.out.println("De Cola hay: "+cola.botesDisponibles());
            System.out.println("De Naranja hay: "+naranja.botesDisponibles());
            System.out.println("De Limon hay: "+limon.botesDisponibles());
            System.out.println("De Tonica hay: "+tonica.botesDisponibles());
            System.out.println("De Agua hay: "+agua.botesDisponibles());
            System.out.println("Precio total: "+precio);
            System.out.println("Saldo Disponible: "+contador.getSaldo());  
        } 
        
        
	/* Realiza las acciones relacionadas con la introducci�n de
	monedas */
	/* Entradas: char o, la orden del usuario */
	/* Salidas: Ninguna */
	
	private void ordenMonedas (char o){
        
        switch (o){
            case 'A':
                contador.insertarMoneda(0.05);
            break;
            
            case 'B': 
                contador.insertarMoneda(0.10);
            break;
            
            case 'C': 
                contador.insertarMoneda(0.20);
            break;
            
            case 'D':
                contador.insertarMoneda(0.50);
            break;
            
            case 'E':
                contador.insertarMoneda(1);
            break;
            
            case 'R':
                contador.insertarMoneda(-contador.saldo());
            break;
        } 
    }
        
        
	/* Realiza las acciones relacionadas con la selecci�n de una
	bebida */
	/* Entradas: char o, la orden del usuario */
	/* Salidas: Ninguna */
	private void ordenSeleccion (char o) {
            switch(o){
                
            case 1:                             
                if(cola.pulsarBoton()==true){
                    if(precio<=contador.Saldo()){
                        cola.iniciarDispensadorDeBotes(cola.botesDisponibles ()-1);
                    }
                    else{System.out.println("Te faltan monedas");}
                }
                else{System.out.println("No quedan mas latas");}
            break;
            
            case 2:
                if(limon.pulsarBoton()==true){
                    if(precio<=contador.Saldo()){
                        limon.iniciarDispensadorDeBotes(limon.botesDisponibles ()-1);
                    }
                    else{System.out.println("Te faltan monedas");}
                }
                else{System.out.println("No quedan mas latas");}
            break;
            
            case 3:
                if(naranja.pulsarBoton()==true){
                    if(precio<=contador.Saldo()){
                        naranja.iniciarDispensadorDeBotes(naranja.botesDisponibles ()-1);
                    }
                    else{System.out.println("Te faltan monedas");}
                }
                else{System.out.println("No quedan mas latas");}
            break;
            
            case 4:
                if(tonica.pulsarBoton()==true){
                    if(precio<=contador.Saldo()){
                        tonica.iniciarDispensadorDeBotes(tonica.botesDisponibles ()-1);
                    }
                    else{System.out.println("Te faltan monedas");}
                }
                else{System.out.println("No quedan mas latas");}
            break;
            
            case 5:                                             
                if(agua.pulsarBoton()==true){
                    if(precio<=contador.Saldo()){
                        agua.iniciarDispensadorDeBotes(agua.botesDisponibles ()-1);
                    }
                    else{System.out.println("Te faltan monedas");}
                }
                else{System.out.println("No quedan mas latas");}
            break;
            
        }
    
    }
} 
