package company;

import org.junit.Assert;
import org.junit.Test;

public class Tests extends Main {
    @Test
    public void TestMarina(){
       Course2 Marina = new Course2();
       Assert.assertEquals("2019-04-09",Marina.Data());
    }
}
