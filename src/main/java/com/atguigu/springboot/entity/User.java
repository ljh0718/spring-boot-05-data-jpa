package com.atguigu.springboot.entity;

import javax.persistence.*;

/**
 * @author Mr.Z
 * @create 2019/8/6 8:46
 */
//使用jpa注解配置映射关系
@Entity//告诉jpa这是一个实体类
@Table(name = "tb1_user")//如果省略默认为类名小写user
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column(name = "last_name",length = 50)//这是和数据表对应的一个列
    private String lastName;

    //省略默认列名就是属性名
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
