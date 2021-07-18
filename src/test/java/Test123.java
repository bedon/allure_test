import io.qameta.allure.Feature;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;

@Feature("qweqwasd")
public class Test123 {
    @Test
    public void qwe() {
        assertThat("test", 2 + 2, Matchers.equalTo(42));
    }
}
