# Maven telepítése és Github Action beállítása

## Maven telepítése

- Ha még nincs, akkor Java telepítése
- A https://maven.apache.org/download.cgi oldalról a legújabb verziójú tömörített állomány letöltése
- Ennek tetszőleges helyre kicsomagolása
- A bin mappa PATH környezeti változóhoz hozzáadása

## Projekthez hozzáadás

A legegyszerűbb egy új projektnél a mavenre bízni a fájlok és mappastruktúra generálását, mivel ebben az esetben biztosan minden elvárás szerint lesz elrendezve. Erre használható az alábbi parancs (groupId és artifactId megadásával):

`mvn -B archetype:generate -DgroupId=[] -DartifactId=[] -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4`

Ez legenerálja a mappákat és a pom.xml fájlt. Ebbe a formába strukturáltuk át mi is a kiinduló projektet, miután gondok adódtak az eredeti fájlrendszer miatt.

Ezután kiadható az `mvn package` parancs a projekt gyökérkönyvtárában, ami egy target nevű mappába helyezi az általa készített fájlokat, beleértve a futtatandó jar fájlt is. Ez már a teszteket is lefuttatja.

A futtatásra az alábbi parancs használható, megadva a jar file és a main class elérési útját
`java -cp target/meow-1.0-SNAPSHOT.jar main.java.Main`

## Java CI with Maven

Githubon az Actions fülön kell egy új workflowt hozzáadni, majd kikeresni a listából a Java CI with Mavent. A github legenerálja a szükséges maven.yml fájlt, ezzel további teendő nincsen.