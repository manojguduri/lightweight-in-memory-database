package com.Capgemini_Practice;
import java.util.*;

public class OOPDemo {
    public static void main(String[] args) {
        List<Employee> newlist = new ArrayList<>();
        newlist.add(new Employee(3, "Kiran"));
        newlist.add(new Employee(1,"Manoj"));
        newlist.add(new Employee(2,"Charan"));
        Collections.sort(newlist,new NameComparator());
        Iterator<Employee> it = newlist.iterator();
        while (it.hasNext()){
            Employee emp = it.next();
            System.out.println("ID : " + emp.getEmpID()+"\nEmployee Name : "+emp.getEmpName());
        }

    }
}
