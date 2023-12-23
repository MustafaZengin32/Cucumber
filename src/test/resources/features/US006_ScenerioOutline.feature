Feature: Scenerio Outline Kullanimi

  Scenario Outline:TC01 Kullanici istedigi kelimeleri aratir
    Given kullanici amazon sayfasina gider
    Then  kullanici "<istenenKelime>" icin arama yapar
    Then  sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And   sayfayi kapatir

    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | iphone        | iphone               |
      | selenium      | selenium             |
      | SQL           | SQL                  |
    #CTRL + Alt + L ile simetrik yapilabilir son satirda iken


