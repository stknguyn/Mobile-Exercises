package com.example.myapplication

fun chuVi(r: Double): Double {
    return 2*Math.PI*r
}
fun dienTich(r: Double): Double {
    return Math.PI*r*r
}

fun main(args: Array<String>) {
    print("Nhap ban kinh cua hinh tron: ")
    var x:Double = readLine()!!.toDoubleOrNull()?:0.0
    var s:Double = dienTich(x)
    var p:Double = chuVi(x)
    println()
    println("Dien tich cua hinh tron la: $s")
    println("Chu vi cua hinh tron la: $p")
}