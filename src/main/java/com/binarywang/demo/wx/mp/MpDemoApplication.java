package com.binarywang.demo.wx.mp;

import me.chanjar.weixin.common.error.WxErrorException;
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
public class MpDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpDemoApplication.class, args);
    }

    @Autowired
    private WxMpService mpService;

    @GetMapping("/test")
    public String test() throws WxErrorException {
        // this.mpService.getWxMpConfigStorage().getAppId();
        return  this.mpService.getAccessToken();
    }
}
