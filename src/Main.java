public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Generic generic = new Generic();

        generic.phoneMethod(smartphone);
        generic.smartphoneMethod(smartphone);
    }
}
