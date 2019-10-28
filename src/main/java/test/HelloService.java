package test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
////新建服务接口声明映射服务ID
@FeignClient("hello-service")
public interface HelloService {
	
	//将服务提供方需要调用的方法复制一遍（声明服务方调用的方法路径）
	//如有参数将服务提供方@RequestMapping 和方法头复制过来即可
	//	@RequestMapping("/hello")
	//	@RequestMapping("/hello1"，method=RequestMethod.GET)
	//	String hello1(@requestParam("name") String name)
	@RequestMapping("/hello")
	public String hello();
	
}
