import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/**
 * Created by my on 05.05.2015.
 */
public class TestRunListener extends RunListener {
    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("���� ���������: " + description.getMethodName());
    }
    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("���� ��������: " + description.getMethodName()
                + "\n----");
    }
    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("���� �������� � �����������: "
            + failure.getException());
    }
    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("���� �����������: " + description.getMethodName()
                + "\n----");
    }
    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("���������� ���������� ������:");
        System.out.println("����� ����������: (" + result.getRunTime()
                + ") millis");
        System.out.println("���� �������� ������: " + result.getRunCount());
        System.out.println("��������� ������: " + result.getFailureCount());
        System.out.println("������������ ������: " + result.getIgnoreCount());
        System.out.println("��� ����� ��������� �������: "
                + result.wasSuccessful());
    }

}
