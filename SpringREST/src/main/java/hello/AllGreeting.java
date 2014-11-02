package main.java.hello;
 
import java.util.ArrayList;
import java.util.HashMap;
 
public class AllGreeting {
     
      public ArrayList<HashMap<String, String>> details = new ArrayList<HashMap<String,String>>();
     
      public AllGreeting(ArrayList<HashMap<String,String>> details){
            this.details = details;
      }
 
      public ArrayList<HashMap<String, String>> getDetails() {
            return details;
      }
 
      public void setDetails(ArrayList<HashMap<String, String>> details) {
            this.details = details;
      }
     
}