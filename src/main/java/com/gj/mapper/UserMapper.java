package com.gj.mapper;

import com.gj.domain.User;
import org.springframework.stereotype.Repository;

/**
 * :
 *
 * @author: 赵云
 * @create: 2020-04-15
 * @since 1.0.8
 */
@Repository
public interface UserMapper {

    User findById(Integer id);
}
