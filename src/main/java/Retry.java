import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Retry implements IAnnotationTransformer {

    public void disabler(Method method, ITestResult result) {
        if (method.getName().equals("qwe")) {
            result.setStatus(ITestResult.SKIP);
        }
    }

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if (testMethod.getName().equals("qwe")) {
            annotation.setEnabled(false);
        }
    }
}
