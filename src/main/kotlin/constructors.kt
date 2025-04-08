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

//class Phone
//{
//    var brand:String="Unknown"
//    var model:String="Unknown"
//    var price:Double=0.0
//    constructor(brand:String)
//    {
//        this.brand=brand
//    }
//    constructor(brand: String,model:String,price:Double)
//    {
//        this.brand=brand
//        this.model=model
//        this.price=price
//    }
//    fun Phonedetails()
//    {
//        println("Brand: $brand")
//        println("Model: $model")
//        println("Price: $price")
//    }
//}
//
//fun main()
//{
//    val phone1=Phone(brand = "Samsung")
//    val phone2=Phone(brand="Google", model ="Pixel 9A", price = 5200.00)
//    phone1.Phonedetails()
//    phone2.Phonedetails()
//}

//Question##04

//✅ Question 04: Create a UserProfile class with optional social info
//🧠 Requirements:
//Class Name: UserProfile
//
//Properties:
//
//username: String
//
//email: String
//
//bio: String
//
//isVerified: Boolean
//
//Constructors:
//First constructor: accepts only username and email
//
//Second constructor: accepts all four properties
//
//Function:
//profileSummary()
//👉 Print something like:
//"Username: john_doe, Email: john@example.com, Bio: Hello Kotlin!, Verified: true"
//
//In main():
//Create one user with only username and email
//
//Create another user with all properties
//
//Call profileSummary() on both
//

//class UserProfile
//{
//    var username:String="unknown"
//    var email:String="unknown"
//    var bio :String="unknown"
//    var isVerified:Boolean=true
//
//    constructor(username:String,email:String)
//    {
//        this.username=username
//        this.email=email
//    }
//    constructor(username: String,email: String,bio:String,isVerified:Boolean)
//    {
//        this.username=username
//        this.email=email
//        this.bio=bio
//        this.isVerified=isVerified
//    }
//    fun profileSummery()
//    {
//        println("Username: $username")
//        println("Email: $email")
//        println("Bio: $bio")
//        println("Is Verified: $isVerified")
//    }
//
//}
//
//fun main()
//{
//    val userprofile1=UserProfile(username = "talhashakeel123", email = "talhshakeeel123@gmail.com")
//
//    val userprofile2=UserProfile(username = "talhashakeel123", email = "talhshakeeel123@gmail.com", bio = "Hello Kotlin!", isVerified = true)
//
//    userprofile1.profileSummery()
//    userprofile2.profileSummery()
//}

//----------------------------------INIT-------------------------------
//class Temperature {
//    var celsius: Double = 0.0
//        get() {
//            println("Getting temperature...")
//            return field
//        }
//        set(value) {
//            println("Setting temperature...")
//            field = value
//        }
//}
//
//fun main() {
//    val temp = Temperature()
//    temp.celsius = 36.6  // Custom setter runs
//    println(temp.celsius)  // Custom getter runs
//}

class Temperature{
    var celsius:Double=0.0
        get(){
            println("Getting temperature")
            return field
        }
        set(value) {
            println("Setting temperature...")
            field=value
        }
    fun main()
    {
        val temp=Temperature()
        temp.celsius=36.6
    }

}