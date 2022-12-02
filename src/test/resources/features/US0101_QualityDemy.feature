
Feature: US 0101 QualityDemy

Scenario: Kullanici basarili bir sekilde giris yapabilmeli

  Given Kullanici quality demy sayfasina gider
  When  Email ve password bilgilerini girerek giris yapar
  Then  Basarili bir sekilde giris yaptigini test eder
  Then  Sayfayi kapatir