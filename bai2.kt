/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
fun main() {
    print("Hay nhap 1 thang: ")
    var month = readLine()!!.toInt()
    when(month) {
        in 1..3 -> {
            println("Thang $month nam trong quy 1")
        }
        in 4..6 -> {
            println("Thang $month nam trong quy 2")
        }
        in 7..9 -> {
            println("Thang $month nam trong quy 3")
        }
        in 10..12 -> {
            println("Thang $month nam trong quy 4")
        }
        else -> {
            println("Nhap thang khong hop le.")
        }
    }
}