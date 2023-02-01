package com.example.service.serviceImpl;

import com.example.Interface.TestService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TestImpl implements TestService {
    @Override

    public String test(String data) {
        return data+"dubbo测试成功";
    }
}
