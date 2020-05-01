package com.hd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cartoon implements Serializable {
    private Long cartoonId;
    private String cartoonName;
    private String cartoonDesc;
    private String cartoonImage;
    private String cartoonUrl;
}
