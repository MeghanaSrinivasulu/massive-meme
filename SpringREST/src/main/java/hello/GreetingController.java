package main.java.hello;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class GreetingController {
      private static final String TAG_ID = "id";
      private static final String TAG_CONTENT = "content";
      HashMap<String, String> detail;
      ArrayList<HashMap<String, String>> arrhash = new ArrayList<HashMap<String, String>>();
      int indexVal;
 
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
 
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Greeting greet = new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
       String id = String.valueOf(greet.getId());
        detail = new HashMap<String, String>();
        detail.put(TAG_ID, id);
        detail.put(TAG_CONTENT, greet.getContent());
        arrhash.add(detail);
        return greet;
    }
   
    @RequestMapping("/allgreetings")
    public AllGreeting getAllGreetings(){
      return new AllGreeting(arrhash);
    }
    
    @RequestMapping(value = "/editgreeting", method=RequestMethod.POST) 
    public AllGreeting editGreeting(
    	@RequestParam(value = "id") String identity,
    	@RequestParam(value = "content") String listContent){
    	HashMap<String, String> hash = new HashMap<String, String>();
    	for (int i=0;i<arrhash.size();i++){
    		hash = arrhash.get(i);
    		if(hash.get("id").equals(identity)){
    			indexVal = i;
    			break;
    		}
    	   
       }
    if(!hash.get("content").equals(listContent)){
    	hash.put("id", identity);
    	hash.put("content", "Hello, "+listContent+"!");
    	arrhash.remove(indexVal);
    	arrhash.add(indexVal, hash);
    	return new AllGreeting(arrhash);
    }
    
    	
    	 return new AllGreeting(arrhash);
    }
    
   
}