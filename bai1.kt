/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
fun main() {
    println("Nhap cac so a, b, c trong phuong trinh ax^2 + bx + c = 0")
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    var c = readLine()!!.toDouble()
    if(a==0.0) {
        var x = -c/b
        println("Phuong trinh tren 1 nghiem: x= $x")
    }
    else {
        var delta:Double = b*b - 4*a*c
        if(delta < 0.0) {
            println("Phuong trinh vo nghiem");
            }
            else if (delta == 0.0) {
                var x =-b/(2*a);
                println("Phuong trinh co nghiem kep: x1=x2= $x")
            }
            else {
                var x1 = (-b + Math.sqrt(delta)) / (2*a)
                var x2 = (-b - Math.sqrt(delta)) / (2*a)
                println("Phuong trinh co nghiem kep: x1= $x1 | x2= $x2")
            }
        
    }
}
