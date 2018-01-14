package 类和对象.类和继承

/*
 *  类也可以声明前缀有constructor的次构造函数
 */

class Dog {
    constructor(parent: Dog) {
//        parent.children.add(this)
    }
}

class Pig(val name:String){
    constructor(name: String,parent: Pig):this(name){
//        parent.children.add(this)
    }
}