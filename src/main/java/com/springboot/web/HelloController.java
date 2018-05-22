package com.springboot.web;

import com.springboot.exception.MyException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/22 16:56
 * @Description: globalexception
 */

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host","http://blog.didispace.com");
        return "index";
    }
}
