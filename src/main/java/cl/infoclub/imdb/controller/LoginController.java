package cl.infoclub.imdb.controller;


import javax.servlet.http.HttpSession;

import org.hibernate.annotations.ValueGenerationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.infoclub.imdb.model.Role;
import cl.infoclub.imdb.model.Users;
import cl.infoclub.imdb.service.UserService;
import cl.infoclub.imdb.service.impl.AuthService;


@Controller
public class LoginController {



	
	@GetMapping("login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");

		return modelAndView;
	}
	


}
