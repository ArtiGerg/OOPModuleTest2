package main;

/**
 * Az elméleti kérdéseket itt találod.
 * A válaszaidat a kérdés komment-blokkjába írd!
 */
public class Theorem {

    /* 1. Milyen OOP-koncepciók jelennek meg a Java programozási nyelvben, és azok mit jelentenek?
        Jellemezd a koncepciókat 1-2 mondatban!
        (6 pont)
        - absztrakció: fontos tulajdonságot jelenít meg háttérrészletek nélkül.
        -enkapszuláció : egy osztály változói mindig el vannak rejtve a többi osztály elől.
                          Csak metódusokkal érhető el.
        -öröklődés:Amikor az osztály az ősosztály tulajdonságait és viselkedéseit veszi fel.
                    javában csak egyszeres öröklődés van.
        -polimorfizmus: Amikor több metúdusnak ugyanaz a neve csak más bemeneti értékeket
                        vár, vagy máshogy működnek.
         -asszociáció: két objektum kapcsolatát írja le.
         -aggregáció: amikor az asszociációban az egyik objektum tulajdonságához tartozik egy
                       másik különálló objektum is.
         -kompozició: amikor az asszociációban   az egyik objektum tulajdonságához tartozik egy
                       másik különálló objektum is,  és tartalmazó objektum nem létezik a másik nélkül.
         -csatolás: ez a láthatósági mezőket foglalja magaába(public, private, protected, package private)
         -kohézió: amikor egy osztály vagy egy package csak egy  fókoszált feladatot csinál.
     */


    /* 2. Milyen módszerek léteznek a dinamikus adatszerkezetekben tárolt objektumok rendezésére?
        Ismertesd ezeket a rendezési módszereket röviden!
        (Megjegyzés: a dinamikus adatszerkezetek a List, a Set és a Map.)
        (6 pont)

        Kétféle rendezési elvet ismerek. Az első a Comparable interface használata.Amikor paraméterként
        kap egy objektumot a metódus és egész számmal tér vissza.(ha: -1 kisebb,0 az egyenlő,1 nagyobb).
        A "compareTo" metódusnak van egy természetes rendezési elve, ilyenkor a beépített rendezés szerint
        tudja rendezni az objektumokat.
        A másik módja a rendezésnek a Comparator interface használata. Ilyenkor külön létrehozunk egy
        másik osztály amiben csak a "compareTo" metódust formázzuk meg .


     */


    /* 3. Mit jelent a szálkezelés? Hogyan valósítható meg egy többszálú program? Mik az előnyei, hátrányai, veszélyei?
        (3 pont)

        Amikor több folyamat fut párhuzamosan.
        Thread osztály alkalmazásával vagy a Runnable interface segítségével.
        Hátrányai: - több hibalehetőség, több memóriát használ fel
        Előnyei: -gyorsabb

     */

}
