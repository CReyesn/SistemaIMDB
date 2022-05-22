package cl.infoclub.imdb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {

	@GetMapping("/recurso-prohibido")
	public ModelAndView error403() {
		ModelAndView modelAndView = new ModelAndView("403");
		return modelAndView;
	}
}
