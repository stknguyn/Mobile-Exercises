package com.example.myapplication

fun tinhTong(x: Int): Int {
    var tong: Int = 0
    var i: Int = 0
    while (i < x) {
        i++
        tong += i
    }
    return tong
}

fun main(args: Array<String>) {
    print("Nhap mot so n tu ban phim: ")
    var x:Int = readLine()!!.toIntOrNull()?:0
    var tong:Int =  tinhTong(x)
    println()
    print("Tong tu 1 den n la: $tong")
}