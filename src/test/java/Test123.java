import io.qameta.allure.*;
import org.hamcrest.Matchers;
import org.testng.annotations.*;

import static org.hamcrest.MatcherAssert.assertThat;

@Feature("qweqwasd")
@Story("asdasdasd")
public class Test123 extends Steps{
    @BeforeClass
    public void befClass() {

    }

    @BeforeMethod
    public void befMeth() {

    }

    @BeforeTest
    public void befTest() {

    }

    @AfterClass
    public void aftClass() {

    }

    @AfterMethod
    public void aftMeth() {

    }

    @AfterTest
    public void aftTest() {

    }

    @Issues({
            @Issue("test"),
            @Issue("huest"),
    })
    @Description
    @Test
    public void qwe() {
        plus(2, 5);
    }

    @Test
    public void fsdvsdv() {
        assertThat("test", 2 + 2, Matchers.equalTo(42));
    }

    @Test
    public void fgrth45ge() {
        assertThat("test", 2 + 2, Matchers.equalTo(4));
    }
}
