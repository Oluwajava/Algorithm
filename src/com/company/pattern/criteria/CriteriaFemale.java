package com.company.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayokun on 10/31/2017.
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();

        for(Person person: persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
