import exceptions.InvalidCapacityException;
import exceptions.InvalidPinException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GunTest {
    @Test
    public void test_thatGunIsEmpty() {
        Gun gun = new Gun("1234", 10);
        assertEquals(0, gun.checkBullets("1234"));
    }

    @Test
    public void test_putFiveBullets_numberOfBulletsIsFive() {
        Gun gun = new Gun("1234", 10);
        gun.load(5, "1234");
        assertEquals(5, gun.checkBullets("1234"));
    }

    @Test
    public void test_pinValidation() {
        Gun gun = new Gun("1234", 10);
        //gun.validatePin("3214");
        assertThrows(InvalidPinException.class, () -> gun.validatePin("3241"));
    }
        @Test
    public void throwException_whenITryToLoadMoreThanCapacity() {
            Gun gun = new Gun("1234", 10);
            assertThrows(InvalidCapacityException.class, () -> gun.validateCapacity(15));
        }
        @Test
    public void test_thatICanShootWithTheGun(){
        Gun gun = new Gun("1234", 10);
        gun.load(5, "1234");
        gun.shoot("1234");
        assertEquals(4, gun.checkBullets("1234"));
    }
    @Test
    public void test_thatICanShootFiveTimes(){
        Gun gun = new Gun("1234", 10);
        gun.load(8, "1234");
        gun.shoot("1234");
        gun.shoot("1234");
        gun.shoot("1234");
        gun.shoot("1234");
        gun.shoot("1234");
        assertEquals(3, gun.checkBullets("1234"));
    }
    @Test
    public void loadTenBullets_bulletIsTen(){
        Gun gun = new Gun("1234", 10);
        gun.load(5, "1234");
        assertEquals(5,gun.checkBullets("1234"));
    }
    @Test
    public void throwsExceptionWhenTryingToShootWithWrongPin(){
        Gun gun = new Gun("1234", 10);
        gun.load(6, "1234");
        assertThrows(InvalidPinException.class, ()-> gun.shoot("7654"));
    }
}
