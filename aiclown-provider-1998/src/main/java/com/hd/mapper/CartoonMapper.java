package com.hd.mapper;

import com.hd.entity.Cartoon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author aiClown
 *
 */
@Mapper
@Component
public interface CartoonMapper {
    public int createCartoon(Cartoon cartoon);
    public Cartoon getCartoonById(@Param("cartoonId") Long cartoonId);
}
