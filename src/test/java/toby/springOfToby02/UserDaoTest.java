package toby.springOfToby02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import toby.springtoby02.User;
import toby.springtoby02.UserDao;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringJunit4ClassRunner.class)
@ContextConfiguration(location="/test-applicationContext.xml")
public class UserDaoTest {
    @Autowired
    private ApplicationContext context;
    private UserDao dao;

    @BeforeAll
    public void setUp() {
        dao = context.getBean("userDao", UserDao.class);
    }

    @Test
    public void addAndGet() throws Exception {
        // 테이블 데이터 초기화
        dao.allDelete();
        assertThat(dao.getCount()).isEqualTo(0);

        User user = new User();
        user.setId("loop");
        user.setName("반복");
        user.setPassword("study");

        dao.add(user);
        assertThat(dao.getCount()).isEqualTo(1);

        User user2 = dao.get(user.getId());

        assertThat(user.getName()).isEqualTo(user2.getName());
        assertThat(user.getPassword()).isEqualTo(user2.getPassword());
    }

    @Test
    public void getUserFailure() throws SQLException, ClassNotFoundException {
        dao.allDelete();
        assertThat(dao.getCount()).isEqualTo(0);

        assertThatThrownBy(() -> {
            dao.get("unknown_id");
        }).isInstanceOf(EmptyResultDataAccessException.class);
    }
}
