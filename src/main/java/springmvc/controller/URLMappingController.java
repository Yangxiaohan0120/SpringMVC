package springmvc.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springmvc.entity.User;

import java.util.Date;

/**
 * @author Chris Yang
 * created 2022-07-19 22:06
 **/

@Controller
@RequestMapping("/um")
public class URLMappingController {

    @GetMapping("/g")
    @ResponseBody
    public String getMapping(@RequestParam("manager_name") String managerName) {
        System.out.println("manager_name: " + managerName);
        return "This is get method";
    }

    @PostMapping("/p")
    @ResponseBody
    public String postMapping(String username, String password, @DateTimeFormat(pattern = "yyyy-MM-dd") Date createTime) {
        System.out.println(username + " : " + password);
        return "This is post method";
    }

    @PostMapping("/p1")
    @ResponseBody
    public String postMapping1(User user) {
        System.out.println(user.getUsername() + ":" + user.getPassword());
        return "这是post响应";
    }

    @GetMapping("/view")
    public ModelAndView showView(Integer userId) {
//        ModelAndView mav = new ModelAndView("redirect:/view.jsp");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/view.jsp");
        User user = new User();
        if (userId == 1) {
            user.setUsername("Lily");
        } else {
            user.setUsername("Smith");
        }
        mav.addObject("u", user);
        return mav;
    }

    // String与ModelMap
    // Controller方法返回String情况
    // 1. 方法被@ResponseBody描述，StringMVC直接响应String字符串本身
    // 2. 方法不存在@ResponseBody，则StringMVC处理String指代的视图（页面）

    @GetMapping("/str")
//    @ResponseBody
    public String showView1(Integer userId, ModelMap modelMap){
        String view = "/view.jsp";
        User user = new User();
        if (userId == 1) {
            user.setUsername("Lily");
        } else {
            user.setUsername("Smith");
        }
        modelMap.addAttribute("u",user);
        return view;
    }
}
