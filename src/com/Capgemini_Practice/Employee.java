package com.Capgemini_Practice;

public class Employee implements Comparable<Employee>{
    private int EmpID;
    private String EmpName;

    public Employee(int EmpID, String EmpName){
        super();
        this.EmpID = EmpID;
        this.EmpName = EmpName;
    }

    public int getEmpID() {
        return EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    @Override
    public int compareTo(Employee o) {
        if(EmpID > o.EmpID){
            return 1;
        }else return -1;
    }
}
