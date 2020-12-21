package Controller.auth;

import Security.Auth;
import Security.AuthUser;
import Service.auth.AuthService;
import VO.auth.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @Auth
    @RequestMapping(value="/myPage", method= RequestMethod.GET)
    public String MyPage(
        @AuthUser UserVO authUser,
        Model model
    ) {
        String email = authUser.getEmail();

        UserVO userVO = authService.getUser(email);

        model.addAttribute("userVO", userVO);

        return "auth/myPage";
    }

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login() {
        return "auth/login";
    }

    @RequestMapping(value="/join", method=RequestMethod.GET)
    public String join() {
        return "auth/join";
    }

    @RequestMapping(value="/join", method=RequestMethod.POST)
    public String join(UserVO userVO) {
        authService.join(userVO);

        return "redirect:/auth/joinsuccess";
    }

    @RequestMapping(value="/joinsuccess", method=RequestMethod.GET)
    public String joinsuccess() {
        return "auth/joinsuccess";
    }
}
