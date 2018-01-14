package 开始.习惯用法


//创建一个数据类
data class Custom(val name: String, val email: String)

/*
    会为Custom类提供以下功能
    - 所有属性的getter方法（var定义的还有setter）
    - equals（）
    - hashCode()
    - toString()
    - copy()
    - 所有属性的component1(),component2()等等


 */