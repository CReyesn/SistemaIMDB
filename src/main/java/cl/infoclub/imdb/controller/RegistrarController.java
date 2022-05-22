package cl.infoclub.imdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.infoclub.imdb.model.Role;
import cl.infoclub.imdb.model.Users;
import cl.infoclub.imdb.service.UserService;

@Controller
@RequestMapping("/registrar")
public class RegistrarController {

	@Autowired
	UserService userService;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/form")
	public ModelAndView crear(@ModelAttribute Users user,Model model) {
		
		System.out.println("prueba"+user);
		ModelAndView modelAndView =new ModelAndView();
		if(user.getPassword().equals(user.getPasswordConfirmation())) {
			modelAndView =new ModelAndView("redirect:/login");
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			user.setPasswordConfirmation(bCryptPasswordEncoder.encode(user.getPasswordConfirmation()));
			user.setRole(Role.USER);
			userService.save(user);
			System.out.println("test"+user);
		}else {
			modelAndView =new ModelAndView("registration");
			model.addAttribute("error","La contraseña no coincide, intentelo denuevo");
		}
		
		return modelAndView;	
	}
	
	@GetMapping("/")
	public ModelAndView registrar() {
		ModelAndView modelAndView =new ModelAndView("registration");
		return modelAndView;	
	}
}
