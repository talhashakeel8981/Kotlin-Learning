//-------------------Question#01
//fun main()
//{
//    val student=Student()
//    student.age=24
//    student.name="shakeel"
//    student.introduce()
//
//}
//class Student()
//{
//    var name:String="talha"
//    var age :Int=23
//
//    fun introduce()
//    {
//        println("Hi, my name is $name and I am $age years old.")
//    }
//}

//---------------------Question #02---------------------

//fun main()
//{
//    val mobile=Mobile()
//    mobile.details()
//
//    val book=Book()
//    book.info()
//}
//class Mobile()
//{
//    var brandname:String="Samsung"
//    var price:Int=50000
//
//    fun details()
//    {
//        println("Brand Name Is $brandname and Price Is $price")
//    }
//
//}
//class Book()
//{
//    var title:String="Last Sermon"
//    var author:String="Harry"
//    fun info()
//    {
//        println("Book title is $title and the Author is $author")
//    }
//}

//---------------------Question #03---------------------

//Create a class Laptop with the following:
//
//brand (String)
//
//ram (Int)
//
//price (Double)
//
//Method: specs()
//👉 Print: "Brand: HP, RAM: 8GB, Price: 65999.99"

//---------------------Question #04---------------------
//class Laptop()
//{
//    var brand:String="Lenovo"
//    var ram:Int=16
//    var price:Double=65999.99
//
//    fun specs(){
//        println("Brand Name: $brand")
//        println("RAM: $ram")
//        println("Price: $price")
//    }
//
//}
//
//fun main()
//{
//    val laptop=Laptop()
//    laptop.specs()
//}



//Q2. Class: Person
//Task:
//
//Create a class Person with:
//
//firstName (String)
//
//lastName (String)
//
//age (Int)
//
//Method: greet()
//👉 Print: "Hello, I’m Ali Khan and I’m 30 years old"

//💡-------------------- Q3. Class: BankAccount--------------------
//Task:
//
//Create a class BankAccount with:
//
//accountHolder (String)
//
//balance (Double)
//
//Method: accountInfo()
//👉 Print: "Account Holder: Ahmed, Balance: 5000.75"


fun main()
{
   val bankAccount=BankAccount()
    bankAccount.accountInfo()
}

class BankAccount()
{
    var accountHolder:String="AHMED"
    var balance:Double=5000.75
    fun accountInfo()
    {
        println("Account Holder: $accountHolder")
        println("Balance: $balance")
    }
}