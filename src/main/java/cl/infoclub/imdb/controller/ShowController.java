package cl.infoclub.imdb.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.infoclub.imdb.model.Rating;
import cl.infoclub.imdb.model.Showw;
import cl.infoclub.imdb.model.Users;
import cl.infoclub.imdb.service.RatingService;
import cl.infoclub.imdb.service.ShowService;
import cl.infoclub.imdb.service.UserService;

@Controller
@RequestMapping("/show")
public class ShowController {

	@Autowired
	UserService userService;
	
	@Autowired
	ShowService showService;
	
	@Autowired
	RatingService ratingService;
	
	@GetMapping("/home")
	public ModelAndView inicio(Principal principal,Model model) {
		ModelAndView modelAndView =new ModelAndView("home");
		System.out.println(principal.getName());
		model.addAttribute("shows",showService.findAll());
		model.addAttribute("email",principal.getName());
		return modelAndView;
	}
	
	@GetMapping("/new")
	public String nuevo() {
		return "new";
	}
	
	@PostMapping("/form")
	public ModelAndView form(@ModelAttribute Showw show,Principal principal) {
		Users creadorShow=userService.findUsersByEmail(principal.getName());
		show.setCreadorShow(creadorShow);
		showService.save(show);
		
		ModelAndView modelAndView = new ModelAndView("redirect:/show/home");
		return modelAndView;
	}
	
	@GetMapping("/rate/{id}")
	public String rate(@PathVariable("id")Long id,Model model) {
		
		model.addAttribute("show", showService.findById(id));
		
		return "show";
	}
	
	@PostMapping("/rateForm")
	public ModelAndView rateForm(@RequestParam Long showId,int rating,Principal principal) {
		ModelAndView modelAndView = new ModelAndView("redirect:/show/rate/"+showId);
		Showw show=showService.findById(showId);
		System.out.println("showrating"+show.getRatings()); 
		Rating nuevoRating = new Rating();
		nuevoRating.setRating(rating);
		nuevoRating.setShow(show);
		nuevoRating.setUser(userService.findUsersByEmail(principal.getName()));
		ratingService.save(nuevoRating);
		return modelAndView;
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id")Long id,Model model) {
		
		model.addAttribute("show", showService.findById(id));
		
		return "edit";
	}
	
	@PostMapping("/editForm")
	public ModelAndView editForm(@ModelAttribute Showw show,Principal principal) {
		Users creadorShow=userService.findUsersByEmail(principal.getName());
		show.setCreadorShow(creadorShow);
		showService.update(show);
		
		ModelAndView modelAndView = new ModelAndView("redirect:/show/home");
		return modelAndView;
	}
	
	@PostMapping("/delete")
	public ModelAndView delete(@RequestParam Long showId) {
		
		showService.delete(showService.findById(showId));
		ModelAndView modelAndView = new ModelAndView("redirect:/show/home");
		return modelAndView;
	}
	
	
}
