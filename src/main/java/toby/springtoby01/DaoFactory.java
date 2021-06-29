package toby.springtoby01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.sql.Driver;

@Configuration  // 애플리케이션 컨텍스트 또는 빈 패곹리가 사용할 설정정보라는 표시
public class DaoFactory {

    @Bean       // 오브젝트 생성을 담당하는 IoC용 메소드라는 표시
    public UserDao userDao() {
        return new UserDao();
    }


//    public AccountDao accountDao() {
//        return new AccountDao(connectionMaker());
//    }
//
//    public MessageDao messageDao() {
//        return new MessageDao(connectionMaker());
//    }
    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }

//    @Bean
//    public DataSource dataSource() {
//        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//
//        dataSource.setDriverClass(Driver.class);
//        dataSource.setUrl("jdbc:mysql://localhost/springbook");
//        dataSource.setUsername("spring");
//        dataSource.setPassword("book");
//
//        return Object;
//    }
}
