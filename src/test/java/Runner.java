import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * Created by my on 05.05.2015.
 */
public class Runner extends BlockJUnit4ClassRunner {
    private TestRunListener runListener;
    public Runner(Class<TestRunListener> clazz) throws InitializationError {
        super(clazz);
        runListener = new TestRunListener();
    }
    public void run(RunNotifier notifier) {
        notifier.addListener(runListener);
        super.run(notifier);
    }
}



