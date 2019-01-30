package practiceDemo7;

/**
 * description:这是一个代理类 其实是它的内部通过private创建了一个真实的实例 只有这个代理对象才可以在内部操作
 *
 */
public class SpaceShipDelegation {

    private String name;
    private SpaceShipControls controls=new SpaceShipControls();

    //带name参数的构造器
    public SpaceShipDelegation(String name){
        this.name=name;
    }
    //Delegated methods
    public void back(int velocity){
        //调用back对象
        controls.back(velocity);
    }

    public void down(int velocity){
        controls.down(velocity);
    }
    public void forward(int velocity){
        controls.forward(velocity);
    }

    public void left(int velocity){
         controls.left(velocity);
    }

    public void right(int velocity){
        controls.right(velocity);
    }

    public void turboBoost(){
        controls.turnBoost();
    }

    public static void main(String ...args){
        SpaceShipDelegation delegation=new SpaceShipDelegation("delegation");
        delegation.forward(100);
    }
}
