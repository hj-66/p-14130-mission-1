package com

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var count = 1;
    val wiseSayings: MutableList<String> = mutableListOf()
    val authors: MutableList<String> = mutableListOf()

    println("== 명언 앱 ==")
    while (true) {
        print("명령) ")
        val command = readLine()
        when (command?.split("?")[0]) {
            "등록" -> {
                print("명언 : ")
                val wiseSaying: String? = readLine()
                wiseSayings.add(wiseSaying ?: "")
                print("작가 : ")
                val author: String? = readLine()
                authors.add(author ?: "")
                println("${count}번 명언이 등록되었습니다.")
                count++
            }
            "목록" -> {
                println("번호 / 작가 / 명언")
                println("----------------------")
                wiseSayings.withIndex().reversed().forEach { (index, wiseSaying) ->
                    println("${index + 1} / ${authors.get(index)} / $wiseSaying")
                }
            }
            "삭제" -> {
                val deleteIndex: Int? = command.split("?id=")[1].toIntOrNull()
                if (deleteIndex in wiseSayings.indices) {
                    wiseSayings.removeAt(deleteIndex ?: 0)
                    authors.removeAt(deleteIndex ?: 0)
                    println("${deleteIndex}번 명언이 삭제되었습니다.")
                } else {
                    println("${deleteIndex}번 명언은 존재하지 않습니다.")
                }
            }
            "종료" -> break
            else -> println("명령을 다시 입력해 주세요")
        }
    }
    println("명령) 종료")
}