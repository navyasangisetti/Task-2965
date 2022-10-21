package interfacetask;


public interface Test {
		 public void square(); 
		
}

class Arithmetic implements Test{
		 public void square() {
		        System.out.println("Concept of interface");
		    }
}

class ToTestInt{
		    public static void main(String[] args) {
		    Arithmetic Arthobj=new Arithmetic();
		    Arthobj.square();
		        System.out.println("Srinavya");
		    }
		}


