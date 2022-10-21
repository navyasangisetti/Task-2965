package encapsulation;

public class Room {
	    private int Roomno;
	    private String Roomtype;
	    private float Roomarea;
	    private String ACmachine;
	    
	    
	    
	    public int getRoomno() {
	        return Roomno;
	    }
	    
	    public void setRoomno(int Roomno) {
	        this.Roomno=Roomno;
	    }
	    
	    public String getRoomtype() {
	        return Roomtype;
	    }
	    
	    public void setRoomtype(String Roomtype) {
	        this.Roomtype=Roomtype;
	    }
	    
	    

	    public float getRoomarea() {
	        return Roomarea;
	    }
	    
	    public void setRoomarea(float Roomarea) {
	        this.Roomarea=Roomarea;
	    }
	    
	    
	    public String getACmachine(){
	        return ACmachine;
	    }
	    
	    public void setACmachine(String ACmachine) {
	        this.ACmachine=ACmachine;
	    }
	    
	  public class Main{ 
	    public static void main(String[] args) {
	        Room rooms=new Room();
	        rooms.setRoomno(307);
	        rooms.setRoomtype("ThreeBedRoom Flat");
	        rooms.setRoomarea(450.3778f);
	        rooms.setACmachine("LG");
	        
	        
	        System.out.println(rooms.getRoomno());
	        System.out.println(rooms.getRoomtype());
	        System.out.println(rooms.getRoomarea());
	        System.out.println(rooms.getACmachine());
	    }
	   }

}




