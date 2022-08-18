package pers.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class MyUserController {
    @GetMapping("/")
    public RedirectView welcome() {
        return new RedirectView("https://youtu.be/dQw4w9WgXcQ");
    }
}
