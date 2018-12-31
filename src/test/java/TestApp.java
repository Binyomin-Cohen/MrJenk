import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

public class TestApp {

    @Test
    public void testAddThem() {
        int result = App.addThem(5, 8);
        Assert.assertEquals(13, result, 0.1);
    }
}
