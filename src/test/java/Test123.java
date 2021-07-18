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

    @AfterClass
    public void aftClass() {

    }

    @Test()
    public void qwe() {
        plus(2, 5);
    }

    @Issues({
            @Issue("test"),
            @Issue("huest"),
    })
    @Description("qrwrgjhqgbfwrwfkjhqkj")
    @Test
    public void fsdvsdv() {
        plus(3,9);
    }

    @Test(description = "super test")
    public void test123() {
        assertThat("test", 2 + 2, Matchers.equalTo(4));
    }

    @Test(enabled = false)
    public void qwed() {
        assertThat("test", 2 + 2, Matchers.equalTo(42));
    }
}
