import java.util.*

// (( Hello_11.kt 복사. 0이 필요한 코드일 때를 위해 null 쓰기 ))

/**
 * 숫자를 다루는 코드에서
 * 어떤 값이 0이 아닌 경우에만 처리하는 코드가 있고
 * 0인 경우에도 처리해야 코드가 있다
 *  이때는 변수에 담긴 값이 null인가를 검사하여 코드를 실행할지 말지를 결정해야 한다
 *  이때는 변수에 null을 허용해야 한다
 *  변수:타입?=null 처럼 null로 초기화된 변수를 선언한다
 */
fun main() {
    print("정수형 숫자 1을 입력하세요")
    var num1:String = scan1.nextLine()

    print("정수형 숫자 2를 입력하세요")
    var num2:String = scan1.nextLine()

    // * 람다코드와 유사한 코드. 람다기때문에 return문 쓰지 않음
    // * 아까 if문을 삼항연산자처럼 사용했듯, try문도 삼항연산자처럼 사용됨
    // * 가장 코틀린다운 코드
    /**
     * 3항 연산 try
     * Integer.valueOf(num1) 실행이 정상적으로 종료되면
     *      연산 결과가 intNum1에 담기고
     * Exception이 발생하면
     *      println()이 실행되어 메시지를 출력한 후
     *      null 값이 intNum1에 담기게 된다
     */
    var intNum1:Int? = try {
        Integer.valueOf(num1) // return문이 있는 것처럼 행동
        // * 결과가 정상적으로 만들어지면 intNum1에 저장해라
    } catch (e:NumberFormatException) {
        println("숫자 1은 정수형만 입력하세요! 입력한 숫자 : $num1")
        null
        // * 문제가 생기면 ~
    }

    var intNum2:Int? = null;
    try {
        intNum2 = Integer.parseInt(num2)
    } catch (e:NumberFormatException) {
        println("숫자 2는 정수형만 입력하세요! 입력한 숫자 : $num2")
    }

    if(intNum1 != null && intNum2 != null) {
        println("$num1 + $num2 = ${intNum1 + intNum2}")
        println("$num1 - $num2 = ${intNum1 - intNum2}")
        println("$num1 * $num2 = ${intNum1 * intNum2}")
        println("$num1 / $num2 = ${intNum1 / intNum2}")
    } else {
        println("숫자를 잘못 입력하여 연산 결과를 표시할 수 없음")
    }


}