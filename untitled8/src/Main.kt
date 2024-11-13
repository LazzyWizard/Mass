fun main() {
    println("Введите слова через запятую:")
    val words = readln()
    val wordsArray = words?.split(",")?.map { it.trim() }
    val groupedWords = mutableMapOf<String, MutableList<String>>()
    if (!wordsArray.isNullOrEmpty())
    {
        for (word in wordsArray)
        {
            val sortedWord = word.toCharArray().sorted().joinToString("")
            if (groupedWords.containsKey(sortedWord))
            {
                groupedWords[sortedWord]?.add(word)
            }
            else
            {
                groupedWords[sortedWord] = mutableListOf(word)
            }
        }
        println("Слова сгруппированные по признаку 'состоят из одинаковых букв':")
        groupedWords.values.forEach { wordsList ->
            println(wordsList.joinToString(", "))
        }
    }
    else
    {
        println("Вы не ввели слова.")
    }
}