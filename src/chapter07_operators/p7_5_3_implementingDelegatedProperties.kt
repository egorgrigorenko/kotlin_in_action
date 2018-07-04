package chapter07_operators

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

// 1, 2, 3, 4
open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

// 1
//class Person3(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
//    var age: Int = age
//        set(newValue) {
//            val oldValue = field
//            field = newValue
//            changeSupport.firePropertyChange("age", oldValue, newValue)
//        }
//
//    var salary: Int = salary
//        set(newValue) {
//            val oldValue = field
//            field = newValue
//            changeSupport.firePropertyChange("salary", oldValue, newValue)
//        }
//}

// 2
//class ObservableProperty(val propName: String, var propValue: Int,
//                         val changeSupport: PropertyChangeSupport) {
//    fun getValue() : Int = propValue
//    fun setValue(newValue: Int) {
//        val oldValue = propValue
//        propValue = newValue
//        changeSupport.firePropertyChange(propName, oldValue, newValue)
//    }
//}
//
//class Person3(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
//    val _age = ObservableProperty("age", age, changeSupport)
//    var age : Int
//        get() = _age.getValue()
//        set(value) { _age.setValue(value) }
//
//    val _salary = ObservableProperty("salary", salary, changeSupport)
//    var salary : Int
//        get() = _salary.getValue()
//        set(value) { _salary.setValue(value) }
//}

// 3
//class ObservableProperty(var propValue: Int, val changeSupport: PropertyChangeSupport) {
//    operator fun getValue(p: Person3, prop: KProperty<*>) : Int = propValue
//    operator fun setValue(p: Person3, prop: KProperty<*>, newValue: Int) {
//        val oldValue = propValue
//        propValue = newValue
//        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
//    }
//}
//
//class Person3(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
//    var age: Int by ObservableProperty(age, changeSupport)
//    var salary: Int by ObservableProperty(salary, changeSupport)
//}

// 4
class Person3(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    private val observer = {
        prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }

    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
}

fun main(args: Array<String>) {
    val p = Person3("Dmitry", 34, 2000)
    p.addPropertyChangeListener(
            PropertyChangeListener { event ->
                println("Property ${event.propertyName} changed " +
                        "from ${event.oldValue} to ${event.newValue}")
            }
    )
    p.age = 35
    p.salary = 2100
}