package project8;

public class Password {
	
	protected int longitud;
	protected String contraseña;
	
	public static void main(String[] args) {
		
		Password pass = new Password("",20);
		pass.getContraseña();	
		
	}
			
	public Password() {
		this.contraseña = "";
		this.longitud = 8;
	}

	public String getContraseña() {
		return contraseña;
	}

	public Password(String Contraseña, int longitud) {				                 				
		
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        
         
         StringBuilder sb = new StringBuilder(longitud);         
         
         for (int n = 0; n < longitud; n++) {
        	         
        	   //nombre aleatori a mode d'index
        	   int index = (int)(alfabet.length() * Math.random());        	   
        	 
        	   // afegir caracter al final de sb
        	   sb.append(alfabet.charAt(index));        	   
        	   sb.toString();
        	   
        }
         System.out.println("Contraseña: "+sb);
         
	}
	
	

}
