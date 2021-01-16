package cn.tulingxueyuan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    /**
     * RequestMapping 将方法映射给对应的url请求处理
     * @param name 无论是get还是post请求，springmvc都会自动匹配请求的参数值
     * @return
     */
    @RequestMapping("/Hello")
    public String hello(String name){
        System.out.println("Hello springmvc"+name);
        // 响应
        // redirect：重定向（url改变）
        // forward：转发(默认,url不变)
        // return "redirect:index.jsp";
        return "index.jsp";
    }
}
