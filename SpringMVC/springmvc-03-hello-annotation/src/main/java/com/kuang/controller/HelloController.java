
package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/HelloController")
public class HelloController {

    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/hello")
    public String sayHello(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC Annotation!  --Rafa");
        //web-inf/jsp/hello.jsp
        return "hello";
    }

    @RequestMapping("/hello1")
    public String sayHello1(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC Annotation! sayHello1(Model model)  --Rafa");
        //web-inf/jsp/hello.jsp
        return "hello";
    }
//原来是不是要写三个servlet处理，现在写三个方法就可以了
    @RequestMapping("/hello2")
    public String sayHello2(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC Annotation! sayHello2(Model model)  --Rafa");
        //web-inf/jsp/hello.jsp
        return "hello";
    }

}