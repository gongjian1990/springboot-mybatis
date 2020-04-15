package com.gj.domain;

import lombok.Data;
import lombok.ToString;

/**
 * :
 *
 * @author: 赵云
 * @create: 2020-04-15
 * @since 1.0.8
 */
@Data
@ToString
public class User {

    private Integer id;

    private String name;

    private Integer classId;
}
