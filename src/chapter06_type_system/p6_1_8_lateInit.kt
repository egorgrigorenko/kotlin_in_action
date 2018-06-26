package chapter06_type_system

// 1
//class MyService {
//    fun performAction() : String = "foo"
//}
//
//class MyTest {
//    private var myService: MyService? = null
//
//    fun setUp() {
//        myService = MyService()
//    }
//
//    fun testAction() {
//        myService!!.performAction()
//    }
//}

class MyService {
    fun performAction() : String = "foo"
}

class MyTest {
    private lateinit var myService: MyService

    fun setUp() {
        myService = MyService()
    }

    fun testAction() {
        myService.performAction()
    }
}