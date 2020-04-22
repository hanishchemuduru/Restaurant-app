package resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.User;

@RestController
@RequestMapping("/kafka")
public class UserResourse {
	
	@Autowired
	private KafkaTemplate<String,User> kafkatemplate;
	
	private static final String Topic="kafka_Example";
	
	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name) {
		
//		kafkatemplate.send(Topic, message);
		kafkatemplate.send(Topic, new User(name,"Technology",12000L));
		
		return "Published succesfully";
	}
}
