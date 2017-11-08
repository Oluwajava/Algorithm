package com.company.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayokun on 10/31/2017.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();

        for(Person person: persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
