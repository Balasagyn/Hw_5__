fun main(args: Array<String>) {
    var a = "переменная, функция, метод, аргумент, параметр, привязка, длина, высота, размер"
    var glasnyi = "аяуюоёеэиыАЯУЮОЁЕЭИЫ"
    var soglasnyi = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ"
    var result = ""
    var result2 = ""
    for (i in a){
        if (i in glasnyi){
            result+=i
        }else if (i in soglasnyi){
            result2+=i
        }
    }
    println(result)
    println(result2)
}