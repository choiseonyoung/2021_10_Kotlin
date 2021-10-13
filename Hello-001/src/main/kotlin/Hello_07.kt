import java.util.*

// public 변수로 scan 선언
// type java.util.Scanner class
// 클래스를 가져와서 객체로 선언 및 생성하기
// 생성자를 new 키워드 없이 그냥 호출하여 객체 초기화 (( 코틀린에는 new 키워드가 없다 ))
val scan: Scanner = Scanner(System.`in`)

fun main() {
    print("문자열을 입력 : ")
    var input:String = scan.nextLine()

    println("입력한 문자열 : $input")

    /**
     * 키보드를 사용하여 2개의 문자열형 숫자를 입력 받고
     * 두 숫자의 사칙연산을 수행하여 console에 표시하시오
     */
    print("첫번째 숫자 입력 : ")
    var str1:String = scan.nextLine()
    print("두번째 숫자 입력 : ")
    var str2:String = scan.nextLine()

    var num1 = Integer.parseInt(str1)
    var num2 = Integer.parseInt(str2)

    var 큰수 = num1
    var 작은수 = num2
    if(num2 > num1) {
        큰수 = num2
        작은수 = num1
    }
    println("$num1 + $num2 : ${num1 + num2}")
    println("$큰수 - $작은수 : ${큰수 - 작은수}")
    println("$num1 * $num2 : ${num1 * num2}")
    println("$큰수 / $작은수 : ${큰수 / 작은수}")
}