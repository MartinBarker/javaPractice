
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    InputStreamReader r=new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(r);
		try {
		String size = br.readLine();
		String tc;
		while((tc = br.readLine()) != null) {
		    String[] arr = tc.split(" ");
		    System.out.println(check(arr));
		}
		} catch(IOException e) {
		    
		}
	}
	
	public static int check(String[] arr) {
	    Queue<String> q = new LinkedList<String>();
	    for(int i = 0 ; i < arr[0].length(); i++) {
	        q.add(String.valueOf(arr[0].charAt(i)));
	    }
	    
	    for(int i = 0; i < arr[1].length(); i++) {
	        if((q.size() != 0) && (q.peek().equals(String.valueOf(arr[1].charAt(i))))) {
	            q.remove();
	        }
	    }
	    
	    if(q.size() == 0){
	        return 1;
	    }
	    return 0;
	}
}