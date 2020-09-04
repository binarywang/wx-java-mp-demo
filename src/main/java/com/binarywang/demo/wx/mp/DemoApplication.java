package com.binarywang.demo.wx.mp;

import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author binary wang
 */
@RestController
@RequestMapping("/")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private WxMpService mpService;

    @GetMapping("/test")
    public String getAppId() {
        return this.mpService.getWxMpConfigStorage().getAppId();
    }
}
