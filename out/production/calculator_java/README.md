Assignment: Softverska analiza: Calculator

LOC analiza (Lines of Code)
Broj linija koda:
•	Calculator.java – 135 linija koda
•	Start.java – 20 linija koda
  •	Ukupno – 155 linija koda
LOC se racuna kao broj linija koje sadrze neki kod (bez linija koda koje su prazne a koriste se za estetiku koda)

Neformalni pregled I staticka analiza
Koristivsi SonarQube lint alat za analizu koda, utvrdio sam da u file:

1.	Calculator.java postoji 8 problema 
  
   a.	Linija koda 3: 
    i.	SonarQube preporucuje da se u kod na 3 liniju ubaci „package calculator;“ i nakon toga nestaje svih 8 prijavljenih problema
  
  b.	Linija koda 4:
    i.	U liniji koda 4 se preporucuje dodavanje privatnog konstruktora Calculator
      1.	private Calculator () {
          //privatni konstruktor da bi se sprecilo nezeljeno instanciranje
          } 
  
  c.	Linija koda 18:
    i.	U liniji 18 se preporucuje izmena imena metode ToString jer vec postoji ugradjena toString() metoda u super klasi java.lang.Object
  
  d.	Linija koda 18:
    i.	U liniji 18 SonarQube preporucije da se promeni ime metode ToString, jer nije napisano po konvenciji da ime metode pocinje malim slovom, zbog toga treba koristiti toString metodu iz Object super klase
  
  e.	Linija koda 24: 
    i.	Isti problem se javlja u liniji 24 sa metodom Run jer ne prati standardnu Java naming konvenciju
  
  f.	Linija koda 70:
    i.	SonarQube preporucuje momentalno vracanje rezultata, sto bi se moglo izvesti na sledeci nacin:
      1.	return Float.toString(finalResult);

  g.	Linija koda 74:
    i.	Preporucuje se promena imena metode Calculate, I trebalo bi koristiti calculate

  h.	Linija koda 183:
    i.	Nepotreban return, neophodno brisanje po preporuci SonarQube
2. Start.java postoje 4 problema:
  a.	Linija koda 2:
    i.	Potrebno je dodati package, na primer “package calculatorApp;”
  
  b.	Linija koda 6:
    i.	Potrebno je metodu Expression napisati malim slovom jer ne prati Java naming konvenciju

  c.	Linija koda 8 i 19:
    i.	Preporuka da se koristi logger metoda umesto System.out jer je profesionalnije. Daljim istrazivanjem sam otkrio da je neophodno prvo importovati java.util.logging.logger;, zatim napraviti objekat
        Logger logger=Logger.getLogger(getClass().getName()); i onda koristiti kao logger.info(„MyMessage). Prilozeno se vidi na sledecem fajlu.
Link do Assignment file sa prilozenim fotografijama:

https://limewire.com/d/gYv5L#MsQzX71oUc
