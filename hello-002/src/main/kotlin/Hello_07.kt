import java.util.*

fun main() {
    var scan: Scanner = Scanner(System.`in`)

    /**
     * 키보드에서 정수값을 입력받아
     * 입력한 정수가 3의 배수인지를 판별하는 코드를 작성
     */
    print("정수를 입력하세요 : ")
    var strNum:String = scan.nextLine()

    var intNum:Int? = try {
        Integer.valueOf(strNum)
    } catch (e:NumberFormatException) {
        println("!!정수값!!을 입력하세요")
        null
    }

    if(intNum != null) {
        if(intNum % 3 == 0) {
            println("$intNum 은 3의 배수")
        } else {
            println("$intNum 은 3의 배수 아님")
        }
    }


    // 풀이
    print("정수값을 입력하세요 : ")
    var strNum1:String = scan.nextLine()
    var intNum1 = 0
    try {
        intNum = Integer.valueOf(strNum)
    } catch(e:NumberFormatException) {
        println("정수값만 입력하세요")
        return
    }
    if (intNum1 % 3 == 0) {
        println("$intNum1 은 3의 배수")
    } else {
        println("$intNum1 은 3의 배수 아님")
    }
}