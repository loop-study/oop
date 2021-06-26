package toby.springtoby01;

import java.sql.SQLException;

public class SpringOfToby01 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao(new DConnectionMaker());

        User user = new User();
        user.setId("loop");
        user.setName("반복");
        user.setPassword("study");

        userDao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = userDao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + " 조회 성공");
    }
}