import io.qameta.allure.Step;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class Steps {
    @Step("hohoho {0}, {1}")
    public static void plus(int i, int b) {
        int c = i + b;
        substep(c);
    }

    @Step("su step")
    public static void substep(int i) {
        assertThat("test", i, Matchers.equalTo(42));
    }
}
