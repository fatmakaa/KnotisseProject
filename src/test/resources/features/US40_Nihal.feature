Feature: US40
  @US40_TC01
  Scenario: US40_TC01
    When İlgili web siteye gidilir.nihal
    Then Kullanıcı Login/Register butonuna tıklanir.nihal
    Then Login kısmındaki e-mail kutusuna kayıt olduğu e postayı girilir.nihal
    Then Daha önce belirlediği şifreyi girilir.nihal
    Then ANTIQUE Rugs a tıklanirnihal
    Then  Rastgele bir ürüne tıklanir.nihal
    Then "Add to Quote List" butonuna tıklanir.nihal
    Then Daha sonra beliren "View Quote List" butonuna tıklanir.
    Then Açılan pencerede daha önce eklediği ürünleri ve ürün detaylarını görebilirnihal
    And Eklediği ürünlerin sayısını quantity kısmından arttırıp azaltabilirnihal


  @US40_TC02
  Scenario: US40_TC02
    When İlgili web siteye gidilir.nihal
    Then Kullanıcı Login/Register butonuna tıklanir.nihal
    Then Login kısmındaki e-mail kutusuna kayıt olduğu e postayı girilir.nihal
    Then Daha önce belirlediği şifreyi girilir.nihal
    Then  ANTIQUE Rugs a tıklanir.nihal
   Then İlk ürüne tıklar ve quote liste eklenir.nihal
   Then Üçüncü ürüne tıklar ve quote list e eklenir.nihal
   Then Daha sonra beliren "View Quote List" butonuna tıklanirnihal
   Then Çöp kutusu ikonuna tıklayarak ilk ürünü silinir.nihal
  And Clear list e tıklayarak diğer ürünün de silindiğine emin olunur.nihal

  @US40_TC03
  Scenario: US40_TC03
    When İlgili web siteye gidilir.nihal
    Then Kullanıcı Login/Register butonuna tıklar.nihal
    Then Login kısmındaki e-mail kutusuna kayıt olduğu e postayı girer.nihal
    Then Daha önce belirlediği şifreyi girer.nihal
    Then ANTIQUE Rugs a tıklar.nihal
    Then İlk ürüne tıklar ve quote liste ekler.nihal
   Then Daha sonra beliren "View Quote List" butonuna tıklar.nihal
   Then  Quote Request Form kısmındaki zorunlu alanları (First Name*, Last Name, Email) doldurur.nihal
  Then  Send Request butonuna tıklar.nihal
  And  Tıkladıktan sonra "Your request has been submitted." Mesajını görmelidir.nihal



  @US40_TC04
  Scenario: US40_TC04
    When İlgili web siteye gidilir.nihal
    When Kullanıcı Login/Register butonuna tıklanir.nihal
   Then Login kısmındaki e-mail kutusuna kayıt olduğu e postayı girilir.nihal
   Then Daha önce belirlediği şifreyi girilir.nihal
   Then ANTIQUE Rugs a tıklanir.nihal
   Then İlk ürüne tıklar ve quote liste eklenir.nihal
  Then Daha sonra beliren "View Quote List" butonuna tıklanir.nihal
   Then Quantity kısmına 0 olarak giriş yapilir.nihal
  Then Update list e tıklanir.nihal
  Then Quote Request Form kısmındaki zorunlu alanları (First Name*, Last Name, Email) doldurulur.nihal
  Then Send Request butonuna tıklanir.nihal
  And İstek başarısız olmalıdır.nihal


  @US40_TC05
  Scenario: US04_TC01
    When İlgili web siteye gidilir.nihal
    Then Kullanıcı Login/Register butonuna tıklanirnihal
    Then Login kısmındaki e-mail kutusuna kayıt olduğu e postayı girebilir.nihal
    Then  Daha önce belirlediği şifreyi girebilir.
    Then ANTIQUE Rugs a tıklanirnihal
   Then Rastgele bir ürüne tıklanir.nihal
  Then "Add to Quote List" butonuna tıklanir.nihal
  Then Daha sonra beliren "View Quote List" butonuna tıklanir.nihal
  Then Quote Request Form kısmındaki First name kutusuna digit girebilirnihal
  Then Last name a digit girebilir.nihal
  Then Email adresi kutusunu doldurabilir.nihal
  Then Send Request butonuna tıklanir.nihal
  And İsim ve soy isim kısmına digit girişini kabul etmemeli. Ve fiyat teklifi gönderimi başarısız olmalıdir..nihal

