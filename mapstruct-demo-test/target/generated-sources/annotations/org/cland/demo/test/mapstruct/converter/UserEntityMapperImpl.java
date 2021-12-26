package org.cland.demo.test.mapstruct.converter;

import javax.annotation.Generated;
import org.cland.demo.test.mapstruct.entity.UserEntity;
import org.cland.demo.test.mapstruct.vo.UserVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-26T21:31:41+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class UserEntityMapperImpl implements UserEntityMapper {

    @Override
    public UserVO userToUserVO(UserEntity user) {
        if ( user == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setVisitCnt( user.getCnt() );
        userVO.setUserName( user.getUserName() );
        userVO.setNickName( user.getNickName() );

        return userVO;
    }
}
