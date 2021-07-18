import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import java.lang.reflect.Method;

public class Retry {

    public void disabler(Method method, ITestResult result) {
        if (method.getName().equals("qwe")) {
            result.setStatus(ITestResult.SKIP);
        }
    }
}
