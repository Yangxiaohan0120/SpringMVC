package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import springmvc.entity.User;

/**
 * @author Chris Yang
 * created 2022-07-20 16:08
 **/

@Controller
@RequestMapping("/fm")
public class FreemarkerController {

    @GetMapping("/test")
    public ModelAndView showTest(){
        ModelAndView mav = new ModelAndView("/test");
        User user = new User();
        user.setUsername("Andy");
        mav.addObject("u",user);
        return mav;
    }
}
