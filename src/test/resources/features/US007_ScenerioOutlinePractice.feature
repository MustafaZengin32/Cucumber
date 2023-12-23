Feature: Scenerio Outline Practice1

  Scenario Outline:TC01 Configreader ile Scenerio Outline Kullanimi

    Given kullanici "<arananURL>" sayfasina gider
    Then  kullanici 2 saniye bekler
    When  url in "<istenenURL>" oldugunu test eder

    Examples:
      | arananURL | istenenURL |
      | amazonURL | amazon     |
      | faceURL   | facebook   |
      | google    | google     |
      | brcURL    | blue       |

    #Hatalar
    #1.Scenario Outline dan sonra : arasina bosluk koyarsak hata verir 0 scenerio yazar neyi test ettigimizi bilemeyeiz
    #2.Gherkin i Examples dan sonra yazarsak hata verir


