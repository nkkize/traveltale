/**
 * 
 */
package in.traveltale.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author hungrymind
 *
 */
@Controller
public class GreetingController {

	@RequestMapping("/greetings")
	public ModelAndView showGreetings() {
		ModelAndView model = new ModelAndView();
		model.setViewName("greetings");
		return model;
	}

}
