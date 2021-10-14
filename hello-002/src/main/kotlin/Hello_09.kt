import kotlin.random.Random

fun main() {
    var rnd:Random = Random(System.currentTimeMillis())

    var num1:Int = rnd.nextInt(100)

    when (num1 % 2) {
        0->println("짝수")
        1->println("홀수")
    }
    
    var result = when(num1 % 3) {
        0->"3의 배수"
        1->"글쎄"
        2->"결과가 2면 뭘까"
        else->"알수 없음"
    }
    print("$num1 $result")
}