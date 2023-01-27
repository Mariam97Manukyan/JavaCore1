package homeworks.homework10.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker("Hello (from) [java}");
        braceChecker.check();
        BraceChecker braceChecker1 = new BraceChecker("Hello {from) [Java]");
        braceChecker1.check();
        BraceChecker braceChecker2= new BraceChecker("Hello (from) [Java]");
        braceChecker2.check();
    }

}
