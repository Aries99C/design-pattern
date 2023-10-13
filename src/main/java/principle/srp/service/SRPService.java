package principle.srp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SRPService {
    private Dao dao;

    public UserDTO findUser(String name) throws SQLException {
        User user = dao.findUserByName(name);
        UserDTO dto = new UserDTO(user);
        // entity值拷贝到dto
        return dto;
    }
}

class Dao {   // Dao类负责封装查询结果
    public User findUserByName(String name) throws SQLException {
        // 数据库连接职责
        Connection connection = DataBaseUtils.getConnection();     // DataBaseUtils类负责管理数据库连接和SQL执行
        // SQL执行职责
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM t_user WHERE name = ?");
        preparedStatement.setObject(1, name);
        // 封装查询结果职责
        User user = new User(); // 处理结果
        return user;
    }
}

class DataBaseUtils {
    public static Connection getConnection() {
        return null;
    }
}