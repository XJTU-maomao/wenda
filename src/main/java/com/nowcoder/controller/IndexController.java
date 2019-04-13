package com.nowcoder.controller;

import com.nowcoder.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Saber on 2018/2/24 下午1:13
 */
@Controller
public class IndexController {

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(value = {"/","/index"},method = {RequestMethod.GET})
    @ResponseBody
    public String index(){
        return "Hello NowCoder";
//        return "index";
    }

    @RequestMapping(path = {"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("userId") int userId,
                          @PathVariable("groupId") String groupId,
                          @RequestParam(value = "type",defaultValue = "nowcoder") int type,
                          @RequestParam(value = "key",required = false) String key){
        return String.format("Profile Page of %s / %d  type = %d, key = %s", groupId,userId,type,key);
    }

    @RequestMapping(path = {"/vm"},method = {RequestMethod.GET})
    public String template(Model model){
        model.addAttribute("value1", "vvvvv1");
        List<String> colors = Arrays.asList(new String[]{"RED","GREEN","BLUE"});
        model.addAttribute("colors", colors);
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        model.addAttribute("map",map);
        model.addAttribute("user",new User("Lee"));
        return "home";
    }









    /**
     * ajax test
     *
     * @param request
     * @return
     */
    @RequestMapping("/ajax")
    @ResponseBody
    public String ajaxTest(HttpServletRequest request) {
        return "ajax 测试成功~";
    }

    /**
     * 页面测试
     *
     * @param map
     * @return
     */
    @RequestMapping("/welcome")
    public String viewTest(Map<String, String> map) {
        map.put("a", "SpringBoot1.5.10+velocity 页面测试1");
        return "welcome";
    }

    /**
     * 页面测试2
     *
     * @return
     */
    @RequestMapping("/welcome2")
    public ModelAndView viewTest2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("a", "SpringBoot1.5.10+velocity 页面测试2");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }


    /**
     * 页面测试3
     *
     * @return
     */
    @RequestMapping("/welcome3")
    public ModelAndView viewTest3() {
        ModelMap map = new ModelMap();
        map.put("a", "SpringBoot1.5.10+velocity 页面测试3");
        return new ModelAndView("view/welcome", map);
    }


}
