package main.java.zliao.service;

import com.hankcs.hanlp.HanLP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zliao on 2017/7/24.
 */
@Service
public class Seg {
    public String hanlp_seg(String input){
        System.out.println(HanLP.segment(input));
        System.out.println(HanLP.segment("你好，欢迎使用HanLP汉语处理包！"));
        return "";
    }

}

