package runner;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.googlecode.junittoolbox.ParallelRunner;

@RunWith(ParallelRunner.class)
public abstract class AbstractTest {

    @BeforeClass
    public static void fetcher() {}

    @Test
    public void test(){}

}