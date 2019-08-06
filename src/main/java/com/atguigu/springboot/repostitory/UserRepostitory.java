package com.atguigu.springboot.repostitory;

import com.atguigu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mr.Z
 * @create 2019/8/6 8:57
 *
 */
public interface UserRepostitory extends JpaRepository<User,Integer> {

}
