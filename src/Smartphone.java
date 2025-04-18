public class Smartphone implements Phone{

    @Override
    public void call() {
        System.out.println("Calling Smartphone");
    }
    public void takePhoto(){
        System.out.println("Taking Picture");
    }
}
