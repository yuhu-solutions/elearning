package org.yuhu.solutions.elearning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "defaultController")
@RequestMapping(path = "/", produces = "application/json; charset=UTF-8")
public class DefaultController {

	@RequestMapping(method = { RequestMethod.GET })
	public String doGet() {
		return "hello world!";
	}
}
