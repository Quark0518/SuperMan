import com.atguigu.pojo.User;
import com.atguigu.service.impl.UserSeviceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.util.List;

/**
 * @date 2022-08-03 19:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class MyTest {
    @Autowired
    private UserSeviceImpl userSevice;

    @Test
    public void test1() throws SQLException {
        List<User> users = userSevice.selectAll();
        System.out.println("users = " + users);
    }
}