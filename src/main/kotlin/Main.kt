fun main(args: Array<String>) {
    println("Hello, World")
    // No need to declare new to make an instance
    val q = Question()
   // q = Question()

    q.Answer = "42"
    // q.Question can't be re-assign because key word val

    // val  --- are immutable
    // var  --- are mutuable
    q.Question = ""
}

class Question {
    var Answer:String = ""
    val Question: String = "What is the answer to life, he universe and everything?"
}