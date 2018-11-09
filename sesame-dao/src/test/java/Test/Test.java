package Test;/*
 * @author gp_16719
 * @Date  2018/11/8  15:00
 */

import com.huawei.it.m6.dao.UserDao;
import com.huawei.it.m6.vo.UserVO;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:application-context.xml","classpath:mybatis/spring-context-mybatis.xml","classpath:mybatis/mybatis-config.xml"})
public class Test {
    @Resource
    private UserDao userDao;

    @org.junit.Test
    public void getUserByName(){
        System.out.println("测试下");
        UserVO userVO = userDao.getUserByName("小明");
        System.out.println(userVO.getId());
    }

    @org.junit.Test
    public void save(){
         UserVO user = new UserVO();
         user.setName("小猫");
         user.setAddTime(System.currentTimeMillis());
         userDao.save(user);
    }

}
