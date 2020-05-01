package com.hd.controller;


import com.hd.entity.Cartoon;
import com.hd.entity.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class CustomerController {
    public static final String PAYMENT_URL="http://localhost:1998";
    @Autowired
    private RestTemplate restTemplate;
    @PostMapping("/customer/cartoon/create")
    public CommonResult<Cartoon> createCartoon(Cartoon cartoon){
        return restTemplate.postForObject(PAYMENT_URL+"/cartoon/create",cartoon,CommonResult.class);
    }
    @GetMapping(value = "/customer/cartoon/get/{cartoonId}")
    public CommonResult getCartoonById(@PathVariable("cartoonId")Long cartoonId) {
        return restTemplate.getForObject(PAYMENT_URL+"cartoon/get/"+cartoonId,CommonResult.class);
    }
}
