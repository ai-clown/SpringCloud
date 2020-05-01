package com.hd.sevice;


import com.hd.entity.Cartoon;
import org.apache.ibatis.annotations.Param;

public interface CartoonService {
    public int createCartoon(Cartoon cartoon);
    public Cartoon getCartoonById(@Param("cartoonId") Long cartoonId);
}
