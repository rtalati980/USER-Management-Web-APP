package com.example.CrudOperation.Controller;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.CrudOperation.To.User;
import com.example.CrudOperation.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("list", userService.getAllUsers());
        return "index";
    }
	
	@GetMapping("/showNewUsersForm")
    public String showNewUsersForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "new_user";
    }
	@PostMapping("/saveUser")
    public String saveUsers(@ModelAttribute("user") User user) {
        userService.saveData(user);
        return "redirect:/";
    }
	@GetMapping("/saveUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
        User user =  userService.findById(id);
        model.addAttribute("user", user);
        userService.updateById(id);
        return "update_user";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable(value = "id") int id) {
        this.userService.delete(id);
        return "redirect:/";
    }
	
}
