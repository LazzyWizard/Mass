fun main() {
    val alphabet = listOf('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я')
    println("Введите ключевое слово:")
    val keyword = readln().toLowerCase()
    println("Введите текст для шифровки:")
    val text = readln().toLowerCase()
    var result = ""
    var keywordIndex = 0
    for (char in text) {
        if (char in alphabet) {
            val charIndex = alphabet.indexOf(char)
            val newIndex = (charIndex + alphabet.indexOf(keyword[keywordIndex % keyword.length])) % alphabet.size
            result += alphabet[newIndex]
            keywordIndex++
        }
        else
        {
            result += char
        }
    }
    println("Зашифрованный текст: $result")
}