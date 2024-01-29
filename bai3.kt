package com.example.myapplication

fun main() {
    print("Nhập một số nguyên: ")
    val n = readLine()!!.toInt()
    val averagePrimePerfect = calculateAveragePrimePerfect(n)
    println("Tổng bình quân các số nguyên tố và số hoàn hảo từ 1 đến $n là: $averagePrimePerfect")
}

fun calculateAveragePrimePerfect(n: Int): Double {
    val primeSum = sumPrimes(n)
    val perfectSum = sumPerfects(n)
    val totalCount = countPrimes(n) + countPerfects(n)
    return if (totalCount != 0) (primeSum + perfectSum).toDouble() / totalCount else 0.0
}

fun sumPrimes(n: Int): Int {
    var sum = 0
    for (i in 2..n) {
        if (isPrime(i)) {
            sum += i
        }
    }
    return sum
}

fun sumPerfects(n: Int): Int {
    var sum = 0
    for (i in 2..n) {
        if (isPerfect(i)) {
            sum += i
        }
    }
    return sum
}

fun countPrimes(n: Int): Int {
    var count = 0
    for (i in 2..n) {
        if (isPrime(i)) {
            count++
        }
    }
    return count
}

fun countPerfects(n: Int): Int {
    var count = 0
    for (i in 2..n) {
        if (isPerfect(i)) {
            count++
        }
    }
    return count
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2 until num) {
        if (num % i == 0) return false
    }
    return true
}

fun isPerfect(num: Int): Boolean {
    var sum = 1
    var i = 2
    while (i * i <= num) {
        if (num % i == 0) {
            sum += i
            if (i * i != num) sum += num / i
        }
        i++
    }
    return sum == num && num != 1
}
