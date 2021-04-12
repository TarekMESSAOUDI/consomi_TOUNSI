package tn.esprit.spring.websocket;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@Controller
public class MainController {
 
    @RequestMapping("/SpringMVC/servlet")
    public String index(HttpServletRequest request, Model model) {
        String username = (String) request.getSession().getAttribute("username");
 
        if (username == null || username.isEmpty()) {
            return "redirect:/login";
        }
        model.addAttribute("username", username);
 
        return "chat";
    }
 
    @RequestMapping(path = "/SpringMVC/servlet/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "login";
    }
 
    @RequestMapping(path = "/SpringMVC/servlet/login", method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, @RequestParam(defaultValue = "") String username) {
        username = username.trim();
 
        if (username.isEmpty()) {
            return "login";
        }
        request.getSession().setAttribute("username", username);
 
        return "redirect:/";
    }
 
    @RequestMapping(path = "/SpringMVC/servlet/logout")
    public String logout(HttpServletRequest request) {
        request.getSession(true).invalidate();
         
        return "redirect:/SpringMVC/servlet/login";
    }
     
}