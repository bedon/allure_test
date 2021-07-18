import io.qameta.allure.Step;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class Steps {
    @Step("hohoho {0}, {1}")
    public static void plus(int i, int b) {
        int c = i + b;
        assertThat("test", c, Matchers.equalTo(42));
    }
}
