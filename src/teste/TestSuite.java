package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAdapter.class, TestAngajat.class, TestBuilder.class, TestClient.class, TestCompanie.class,
		TestComposite.class, TestFactory.class, TestMailObserver.class, TestServicii.class, TestSMSObserver.class })
public class TestSuite {

}
