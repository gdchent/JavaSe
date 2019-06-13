package practiceDemo14;

import java.util.List;

/**
 * 接口里面的方法都是抽象方法
 */
public interface Robot {
    String name();
    String model();
    List<Operation> operations();
}
