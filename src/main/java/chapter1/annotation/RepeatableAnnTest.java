package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: RepeatableAnnTest
 * Date: 2017-03-13
 * Time: 오전 9:23
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@ChangeLog(date = "02/01/2014", comments = "Declared the class")
@ChangeLog(date = "02/22/2014", comments = "Added the main() method")
public class RepeatableAnnTest {
    public static void main(String[] args) {
        Class<RepeatableAnnTest> mainClass = RepeatableAnnTest.class;
        Class<ChangeLog> annClass = ChangeLog.class;
// Access annotations using the ChangeLog type
        System.out.println("Using the ChangeLog type...");
        ChangeLog[] annList = mainClass.getAnnotationsByType(ChangeLog.class);
        for (ChangeLog log : annList) {
            System.out.println("Date=" + log.date() +
                    ", Comments=" + log.comments());
        }
// Access annotations using the ChangeLogs containing annotation type
        System.out.println("\nUsing the ChangeLogs type...");
        Class<ChangeLogs> containingAnnClass = ChangeLogs.class;
        ChangeLogs logs = mainClass.getAnnotation(containingAnnClass);
        for (ChangeLog log : logs.value()) {
            System.out.println("Date=" + log.date() +
                    ", Comments=" + log.comments());
        }
    }
}
