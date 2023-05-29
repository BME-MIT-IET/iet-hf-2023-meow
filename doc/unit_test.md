# Unit tesztek készítése és a kódlefedettség vizsgálata


A feladat unit tesztek készítése volt, majd a kódlefedettség vizsgálata és ezek alapján a tesztkészlet bővítése. A tesztek készítéséhez a jUnit keretrendszert, az osztályok közötti függőségek mock-olására Mockito-t használtam.

A Code Coverage JaCoCo-val vizsgálva:

![](screenshots/unit_test/jacoco.png)

A tesztek kódlefedettségének javítására hozzááadtam a VirologistTest és NucleicAcidTest osztályokat:

![](screenshots/unit_test/coverage1.png)

![](screenshots/unit_test/coverage2.png)

A Unit tesztek futtatása során felfedeztem egy hibát az Axe osztály murder metódusában:

![](screenshots/unit_test/test.png)

A bug javítása után minden test sikeresen fut:

![](screenshots/unit_test/test2.png)