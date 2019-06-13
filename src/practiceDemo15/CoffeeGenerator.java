package practiceDemo15;


import java.util.Iterator;
import java.util.Random;

/**
 * 接口泛型化实现  就是让接口带一个T类型
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterator<Coffee> {

    private Class[] types = {Latte.class, Mocha.class,Cappuccino.class,Americano.class};
    //创建了一个随机数
    public static Random random = new Random(47);
    private int size = 0;

    public CoffeeGenerator() {
    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    //因为迭代器  （die）
    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //实现迭代器接口
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        //判断当前是不是有这个元素
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        //获取下一个元素
        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        //获取迭代器
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    //main函数测试
    public static void main(String... args) {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++){
            System.out.println(coffeeGenerator.next());
        }


}
}
