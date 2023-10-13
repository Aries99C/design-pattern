package principle.srp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 过多的职责
public class Service {
    public Connection getConnection() {
        return null;
    }
    public UserDTO findUser(String name) throws SQLException {
        // 数据库连接职责
        Connection connection = getConnection();
        // SQL执行职责
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM t_user WHERE name = ?");
        preparedStatement.setObject(1, name);
        User user = new User(); // 处理结果
        UserDTO dto = new UserDTO(user); // entity值拷贝到dto
        return dto;
    }
}

