package com.company.pattern.criteria;

import java.util.List;

/**
 * Created by Mayokun on 10/31/2017.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
