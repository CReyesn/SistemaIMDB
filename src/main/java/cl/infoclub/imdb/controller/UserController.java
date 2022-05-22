package cl.infoclub.imdb.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.infoclub.imdb.model.Role;
import cl.infoclub.imdb.model.Showw;
import cl.infoclub.imdb.model.Users;
import cl.infoclub.imdb.service.ShowService;
import cl.infoclub.imdb.service.UserService;
import cl.infoclub.imdb.service.impl.AuthService;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	

	@GetMapping("/obtener")
	public ModelAndView obtenerPorId() {
		ModelAndView modelAndView =new ModelAndView("");
		Users objetoCaturado=userService.findById((long) 1);
		System.out.println(objetoCaturado);
		return modelAndView;
		
	}
	
	

	
}
