import exceptions.InvalidCapacityException;
import exceptions.InvalidPinException;

public class Gun {
    private int capacity;
    private String pin;
    private int bullets = 0;

    public Gun(String pin, int capacity){
        this.capacity = capacity;
        this.pin = pin;
    }

    public void load(int numberOfBullets, String pin) {
        validatePin(pin);
        validateCapacity(capacity);
        bullets += numberOfBullets;
    }


    public void validateCapacity(int capacity) {
        if (capacity == this.capacity) {
        } else {
            throw new InvalidCapacityException("Invalid capacity");

        }
    }
        public void validatePin(String pin){
        if(pin == this.pin) {
        }else{
            throw new InvalidPinException("Invalid pin");
        }
    }
    public int checkBullets(String pin){
        validatePin(pin);


        return bullets;
    }

public void shoot(String pin){
    validatePin(pin);
    if(bullets > 0) {
        bullets -= 1;
    }

}
}

