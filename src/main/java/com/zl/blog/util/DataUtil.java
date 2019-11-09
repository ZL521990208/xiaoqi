package com.zl.blog.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.time.LocalDate;
import java.util.Random;

//数据生成工具，用来生成用户的数据
public class DataUtil {
    public  static String getMobile(){
        StringBuilder stringBuilder = new StringBuilder("139");
        Random random = new Random();
        for (int i =0;i<8;i++){
            int num = random.nextInt(10);
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }


    public static String getPassword(){
        StringBuilder password = new StringBuilder("139");
        Random random = new Random();
        for (int i =0;i<6;i++){
            int num = random.nextInt(10);
            password.append(num);
        }
        return DigestUtils.md5Hex(password.toString());
    }

public static  String getGender(){
        String[] genders = new String[]{"男","女"};
        Random random = new Random();
        int index = random.nextInt(2);
        return genders[index];
}
public static LocalDate getBirthday(){
        LocalDate now = LocalDate.now();
        Random random = new Random();
        int bound = random.nextInt(888);
        //当前日期bound天
        return now.minusDays(bound);
}

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(DataUtil.getMobile());
//        }
//    }
}
