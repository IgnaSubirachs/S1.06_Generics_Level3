public class Generic {


    public <T extends Phone> void phoneMethod(T phone) {
        phone.call();


    }

    public <T extends Smartphone> void smartphoneMethod(T smartphone) {
        smartphone.call();
        smartphone.takePhoto();
    }
}
