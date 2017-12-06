package io.github.cruzryan;

public class Encrypt {
	public static void main(String[] args) {
		
		String message = "Encrypt this message!";
		
		encrypt(message);
		
		
		
	}
	
	public static void encrypt(String message) {
		
		String final_msg = null;
		int x = 0;
		char y = 'a';
		
		for (String s : message.split("")) { // Read each character of the message
			
		    char a = s.charAt(0); //Get the first character
		    int b = (int)a; //Turn it into ascii
		    
		    String c = b + " ";
		    
		    for (String d : c.split("")) { //Read each character of the ascii
		    	x++;
		    	char aa = d.charAt(0);  //Get the first character
		    	int bb = (int)aa; //Turn it into ascii

		    	if(bb < 40) {  //Switch between 0 and 1 to make it even less readable!
		    		bb = 0;
		    	}else if(bb > 40) {
		    		bb = 1;
		    	}
		    	String cc = new Character((char)bb).toString();
		    	
		    	if ( (x & 1) == 0 ) { //Check if odd or even 
		    		x = 0;
		    		y = '/'; //Mess it up a bit
		    	} else {
		    		x = 1;
		    		y = '\\'; //Mess it up a bit
		    	} 
		    	System.out.print("" + y + "" + cc); //print it boyyy
		    	final_msg = cc;
		    }
		    
		    System.out.print(final_msg); //I don't even know, don't ask me.
		    
		}
	}
}
