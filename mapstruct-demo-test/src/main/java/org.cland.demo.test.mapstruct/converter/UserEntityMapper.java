package org.cland.demo.test.mapstruct.converter;

import org.cland.demo.test.mapstruct.entity.UserEntity;
import org.cland.demo.test.mapstruct.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserEntityMapper {

    UserEntityMapper INSTANCE = Mappers.getMapper( UserEntityMapper.class );

    @Mappings(@Mapping(target = "visitCnt", source = "cnt"))
    UserVO userToUserVO(UserEntity user);
}
