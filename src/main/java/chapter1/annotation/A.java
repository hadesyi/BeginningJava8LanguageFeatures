package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: A
 * Date: 2017-03-10
 * Time: 오후 4:38
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Ann2(id=505)
@Ann3(id=707)
public @interface A {
    String value();
    int id() default 10;
}
