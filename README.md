[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/coREwzrI)

###Az indításhoz szükséges commandok:

>`mvn package`

> `java -cp target/meow-1.0-SNAPSHOT.jar main.java.Main`

---
##Jelenleg kész / készül:
###Technológia fókusz
- [x] Build keretrendszer beüzemelése, ha még nincs (Maven, Gradle...) + CI beüzemelése, ha még nincs (Actions, Travis, AppVeyor, Azure Pipelines...)
- [x] Manuális kód átvizsgálás elvégzése az alkalmazás egy részére (GitHub, Gerrit...) + Statikus analízis eszköz futtatása és jelzett hibák átnézése (SonarCloud, SpotBugs, VS Code Analyzer, Codacy, Coverity Scan...)
- [ ] Deployment segítése (Docker, Vagrant, felhő szolgáltatásba telepítés, ha értelmes az adott alkalmazás esetén...)
- [ ] Egységtesztek készítése/kiegészítése (xUnit...) + tesztek kódlefedettségének mérése és ez alapján tesztkészlet bővítése (JaCoCo, OpenCover, Coveralls, Codecov.io...)
###Termék/felhasználó fókusz
- [ ] Nem-funkcionális jellemzők vizsgálata (teljesítmény, stresszteszt, biztonság, használhatóság...)
- [ ] UI tesztek készítése (Selenium, Tosca, Appium...)
- [ ] BDD tesztek készítése (Cucumber, Specflow...)
- [ ] Manuális tesztek megtervezése, végrehajtása és dokumentálása vagy exploratory testing- Maven beüzemelése kész