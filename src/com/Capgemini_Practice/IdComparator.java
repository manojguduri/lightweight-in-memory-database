package com.Capgemini_Practice;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getEmpID() > o2.getEmpID()){
            return 1;
        }else return 0;
    }
}
