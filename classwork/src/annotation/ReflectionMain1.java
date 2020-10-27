package annotation;

import homework_6.Person;

import java.lang.annotation.Annotation;

public class ReflectionMain1 {
    public static void main(String[] args) {
        Person person = new Person("Name", "pass");
        Class<? extends Person> aClass = person.getClass();
        Annotation[] annotations = aClass.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof Version) {
                Version ver = (Version) annotation;
                System.out.println(ver.info());
            }
        }

        System.out.println(person.getPassword());
    }
}