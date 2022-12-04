
  Feature: US 0106 Automation Negative Giris Testi

    Scenario Outline: Kullanici negative bilgiler gonderdiginde siteye giris yapilamaz

      Given Kullanici "myAutomationUrl" sayfasina gider
      Then Kullanici Signup butonuna tiklar
      Then Kullanici mail kutusuna "<email>" girer
      Then Kullanici password kutusuna "<password>" girer
      Then Kullanici login butonuna tiklar
      Then Kullanici sayfaya giris yapilamadigini test eder
      And Sayfayi kapatir
      Examples:
        | email | password |
        | automationnegativeMail | automationPassword |
        | automationnegativeMail1 | automationPassword1 |
        | automationnegativeMail2 | automationPassword2 |
        | automationnegativeMail3 | automationPassword3 |
