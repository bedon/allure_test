import io.qameta.allure.Step;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class Steps {
    @Step("hohoho {0}, {1}")
    public static void plus(int i, int b) {
        int c = i + b;
        substep123();
        substep(c);
    }

    @Step("su step")
    public static void substep(int i) {
        assertThat("test", i, Matchers.equalTo(42));
    }

    @Step("su step")
    public static void substep123() {
        assertThat("test", 42, Matchers.equalTo(42));
    }
}
