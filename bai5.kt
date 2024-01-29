package com.example.myapplication

import kotlin.math.sqrt

fun main() {
    println("Nhập độ dài các cạnh của tam giác:")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    if (isTriangle(a, b, c)) {
        val triangleType = triangleType(a, b, c)
        val perimeter = perimeter(a, b, c)
        val area = area(a, b, c)
        println("Ba cạnh nhập vào tạo thành một tam giác $triangleType")
        println("Chu vi của tam giác là: $perimeter")
        println("Diện tích của tam giác là: $area")
    } else {
        println("Ba cạnh nhập vào không tạo thành một tam giác.")
    }

    println("Nhập bán kính của hình tròn:")
    val radius = readLine()!!.toDouble()
    val circlePerimeter = circlePerimeter(radius)
    val circleArea = circleArea(radius)
    println("Chu vi của hình tròn là: $circlePerimeter")
    println("Diện tích của hình tròn là: $circleArea")
}

fun isTriangle(a: Double, b: Double, c: Double): Boolean {
    return a + b > c && a + c > b && b + c > a
}

fun triangleType(a: Double, b: Double, c: Double): String {
    return when {
        a == b && b == c -> "đều"
        a == b || a == c || b == c -> "cân"
        else -> "thường"
    }
}

fun perimeter(a: Double, b: Double, c: Double): Double {
    return a + b + c
}

fun area(a: Double, b: Double, c: Double): Double {
    val s = perimeter(a, b, c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
}

fun circlePerimeter(radius: Double): Double {
    return 2 * Math.PI * radius
}

fun circleArea(radius: Double): Double {
    return Math.PI * radius * radius
}
