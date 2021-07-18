import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;

@Feature("qweqwasd")
@Story("asdasdasd")
public class Test123 extends Steps{
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
