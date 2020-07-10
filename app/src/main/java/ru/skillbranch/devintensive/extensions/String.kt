package ru.skillbranch.devintensive.extensions


fun String.stripHtml() : String{
    var resultString: String
    resultString = this.substringBefore("<") + this.substringAfter(">")
    if(resultString.contains("<"))
        resultString = resultString.stripHtml()
    return resultString.replace(Regex("\\s+")," ").replace(Regex("[& < > ' \"\"]")," ")
}

fun String.truncate(lenght: Int = 16) : String{
    val filler: String = "..."
    return this.substring(0, lenght).trimEnd { c ->  c.equals(' ') } + filler

}


