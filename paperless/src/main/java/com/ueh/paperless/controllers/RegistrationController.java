package com.ueh.paperless.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {

		@GetMapping("/reg-instructor")
		public String regInstructor(Model model) {
			return "AccessManaged/usr-regstr";
			
		}
		
		@GetMapping("/reg-learner")
		public String regLearner(Model model) {
			return "AccessManaged/learner-reg";
			
		}
}
