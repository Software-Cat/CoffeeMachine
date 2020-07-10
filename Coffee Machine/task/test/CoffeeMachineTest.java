import machine.CoffeeMachine;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.testcase.TestCase;

import java.util.ArrayList;
import java.util.List;


class TestClue {
    int water;
    int milk;
    int beans;
    int cups;
    int money;
    String feedback;
    TestClue(int w, int m, int b, int c, int mo, String feedback) {
        water = w;
        milk = m;
        beans = b;
        cups = c;
        money = mo;
        this.feedback = feedback;
    }
}

public class CoffeeMachineTest extends StageTest<TestClue> {

    public CoffeeMachineTest() {
        super(CoffeeMachine.class);
    }

    @Override
    public List<TestCase<TestClue>> generate() {
        return List.of(
            new TestCase<TestClue>()
                .setAttach(new TestClue(
                    700 - 400,
                    390 - 540,
                    80 - 120 ,
                    7 - 9,
                    0 - 550,
                    "This test is exactly " +
                        "like in the example - try to run it by yourself"))
                .setInput(
                    "remaining\n" +
                        "buy\n" +
                        "2\n" +
                        "buy\n" +
                        "2\n" +
                        "fill\n" +
                        "1000\n" +
                        "0\n" +
                        "0\n" +
                        "0\n" +
                        "buy\n" +
                        "2\n" +
                        "take\n" +
                        "remaining\n" +
                        "exit\n")
        );
    }

    @Override
    public CheckResult check(String reply, TestClue clue) {
        return new CheckResult(true, clue.feedback);
    }
}
