@wip
  Feature: US 0104 Automation Login Test

    Scenario: Kullanici basarili biir sekilde giris yapabilmeli

      Given Kullanici "myAutomationUrl" sayfasina gider
      Then Kullanici Signup butonuna tiklar
      Then Kullanici mail kutusuna "email" girer
      Then Kullanici password kutusuna "password" girer
      Then Kullanici login butonuna tiklar
      Then Kullanici Automation sayfasina girdigini test eder
      And Sayfayi kapatir