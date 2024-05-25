package com.ashokit.collections;

import java.util.Comparator;

public class EmployeeIdNameCompartor implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {

		int empNameCompare = o1.getEmpName().compareTo(o2.getEmpName());
		int empIdCompare = o1.getEmpId() - o2.getEmpId();

		// 2nd level comparison
		return (empNameCompare == 0) ? empIdCompare : empNameCompare;
	}
}