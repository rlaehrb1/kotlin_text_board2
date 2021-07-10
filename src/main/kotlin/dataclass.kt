fun main() {
    val Person1 = Person("김도규", "남자", 30, "전주")
    println(Person1.introduceMsg())


    /*Person1.id = "김도규"
    Person1.age = 30
    Person1.sex = "남자"
    Person1.city = "전주"
    println(Person1.introduceMsg())*/

    //println(Person1)

    //println("이름 : ${Person1.id}, 성별 : ${Person1.sex}, 나이 : ${Person1.age}, 사는곳 : ${Person1.city} ")

    val Person2 = Person("이서이","여자", 28, "전주")
    println(Person2.introduceMsg())

    /* Person2.id = "이서이"
    Person2.age = 28
    Person2.sex = "여자"
    Person2.city = "전주"
    println(Person2.introduceMsg())*/

    //println(Person2)

    //println("이름 : ${Person2.id}, 성별 : ${Person2.sex}, 나이 : ${Person2.age}, 사는곳 : ${Person2.city} ")

    val Person3 = Person("홍길동", "남자", 40, "전주")
    println(Person3.introduceMsg())


    /*Person3.id = "홍길동"
    Person3.age = 40
    Person3.sex = "남자"
    Person3.city = "서울"
    println(Person3.introduceMsg())*/

    //println(Person3)

    //println("이름 : ${Person3.id}, 성별 : ${Person3.sex}, 나이 : ${Person3.age}, 사는곳 : ${Person3.city} ")

}

class Person(var id: String,
             var sex: String,
             var age: Int ,
             var city: String ) {


    /*var id: String = ""
    var sex: String = ""
    var age: Int = 0
    var city: String = ""*/

    fun introduceMsg(): String { // = "안녕하세요! 저는 $id 입니다. ${age}살이고 $city 에 살고있습니다." 한줄일때.
        return "안녕하세요! 저는 $id 입니다. ${age}살 $sex 이고 $city 에 살고있습니다."
    }

    override fun toString(): String {        // << 코드를 간단하게 하기 !!
        return "id: $id, sex: $sex, age: $age, city: $city "
    }


}