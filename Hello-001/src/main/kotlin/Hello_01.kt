
// Kotlin main 진입점 함수
// Kotlin은 기본값이 class가 아니다
// 기본은 그냥 코드다
// 다만 main() 함수로 시작한다
fun main() {
    println("우리나라만세")

    var num1 = 10
    var num2 = 20
    var sum = num1 + num2
    
    // 문자열 template 식
    // 문자열 내부에 $변수명 형식으로 작성을 하면
    // 변수값을 연산하여 문자열로 변환 후 사용할 수 있다
    println("$num1 + $num2 = $sum")
    
    // ${ 연산식 } 형식으로 작성을 하면 연산식을 연산한 후 결과를 문자열로 변환한 후 사용할 수 있다
    println("${num1 * num2}")

    // (( 변수 뒤에는 반드시 빈칸이 하나 와야하고, 빈칸 없이 하고 싶다면 변수명을 {} 로 묶어줘야 한다 ))
    var str = "두수 ${num1}과 $num2 의 덧셈 결과 : ${num1 + num2}"
    println(str)

    // num1은 이미 Int 형으로 선언되었기 때문에
    // 실수형 값을 저장할 수 없다
    // num1 = 3.0
    
    // String str = null --> java
    // var st1 = null --> kotlin. 초기값으로 null값 불가


    // var 변수명:변수타입 = 초기값
    // (( 자바스크립트의 타입스크립트 코드와 매우 유사 ))

    // 정수형
    var var1:Int = 0 // 4byte
    var var2:Long = 0L // 8byte
    var bit1:Byte = 0 // 1byte 정수 (-128 ~ 127 까지만 저장)

    // 실수형
    var var4:Float = 3.0F // 4byte
    var var5:Double = 3.0 // 8byte

    // 문자열형 (( 여러개의 문자 담을 수 있음 ))
    var var3:String = ""
    
    // 문자형 (( 문자 1개만 담을 수 있음 ))
    var char1:Char = 'A'

    // 논리형
    var bYes:Boolean = true
}

/**
 * Kotlin 변수
 * Kotlin은 변수 type을 지정하지 않아도 선언, 생성할 수 있다
 * 변수는 반드시 초기값이 있어야 한다
 * Kotlin 은 변수의 초기값을 보고 변수의 type을 결정한다
 * (( 큰따옴표("")로 묶이면 문자열형으로 ))
 *
 * 단지 변수 type을 지정하지 않을뿐 한번 선언된 변수에 다른 type의 데이터(값)을 저장할 수는 없다
 * 
 * 변수를 선언할 때 변수들의 초기 값은 null이 될 수 없다
 * 
 * Kotlin에서도 변수형을 지정하여 선언할 수 있다
 * Kotlin의 변수 type은 클래스 type이 없다. 모두 primitive 방식이다
 * 단, 모든 변수 type의 키워드는 첫글자가 대문자다
 * 변수 type을 지정하지 않아도 선언을 할 수 있는데 굳이 Type을 지정하는 이유는
 * Kotliin 문법중에 변수의 초기화를 미루기(유예하기) 라는 기능 때문이다
 */