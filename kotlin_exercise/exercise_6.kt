fun main(){
    val str = "Abebe"
    var minChar = str[0]
    var maxChar = str[0]
        for (char in str) {
            if (char < minChar) {
                minChar = char
            }
            if (char > maxChar) {
                maxChar = char
            }
        }

        println("Minimum character: $minChar")
        println("Maximum character: $maxChar")
    
}

