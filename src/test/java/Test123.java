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

    @DataProvider
    public Object[][] dpMethod(){
        return new Integer[][] {{40}, {4}, {5}};
    }

    @Test(dataProvider = "dpMethod")
    public void qwe12(int s, String qwqefwrgefqwa) {
        plus(s, 2);
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

    @Test
    @Flaky
    public void test123() {
        assertThat("test", 2 + 2, Matchers.equalTo(4));
    }

    @Test()
    public void qwed() {
        assertThat("test", 2 + 2, Matchers.equalTo(42));
    }
}
