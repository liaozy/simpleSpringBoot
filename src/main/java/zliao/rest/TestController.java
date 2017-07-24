package main.java.zliao.rest;

import main.java.zliao.service.Seg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zliao on 2017/7/21.
 */
@RestController
public class TestController {
    @Autowired
    Seg seg;

    @RequestMapping("/hello")
    public String hello(){
        seg.hanlp_seg("你来说说看天安门到底在哪里");

        return "hello world!";
    }
}
