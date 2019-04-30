package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TestConotroller {
	
	@Autowired
	HelloService helloService;
	
	@RequestMapping(value="/feign-consumer",method=RequestMethod.GET)
	public String helloConsumer(){
		return helloService.hello();
	}
}
