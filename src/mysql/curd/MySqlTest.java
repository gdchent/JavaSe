package mysql.curd;


import java.sql.*;

/**jdbc详细教程地址：
 * https://www.yiibai.com/jdbc/jdbc-result-sets.html
 */
public class MySqlTest {

    //测试代码
    public static void main(String... args) {

        try {
            String dbName = "gdchent";
            String tabName = "gdchenttable";
            //step1 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver"); //新版jdbc用的是ck.jdbc.Driver
            //链接sql的语句 表示你要链接的是哪个数据库  serverTimezone=UTC 不加这个会报错的
            String url = "jdbc:mysql://localhost/" + dbName + "?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
            System.out.println("注册驱动成功");
            //step2 打开一个链接
            Connection connection = DriverManager.getConnection(url, "root", "gdchent0330");
            // 这个函数 重载的 3个参数时 第一个参数表示ResultSet对象的类型
            // 第二个参数是两个ResultSet常量之一，
            // 用于指定结果集是只读还是可更新。
            //第三个参数表示  ResultSet.CONCUR_READ_ONLY 表示只读  ResultSet.CONCUR_UPDATABLE 表示可写 也就是结果数据可以更新

            Statement statement = connection.createStatement();
            //createDataBase(statement, "gdchent"); //创建数据库
            //dropDataBase(statement,"gdchent2");  //删除数据库
            //createTable(statement,dbName,"gdchentTable"); //创建表
            //insertSql(statement,tabName);
            //selectSql(statement,tabName);
            //updateSql(statement,tabName);
            //dropSql(statement, tabName);
            String sql = "insert into " + tabName + " values (196,'bilibili',29,'description');";
            PreparedStatement preparedStatement=connection.prepareStatement(sql); //prepareStatement对象
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    //创建数据库
    public static void createDataBase(Statement statement, String sqlName) {
        //判断statement是否为空
        if (statement == null || sqlName == null) {
            return;
        }
        String createSql = "CREATE DATABASE " + sqlName; //创建
        try {
            int isSuccessful = statement.executeUpdate(createSql);
            System.out.println("isSuccessful" + isSuccessful);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //删除数据库
    public static void dropDataBase(Statement statement, String sqlName) {
        //判断操作对象是否为空
        if (statement == null || sqlName == null) {
            return;
        }
        try {
            String dropDataBase = "drop database " + sqlName;
            statement.execute(dropDataBase);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //创建表
    public static void createTable(Statement statement, String dbName, String tabName) {
        if (statement == null || tabName == null) {
            return;
        }
        try {
            String createTable = "create table " + dbName + "." + tabName + "(id integer primary key AUTO_INCREMENT not null,name varchar(50),age integer,description varchar(50))";
            int res = statement.executeUpdate(createTable);
            System.out.println("创建表语句成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //插入数据
    public static void insertSql(Statement statement, String tabName) {
        String sql = "insert into " + tabName + " values (6,'lisi',23,'study very good');";
        System.out.println("插入语句:" + sql);
        try {
            int res = statement.executeUpdate(sql);
            System.out.println("insert into ok");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //查询
    public static void selectSql(Statement statement, String tabName) {
        String sql = "select * from " + tabName;
        try {
            //结果集
            ResultSet resultSet = statement.executeQuery(sql);
            //
            //resultSet.beforeFirst();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String des = resultSet.getString("description");
                System.out.println(id + "\t" + name + "\t" + age + "\t" + des);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //修改表
    public static void updateSql(Statement statement, String tabName) {

        try {
            String sql = "update " + tabName + " set name ='zwj' where id in (2,5)"; //这个是修改id为2到5的 name值为张无忌
            System.out.println("修改语句：" + sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //删除记录
    public static void dropSql(Statement statement, String tabName) {
        try {
            String sql = "delete from " + tabName + " where id =6";
            boolean isRes = statement.execute(sql);
            System.out.println("删除数据" + isRes);
        } catch (Exception e) {
            System.out.println("删除错误，抛出异常" + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
