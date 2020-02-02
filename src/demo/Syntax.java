package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GYY
 * @date 2020/1/26 22:13
 */
public class Syntax {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("张三",10);
        Person person2 = new Person("李四",10);
        Person person3 = new Person("王五",10);
        Person person4 = new Person("黑八",10);
        Person person5 = new Person("市六",10);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.forEach(person -> {});
    }

    static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
