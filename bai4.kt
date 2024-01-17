/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
fun main() {
    print("Nhap mot so tu nhien n:")
    var n = readLine()!!.toInt()
    var result:Int = 1
    for(i in n downTo 2) {
      result*=i
    }
    print("Ket qua la: $result")
}
