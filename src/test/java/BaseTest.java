import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;
@Slf4j
public class BaseTest {
    @BeforeAll
    static void beforeEach(){}
    static List<Executable> executableList=new ArrayList<>();
    @AfterAll
    static void after(){
        Assertions.assertAll(executableList.stream());
    }

}
