package com.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    /*
    *
    * 文件上传
    * */
public String fileupload2(){

    System.out.println("怎么有上传");

    return null;
}

}
