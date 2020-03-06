package interfaces;

public interface Isport {
	
	abstract void courir();
	abstract void nager ();
	abstract void pedaler ();
	
	default void respirer() {
        System.out.println("hhhhhhhhhhh");
    }
	
	static void hello() 
    { 
        System.out.println("Hello"); 
    } 

}
