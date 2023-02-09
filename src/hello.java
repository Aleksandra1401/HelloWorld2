import java.util.Date;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    //date object
        Date current_Date = new Date();

        //display time
        System.out.println("Today is: ");
        System.out.println(current_Date);
        
        //display memory 
        System.out.println("Free memory in bytes:");
        System.out.println(Runtime.getRuntime().freeMemory());

	}

}
