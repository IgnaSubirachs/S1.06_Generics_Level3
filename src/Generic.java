public class Generic {


    public <T extends Phone> void phoneMethod(T phone) {
        phone.call();
        // We cannot call takePhoto() here because T is only known as a Phone,
        // and Phone interface does not have takePhoto()

    }

    public <T extends Smartphone> void smartphoneMethod(T smartphone) {
        smartphone.call();
        smartphone.takePhoto();
    }
}
