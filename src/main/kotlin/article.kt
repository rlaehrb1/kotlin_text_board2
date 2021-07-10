fun main(){
    val article1 = Article()
    article1.id = 1
    article1.regDate = "2021-7-10 16:13"
    article1.title = "제목1"
    println("id : ${article1.id}, title : ${article1.title}, 날짜: ${article1.regDate}")

    val article2 = Article()
    article2.id = 2
    article2.regDate = "2021-7-10 16:15"
    article2.title = "제목2"
    println("id : ${article2.id}, title : ${article2.title}, 날짜: ${article2.regDate}")

}

class Article{
    var id: Int = 0
    var regDate: String = ""
    var title : String = ""
}