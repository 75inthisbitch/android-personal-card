fun main() {
    val pseudonim = "Alex"
    val klasa = "IV"
    var kierunek = "Technik informatyk"

    println("DANE UCZNIA")
    println("Pseudonim: $pseudonim")
    println("Klasa: $klasa")
    println("Kierunek: $kierunek")

    kierunek = "Technik informatyk – programowanie"

    println()
    println("Aktualny kierunek: $kierunek")

    val pierwszyWynik = obliczGodziny(2, 4)
    val drugiWynik = obliczGodziny(5, 6)

    println()
    println("ŁĄCZNA LICZBA GODZIN")
    println("2 godziny tygodniowo przez 4 tygodnie: $pierwszyWynik")
    println("5 godzin tygodniowo przez 6 tygodni: $drugiWynik")
}

fun obliczGodziny(godzinyTygodniowo: Int, liczbaTygodni: Int): Int {
    return godzinyTygodniowo * liczbaTygodni
}
