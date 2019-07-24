package com.yunxi.hash.demo.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-24 00:18
 * @Description:
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Address {
    private String area;
    private String province;
    private String street;
    private String number;
}
