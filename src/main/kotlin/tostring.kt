fun main(){
    val article1 = Article1()
    article1.id = "김도규"
    article1.age = 30
    article1.sex = "남자"
    article1.city = "전주"
    println("이름 : ${article1.id}, 성별 : ${article1.sex}, 나이 : ${article1.age}, 사는곳 : ${article1.city} ")

    val article2 = Article1()
    article2.id = "이서이"
    article2.age = 28
    article2.sex = "여자"
    article2.city = "전주"
    println("이름 : ${article2.id}, 성별 : ${article2.sex}, 나이 : ${article2.age}, 사는곳 : ${article2.city} ")

    val article3 = Article1()
    article3.id = "홍길동"
    article3.age = 40
    article3.sex = "남자"
    article3.city = "서울"
    println("이름 : ${article3.id}, 성별 : ${article3.sex}, 나이 : ${article3.age}, 사는곳 : ${article3.city} ")

}

class Article1{
    var id: String = ""
    var sex: String = ""
    var age: Int = 0
    var city : String = ""


}