package interfacetask;


public class Interjava8 {
	public interface interjava8 {
		
	    default void Animal(){
	        System.out.println("DOG");
	    }
	    static void Bird(){
	        System.out.println("Peacock");
	    }
	

class Main implements interjava8{
	    public static void main(String args[]){
	    Main obj = new Main();
	    obj.Animal();
	    interjava8.Bird();
	    }
	}
}



}
