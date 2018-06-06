package chapter04

import chapter01_what_and_why.Person

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