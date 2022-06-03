*************This Java Coding Repository contains below Assessment************************

Create a Employee PoJOclass using below fields

class Employee

{

int id;

String name;

int age;

String gender;

String department;

int yearOfJoining;

double salary;

}

Create employee list using the above pojo

new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));

new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));

new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));

new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));

new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0)

new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));

new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));

new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));

Write java code to Count the number of employees in each department using java 8 streams?

Write java code to List down the names of all employees in each department using java 8 streams?

Output:
Employees List
Employee [id=122, name=Paul Niksui, age=25, gender=Male, department=Sales And Marketing, yearOfJoining=2015, salary=13500.0]
Employee [id=133, name=Martin Theron, age=29, gender=Male, department=Infrastructure, yearOfJoining=2012, salary=18000.0]
Employee [id=144, name=Murali Gowda, age=28, gender=Male, department=Product Development, yearOfJoining=2014, salary=32500.0]
Employee [id=155, name=Nima Roy, age=27, gender=Female, department=HR, yearOfJoining=2013, salary=22700.0]
Employee [id=211, name=Jasna Kaur, age=27, gender=Female, department=Infrastructure, yearOfJoining=2014, salary=15700.0]
Employee [id=166, name=Iqbal Hussain, age=43, gender=Male, department=Security And Transport, yearOfJoining=2016, salary=10500.0]
Employee [id=266, name=Sanvi Pandey, age=26, gender=Female, department=Product Development, yearOfJoining=2015, salary=28900.0]
Employee [id=277, name=Anuj, age=31, gender=Male, department=Product Development, yearOfJoining=2012, salary=35700.0]
-------------------------------------------
Count number of employees in each Department
Product Development:3
Security And Transport:1
Sales And Marketing:1
Infrastructure:2
HR:1
-------------------------------------------
Product Development has employees : 
Murali Gowda
Sanvi Pandey
Anuj


Security And Transport has employees : 
Iqbal Hussain


Sales And Marketing has employees : 
Paul Niksui


Infrastructure has employees : 
Martin Theron
Jasna Kaur


HR has employees : 
Nima Roy


