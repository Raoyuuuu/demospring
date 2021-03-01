import com.demo.model.User;
import com.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title:
 * @auther: raohr
 * @Date: 2021/2/24 15:21
 * @param:
 * @Description:
 * @return:
 * @throws:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-mybatis.xml")
public class test {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        User user = userService.selectByPrimaryKey("54121512121512");
        System.out.println(user);
    }

}
