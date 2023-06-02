# SonarCloud analízis

---

### Bugok:
- FileOutPutStream volt használva try with resouces nélkül
- az egyik függvényben lehetett egy mező értéke null amit nem ellenőrzött semmi ezért egy try-catch blokkba raktam
- egy getClass()-es összehasonlítást lecseréltem egy instanceofra