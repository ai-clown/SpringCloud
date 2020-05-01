package com.hd.controller;

import com.hd.entity.Cartoon;
import com.hd.entity.CommonResult;
import com.hd.sevice.CartoonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class CartoonController {
    @Autowired
    CartoonService cartoonService;
    @PostMapping(value = "/cartoon/create")
    public CommonResult createCartoon(@RequestBody Cartoon cartoon){
        int result=cartoonService.createCartoon(cartoon);
        log.info("***插入结果:"+result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功!",result);
        }else {
            return new CommonResult(444,"插入数据库失败!",null);
        }
    }

    @GetMapping(value = "/cartoon/get/{cartoonId}")
    public CommonResult getCartoonById(@PathVariable("cartoonId")Long cartoonId){
        Cartoon cartoon=cartoonService.getCartoonById(cartoonId);
        log.info("***插入结果:"+cartoon);
        if (cartoon!=null){
            return new CommonResult(200,"查询成功!",cartoon);
        }else {
            return new CommonResult(444,"没有对应的记录,查询id:"+cartoonId,null);
        }
    }
}
