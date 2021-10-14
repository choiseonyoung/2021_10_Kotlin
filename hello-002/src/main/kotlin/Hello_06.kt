import java.util.*

fun main() {
    // * 키보드로부터 뭔가를 입력받기 위한 코드
    var scan:Scanner = Scanner(System.`in`)

    print("문자열을 입력하세요")
    var input:String = scan.nextLine()
    println("입력한 문자열 : $input")

    print("한자리의 정수를 입력하세요 : ")
    var strNum:String = scan.nextLine()

    // 입력받고자 하는 대상이 정수형인데 문자열로 입력받았으므로
    // 다시 정수형으로 변환해줘야 한다
    // var intNum = Integer.valueOf(strNum)

    // 정수가 아닌 값을 입력하면 Integer.valueOf() 에서 exception이 발생한다
    // 이때 try-catch를 사용하여 exceptioin 처리를 해줘야 한다

    var intNum = 0
    try {
        intNum = Integer.valueOf(strNum)
    } catch (e:NumberFormatException) {
        println("정수만 입력해야 합니다")
    }

    println("입력한 숫자 $intNum, ${intNum * intNum}")
}