fun main() {
    name()

    intro("mercy",21)

    water()
    yes("mercy")
    yes("wangari")


}
fun name(){
    var name="akirachix"
    println(name[0])
    println(name[2])
    println(name[3])

}
fun intro(name:String,age:Int) {
    println("Hi, my name is $name and i am $age years old")
}
fun water(){
    val eye="eye"
    println(eye.length)
}
fun yes(name: String){
    if(name=="mercy"){
        println("thats me")
    }
    else{
        println("i dont know who that is")

    }

        }

























