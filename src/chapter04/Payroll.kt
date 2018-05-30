package chapter04

import chapter01.Person

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees)
            ;
    }
}

fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person("vasya"))
    Payroll.calculateSalary()
}