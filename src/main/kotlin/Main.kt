package com

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var count = 1;

    println("== 명언 앱 ==")
    while (true) {
        print("명령) ")
        var command = readLine()
        when (command) {
            "등록" -> {
                print("명언 : ")
                var wiseSaying = readLine()
                print("작가 : ")
                var author = readLine()
                println("${count}번 명언이 등록되었습니다.")
                count++
            }
            else -> break
        }
    }
    println("명령) 종료")
}