Feature: Background kullanimi

  Background: Ortak adimlar
    Given  kullanici amazon sayfasina gider

    @seneryo1
  Scenario: TC01 kullanici searchbox test eder

    When  kullanici iphone aratir
    Then  kullanici sonuclarin iphone icerdigini test eder


  Scenario: TC02 kullanici searchbox test eder

    When  kullanici Selenium aratir
    Then  kullanici sonuclarin Selenium icerdigini test eder


  Scenario: TC03 kullanici searchbox test eder

    When kullanici Java aratir
    Then kullanici sonuclarin Java icerdigini test eder
    And kullanici sayfayi kapatir
