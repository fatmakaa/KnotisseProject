Feature: US34
  @US34_TC01
  Scenario: US34_TC01
    When İlgili web siteye gidilir.nihal
    When Kullanıcı Login/Register butonuna tıklanir.nihal
    When Login kısmındaki e-mail kutusuna daha önce  kayıt olduğu e postayı girilir.nihal
    When Daha önce belirlediği şifreyi girilir.nihal
    When Login butonuna tıklanir.nihal
    And Girişin başarılı olduğunu doğrulamak için anasayfada My account dashboard ı görülür.nihal



  @US34_TC02
  Scenario: US34_TC02
    When İlgili web siteye gidilir.nihal
    When Kullanıcı Login/Register butonuna tıklanir.nihal
    When Login kısmındaki e-mail kutusuna rastgele bir e posta girilir.nihal
    When Rastgele şifre girişi yapilir.nihal
    When Login butonuna tıklanir.nihal
     And Kullanıcı, "Unknown email address. Check again or try your username." mesajının görülürnihal


  @US34_TC03
  Scenario: US34_TC03
    When İlgili web siteye gidilir.nihal
    When Login kısmındaki e-mail kutusuna daha önce  kayıt olduğu e postayı girilir.nihal
    When Rastgele yanlış bir şifre girilir.nihal
    When Login butonuna tıklanir.nihal
    And Şifrenin yanlış olduğuna dair bir hata alinir.nihal


  @US34_TC04
  Scenario: US34_TC04
    When İlgili web siteye gidilir.nihal
    When Login kısmındaki "Username or email address" kutusuna rastgele bir username girişi yapilir.nihal
    When Rastgele bir şifre girilir.nihal
    When Login butonuna tıklanir.nihal
     And The username fdgdf.com is not registered on this site. If you are unsure of your username, try your email address instead."nihal
