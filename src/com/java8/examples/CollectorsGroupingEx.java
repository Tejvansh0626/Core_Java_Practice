package com.java8.examples;

import com.data_base.Employee;
import com.data_base.Person;
import com.data_base.PersonDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingEx {
  static  List<Person> persons= PersonDatabase.getPersons();

  /*
  get the employees from the Dept wise
   */
    public static  Map<String, List<Person>> getGenderWise(){
      Map<String, List<Person>> gendWise= persons.stream().collect(Collectors.groupingBy(Person::gender));
      return  gendWise;
    }
}
