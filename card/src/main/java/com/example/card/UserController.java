/**
 * UserController.java
 * This class controls the application
 * 
 * Author: Surya Prakash
 * Contact: suryamdk5@gmail.com
 * 
 * Created on: 2023-08-29
 */

package com.example.card;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

	//Auto wired connection for database interaction
	@Autowired
	UserRepository userRepository;
	
	//handling the get request from the client
	@GetMapping("/home")
	public String home(@RequestParam(name="filter",required=false)String filter, Model model) {
		
		//Fetch all the data from the table 
		List<User> users = userRepository.findAll();
		
		//sorting the list using lambda function
		Collections.sort(users, (user1,user2) -> user1.getUsername().compareToIgnoreCase(user2.getUsername()));
		
		//checking the filter is not null for adding filter
		if(filter != null) {
			
			//filtering the list based on filter parameter
			List<User> filteredUsers = users.stream().filter(user -> user.getUsername().toLowerCase().contains(filter.toLowerCase())).collect(Collectors.toList());
			
			//adding the filtered user list to the model
			model.addAttribute("users",filteredUsers);
		}else {			
			
			//if the user dosn't send any parameter it adds all the sorted user list to the model
			model.addAttribute("users",users);
		}
		
		return "home";
	}
}
