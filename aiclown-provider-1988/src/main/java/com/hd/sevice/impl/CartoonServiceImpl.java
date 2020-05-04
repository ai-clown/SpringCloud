package com.hd.sevice.impl;

import com.hd.entity.Cartoon;
import com.hd.mapper.CartoonMapper;
import com.hd.sevice.CartoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartoonServiceImpl implements CartoonService {
    @Autowired
    CartoonMapper cartoonMapper;
    @Override
    public int createCartoon(Cartoon cartoon) {
        return cartoonMapper.createCartoon(cartoon);
    }

    @Override
    public Cartoon getCartoonById(Long cartoonId) {
        return cartoonMapper.getCartoonById(cartoonId);
    }
}
