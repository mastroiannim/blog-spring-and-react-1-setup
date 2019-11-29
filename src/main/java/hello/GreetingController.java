package hello;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import com.andrew_flower.demo.springandreact.repository.FriendRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @Autowired
    private FriendRepository repository;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, HttpServletResponse response) {
        model.addAttribute("name", name);
        Cookie cookie = new Cookie("username", name);
        response.addCookie(cookie);

        repository.deleteAll();
        return "greeting";
    }

    @GetMapping("/readcookie")
    public String readCookie(@CookieValue(value = "username", defaultValue = "Michele") String username, Model model) {
        model.addAttribute("username", username);
        return "readcookie";
    }

}