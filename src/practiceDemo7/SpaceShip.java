package practiceDemo7;

/**
 * description:太空船子类
 */
public class SpaceShip extends SpaceShipControls {

    private String name;
    public SpaceShip(String name){
         this.name=name;
    }

    public static void  main(String ...args){
         SpaceShip protector=new SpaceShip("NESA Protector");
         protector.forward(100);
    }
}
