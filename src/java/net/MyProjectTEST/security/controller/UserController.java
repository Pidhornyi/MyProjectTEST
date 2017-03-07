package net.MyProjectTEST.security.controller;


import net.MyProjectTEST.security.model.User;
import net.MyProjectTEST.security.service.SecurityService;
import net.MyProjectTEST.security.service.UserService;
import net.MyProjectTEST.security.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for {@link net.MyProjectTEST.security.model.User}'s pages.
 *
 * @author pidhornyi
 * @version 1.0
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login_admin", method = RequestMethod.GET)
    public String login_admin(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Username or password is incorrect.");
        }

        if (logout != null) {
            model.addAttribute("main_menu", "Logged out successfully.");
        }

        return "login_admin";
    }

   // @RequestMapping(value = {"/", "/main_menu"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        //SecurityContextHolder.clearContext(); // одноразовая страница
        //SecurityContextHolder.setContext(null);

        return "main_menu";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(Model model) {
        return "admin";
    }

    @RequestMapping(value="/test", method = RequestMethod.GET)
        public String test(Model model){
        SecurityContextHolder.clearContext();
        return "test";
        }

    @RequestMapping(value= "/test_for_candidate", method = RequestMethod.GET)
    public String test_for_candidate(Model model){
        return "/test_for_candidate";
    }
    //login page for candidate
    @RequestMapping(value ="/enter_page_for_candidate", method = RequestMethod.GET)
    public String enter_page (Model model, String error,String logout) {

        if (error != null) {
            model.addAttribute("error", "Mail address or password is incorrect.");
        }

        if (logout != null) {
            model.addAttribute("main_menu", "Logged out successfully.");
        }

        return "/enter_page_for_candidate";
    }

}
