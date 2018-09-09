package Telecom.App;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public String home() {
		return "Welcome Telecom at Spring Boot!!";
	}
}
