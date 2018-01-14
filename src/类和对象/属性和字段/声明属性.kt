package 类和对象.属性和字段

class Address {
    var name: String = "张三"
    var street: String = "泉口街道"
    var city: String = "北京"
    var state: String = "未压缩"
    var zip: String = "压缩成ZIP格式"

}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    result.city = address.city
    result.state = address.state
    result.zip = address.zip

    return result
}

fun main(args: Array<String>) {
   println(copyAddress(Address()).name)
}