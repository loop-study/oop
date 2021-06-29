package toby.springOfToby02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import toby.springtoby02.User;
import toby.springtoby02.UserDao;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.*;


public class UserDaoTest {

    @Test
    public void addAndGet() throws Exception {
        ApplicationContext context = new GenericXmlApplicationContext("toby02/applicationContext.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);

        // 테이블 데이터 초기화
        userDao.allDelete();
        assertThat(userDao.getCount()).isEqualTo(0);

        User user = new User();
        user.setId("loop");
        user.setName("반복");
        user.setPassword("study");

        userDao.add(user);
        assertThat(userDao.getCount()).isEqualTo(1);

        User user2 = userDao.get(user.getId());

        assertThat(user.getName()).isEqualTo(user2.getName());
        assertThat(user.getPassword()).isEqualTo(user2.getPassword());
    }

    @Test
    public void getUserFailure() throws SQLException, ClassNotFoundException {
        ApplicationContext context = new GenericXmlApplicationContext("toby02/applicationContext.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);

        userDao.allDelete();
        assertThat(userDao.getCount()).isEqualTo(0);

        assertThatThrownBy(() -> {
            userDao.get("unknown_id");
        }).isInstanceOf(EmptyResultDataAccessException.class);
    }
}
