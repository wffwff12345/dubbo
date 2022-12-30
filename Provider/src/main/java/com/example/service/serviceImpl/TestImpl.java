package com.example.service.serviceImpl;

import com.example.Interface.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestImpl implements TestService {
    @Override

    public String test(String data) {
        return data+"dubbo测试成功";
    }
}
