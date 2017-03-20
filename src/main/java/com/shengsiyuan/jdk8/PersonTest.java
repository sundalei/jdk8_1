package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by sundalei on 17-2-20.
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> persons = Arrays.asList(person1, person2, person3);

        PersonTest test = new PersonTest();
//        List<Person> personResults = test.getPersonsByUsername("zhangsan", persons);
//        personResults.forEach(person -> System.out.println(person.getUsername()));
//
//        personResults = test.getPersonsByAge(25, persons);
//        personResults.forEach(person -> System.out.println(person.getAge()));

        List<Person> personResults = test.getPersonsByAge2(20, persons, (age, personList) -> {
            return personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
        });
        personResults.forEach(person -> System.out.println(person.getAge()));

        List<Person> personResults2 = test.getPersonsByAge2(20, persons, (age, personList) -> {
            return personList.stream().filter(person -> person.getAge() <= age).collect(Collectors.toList());
        });
        personResults2.forEach(person -> System.out.println(person.getAge()));
    }

    public List<Person> getPersonsByUsername(String username, List<Person> persons) {
        return persons.stream().filter(person -> person.getUsername().equals(username))
                .collect(Collectors.toList());
    }

    public List<Person> getPersonsByAge(int age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) -> {
            return personList.stream().filter(person -> person.getAge() > ageOfPerson)
                    .collect(Collectors.toList());
        };

        return biFunction.apply(age, persons);
    }

    public List<Person> getPersonsByAge2(int age, List<Person> persons, BiFunction<Integer, List<Person>
            , List<Person>> biFunction) {
        return biFunction.apply(age, persons);
    }
}
