package com.ueh.paperless;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;
 
	@GetMapping("/user-signup")
	public String userForm(Model model) {
		model.addAttribute("user", new User());
		return "user-signup";
	}

	@GetMapping("/login")
	public String userLogin(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	// Registering user
	@PostMapping("/sign-up")
	public String userSubmit(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email,
			@RequestParam String password) {
		User n = new User();
		n.setFirstName(firstName);
		n.setLastName(lastName);
		n.setPassword(password);
		n.setEmail(email);
		userRepository.save(n);
		return "dashboard";
	}
	
	// Sign in
	@PostMapping("/signin")
	public String userSignIn(@RequestParam String email, @RequestParam String password) {
		User n =  userRepository.findByEmail(email);
		if (email.equals(n.getEmail())  && password.equals(n.getPassword())) {	
			return "dashboard";
		} else {
			System.out.println("nowork");
			
			return "redirect:/login";
		}
	}

	// @PostMapping("/test")
	// public String userSubmit(@ModelAttribute User user) {
	//
	// return "register";
	// }

}
