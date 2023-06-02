# SonarCloud analízis

---

A SonarCloud hozzáférést később kaptuk meg addig a statikus analízis első felét sonarlintben végeztem a fejlesztőkörnyezetben.
## Javítások

### Bugok:
- FileOutPutStream volt használva try with resouces nélkül
- az egyik függvényben lehetett egy mező értéke null amit nem ellenőrzött semmi ezért egy
try-catch blokkba raktam
- egy getClass()-es összehasonlítást lecseréltem egy instanceofra

### Code smellek:
- ismédlődő stringek konstansba kiemelése
- Ranndom osztályt átneveztem hogy ne ütközzön a javaban már hasznnálatos random osztállyal

E mellet még számos hibát találtam és megvizsgáltam, de a hibák nagy része ismétlődő volt, 
igyekeztem a nagyobb prioritású, érdekesebb hibákat javítani. Sok üres függvény még egy érdekes 
probléma volt, de a refaktorálása nagy komplexitású feladat lett volna (öröklődésnél voltak felüldefiniált üres függvények, holott sokkal egyszerűbb lett volna máshogy megoldani...) a házi keretein belül és 
igyekeztem inkább a divezifikációra koncentrálni.

![img.png](screenshots/sonarcloud/sonarcloud%20summary.png)

A bugok javítva lettek nagyrészt, a security issuek printstacktrace 
parancs által kiváltottak, ezeket természetesen egy végleges termékből kiszedi az ember.