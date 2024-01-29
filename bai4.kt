package com.example.myapplication

fun main() {
    val name: String
    val age: Int
    val gender: String
    val address: String

    println("Nhập thông tin cá nhân:")
    print("Họ và tên: ")
    name = readLine()!!
    print("Tuổi: ")
    age = readLine()!!.toInt()
    print("Giới tính: ")
    gender = readLine()!!
    print("Địa chỉ: ")
    address = readLine()!!

    printPersonalInfo(name, age, gender, address)
}

fun printPersonalInfo(name: String, age: Int, gender: String, address: String) {
    println("Thông tin cá nhân:")
    println("Họ và tên: $name")
    println("Tuổi: $age")
    println("Giới tính: $gender")
    println("Địa chỉ: $address")
}
