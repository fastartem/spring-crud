package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;
import web.service.UserService;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "users")
    public String printWelcome(ModelMap model) {
        List<User> users = Arrays.asList(new User("Max", "sds", "sds"),
                new User("Max1", "sds", "sds"),
                new User("Max2", "sds", "sds"),
                new User("Max3", "sds", "sds"));

        userService.add(new User("Max", "sds", "sds"));
        userService.add(new User("Max1", "sds", "sds"));
        userService.add(new User("Max2", "sds", "sds"));
        userService.add(new User("Max3", "sds", "sds"));

        model.addAttribute("users", users);

        return "users";
    }
}