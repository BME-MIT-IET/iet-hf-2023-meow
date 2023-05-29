## SonarLint analízis dokumentáció

---

### Code smellek:
- **Agent:**
  - TTL mező átnevezése timeToLive-re hogyan beszédes neve legyen és kövesse a camelcase-t
- **BearDance:**
  - println lecserélése logolásra
- **Forget:**
  - ArrayList<valami> helyett ArrayList<> írása a létrehozásánál
  - nem használt importok kiszedése
- **VitusDance:**
  - println lecserélése logolásra
- **Protection:**
  - println lecserélése logolásra
- **Axe:**
  - egy if statmentben volt egy mindig igaz kifejezés
- **Cloak:**
  - Random helyi használata heylett egy random ami sigleton

### Bugok:
- **Paralyzed:**
  - a paralyzed osztályban rengeteg üres függvény volt, de a hiba kijavítása nagyobb refaktorálást igényel (az egész agent csoport funkcióniak átírása)
ezért a csapat úgy döntött hogy inkább nézzünk meg több hibát és ne ezzel az egyel foglalkozzunk
  - a **BearDance** és a **Forget** osztályoknál hasonló probléma
