fun main(args: Array<String>) {
    println("Hello, World")
    // No need to declare new to make an instance
    val q = Question()
   // q = Question()

    q.Answer = "42"
    // q.Question can't be re-assign because key word val

    // val  --- are immutable
    // var  --- are mutuable

    //q.Question = ""

    q.display()
    println("The answer to the question ${q.Answer} is ${q.Answer}")

    val message = if(q.Answer == q.CorrectAnswer){
        "You were correct"
    } else {
        "try again?"
    }

    println(message)
}

class Question {
    var Answer:String = ""
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, he universe and everything?"

    fun display(){
        println("You said $Answer")
    }
}