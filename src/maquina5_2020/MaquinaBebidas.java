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
		
	}
        
        
	/* Visualiza la informacion de interes sobre la maquina */
	/* Botes en cada dispensador, precio de las bebidas, saldo
	del cliente */
	/* Entradas: Ninguna */
	/* Salidas: Ninguna */
	public void visualizarMaquina (){
            System.out.println("Cola: "+cola.botesDisponibles());
            System.out.println("Naranja: "+naranja.botesDisponibles());
            System.out.println("Limon: "+limon.botesDisponibles());
            System.out.println("Tonica: "+tonica.botesDisponibles());
            System.out.println("Agua: "+agua.botesDisponibles());
            System.out.println("Precio: "+precio);
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
            case 1:                             //cola
                if(cola.pulsarBoton()==true){
                    if(precio<=contador.Saldo()){
                        cola.iniciarDispensadorDeBotes(cola.botesDisponibles ()-1);
                    }
                    else{System.out.println("Te faltan monedas");}
                }
                
                else{System.out.println("No quedan mas latas");}
            break;
            
            case 2://limon
                if(limon.pulsarBoton()==true){
                    if(precio<=contador.Saldo()){
                        limon.iniciarDispensadorDeBotes(limon.botesDisponibles ()-1);
                    }
                    else{System.out.println("Te faltan monedas");}
                }
                
                else{System.out.println("No quedan mas latas");}
            break;
            
            case 3://naranja
                if(naranja.pulsarBoton()==true){
                    if(precio<=contador.Saldo()){
                        naranja.iniciarDispensadorDeBotes(naranja.botesDisponibles ()-1);
                    }
                    else{System.out.println("Te faltan monedas");}
                }
                
                else{System.out.println("No quedan mas latas");}
            break;
            
            case 4://tonica
                if(tonica.pulsarBoton()==true){
                    if(precio<=contador.Saldo()){
                        tonica.iniciarDispensadorDeBotes(tonica.botesDisponibles ()-1);
                    }
                    else{System.out.println("Te faltan monedas");}
                }
                
                else{System.out.println("No quedan mas latas");}
            break;
            
            //agua
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