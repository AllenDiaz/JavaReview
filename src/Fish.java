public class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("Fish is running away");
    }

    @Override
    public void hunt(){
        System.out.println("Fish is hunting smaller fish");
    }

}
