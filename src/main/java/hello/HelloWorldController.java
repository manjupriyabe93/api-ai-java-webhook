package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

	@RequestMapping(value="/getTotalOrders",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTotalOrders()
	{
       List<WebResponse> list = new ArrayList<>();
		
		WebResponse response = new WebResponse("CREATED","1536");  
		WebResponse response1 = new WebResponse("IncompleteOrder","501");
		WebResponse response2 = new WebResponse("FAILED","50");
		WebResponse response3 = new WebResponse("PROCESSING","24130");
		list.add(response);
		list.add(response1);
		list.add(response2);
		list.add(response3);
		return new ResponseEntity<>(list, HttpStatus.OK);
    }
	
	@RequestMapping(value="/groupByOrderChannel",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> groupByOrderChannel()
	{
       List<WebResponse> list = new ArrayList<>();
		
		WebResponse response = new WebResponse("Mobile Browser","1536");  
		WebResponse response1 = new WebResponse("App","11225");
		WebResponse response2 = new WebResponse("Desktop","19145");
		WebResponse response3 = new WebResponse("Browser","19641");
		list.add(response);
		list.add(response1);
		list.add(response2);
		list.add(response3);
		return new ResponseEntity<>(list, HttpStatus.OK);
    }
    
    
}
