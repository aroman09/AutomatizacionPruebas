##**README SERENITY WEB SHOP CART**

##**Ejecucion de test con gradle:**

```
./gradlew clean test
```

Para ejecutar los tests en navegador Firefox:
```
./gradlew clean test -Dwebdriver.driver=firefox
```
Ejecucion automatica en windows:
```
gradlew clean test
```

##Run tests with Maven:

mvn clean verify -Ddriver=firefox

or try this:

mvn clean verify -Dwebdriver.driver=firefox