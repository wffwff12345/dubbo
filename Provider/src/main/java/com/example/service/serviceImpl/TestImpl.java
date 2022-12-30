package com.example.service.serviceImpl;

import com.example.Interface.TestService;

public class TestImpl implements TestService {
    @Override
    public String data(String data) {
        return data+"dubbo测试成功";
    }
}
