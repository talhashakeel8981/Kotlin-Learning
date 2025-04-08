//class Person(val name:String,val age:Int){
//    fun details()
//    {
//        println("Name: $name")
//        println("Age: $age")
//    }
//}
//fun main()
//{
//    var person1=Person("talha",12)
//    person1.details()
//
//
//}


//-------------------Question #02 ----------------------
//🔸 Create a class Car
//🔸 Properties: brand: String, year: Int
//🔸 Use primary constructor to initialize
//🔸 Method: carInfo() — Print "Brand: Toyota, Year: 2020"
//🔸 Create an object of class in main() and call the method



//class Car(val brand:String,val year:Int)
//{
//    fun carInfo()
//    {
//        println("Brand: $brand")
//        println("Year: $year")
//
//    }
//}
//
//fun main()
//{
//  var car1=Car("Toyota",2022)
//   car1.carInfo()
//}




//🔹 Question 1: Student (Updated)
//Create a class Student with:
//
//name: String
//
//rollNo: Int
//
//grade: Char
//
//isEnrolled: Boolean
//
//Create a function studentInfo() that prints:


//class Student(val name:String,val rollNo:Int,val grade:Char,val isEnrolled:Boolean)
//{
//    fun studentInfo()
//    {
//        println("Name: $name")
//        println("Roll Number: $rollNo")
//        println("Grade: $grade")
//        println("isEnrolled: $isEnrolled")
//    }
//}
//
//fun main()
//{
//    var student1=Student("Talha Shakeel", rollNo = 11868, grade = 'D',isEnrolled = true)
//    student1.studentInfo()
//}


//--------------Secondary Constructor
//===============================Question#01=================
//class Student
//{
//    var name:String=""
//    var age:Int=0
//
//    constructor(name: String)
//    {
//        this.name=name
//
//    }
//    constructor(name: String,age: Int)
//    {
//        this.name=name
//        this.age=age
//    }
//    fun show()
//    {
//        println("$name,$age")
//    }
//}
//
//fun main()
//{
//    val student1=Student("talha")
//    val student2=Student(name = "ali", age = 24)
//    student1.show()
//    student2.show()
//}






//========================Question 02===========================

//
//✅ Question: Create a Book class with secondary constructors
//Requirements:
//Create a class Book
//
//Add properties:
//
//title: String
//
//author: String
//
//price: Double
//
//Add two secondary constructors:
//
//First: accepts only title
//
//Second: accepts title, author, and price
//
//Add a method bookInfo() to print the book details.
//
//In main(), create two book objects using both constructors and call bookInfo() on both.


//class Book
//{
//    var title:String=""
//    var author:String=""
//    var price:Int=0
//
//    constructor(title:String)
//    {
//        this.title=title
//
//    }
//    constructor(title:String,author:String,price:Int)
//    {
//        this.title=title
//        this.author=author
//        this.price=price
//    }
//    fun bookInfo()
//    {
//        println("Book Title: $title")
//        println("Author Name: $author")
//        println("Price: $price")
//    }
//}
//
//fun main()
//{
//    val book1=Book(title = "Bikhari")
//    val book2=Book(title = "Muslim", author = "Imam Muslim", price = 95000)
//
//    book1.bookInfo()
//    book2.bookInfo()
//}


//===================================Question 03===================================

//✅ Question: Create a Phone class using secondary constructors
//Requirements:
//Create a class Phone
//
//Add properties:
//
//brand: String
//
//model: String
//
//price: Double
//
//Add two secondary constructors:
//
//First: accepts only brand
//
//Second: accepts all three: brand, model, price
//
//Add a method phoneDetails() that prints the phone info
//
//In main():
//
//Create two phone objects using both constructors
//
//Call phoneDetails() for both

fun main()