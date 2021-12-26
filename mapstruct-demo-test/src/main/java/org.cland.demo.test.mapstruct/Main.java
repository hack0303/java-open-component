package org.cland.demo.test.mapstruct;

import org.cland.demo.test.mapstruct.converter.UserEntityMapper;
import org.cland.demo.test.mapstruct.entity.UserEntity;

public class Main {

    public static void main(String[] args){
        final UserEntity userEntity=new UserEntity();
        userEntity.setUserName("坦之");
        userEntity.setNickName("hack0303");
        userEntity.setCnt(10);
        System.out.println(UserEntityMapper.INSTANCE.userToUserVO(userEntity).getVisitCnt());
    }
}
