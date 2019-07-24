package com.yunxi.hash.demo.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-24 00:14
 * @Description:
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private Integer age;
    private String telephone;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        User user = (User) o;
//        return name.equals(user.name) &&
//                age.equals(user.age) &&
//                telephone.equals(user.telephone);
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode() + age.hashCode() + telephone.hashCode();
//    }
}
