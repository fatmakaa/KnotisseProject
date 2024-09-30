Feature: US36
  @US36_TC01
  Scenario: US36_TC01
    When İlgili web siteye gidilir.nihal
    Then  Home page üzerinden "Catalogue" menüsüne tıklanır.nihal
    Then İlgili ürünlerin listelendiği doğrulanır.nihal
    Then Alternatif olarak, başka bir sayfa üzerinden (örn. new arrivals sayfası) "Catalogue" menüsüne tıklanır.nihal
    And İlgili ürünlerin listelendiği doğrulanir.nihal


  @US36_TC02
  Scenario: US36_TC02
    When İlgili web siteye gidilir.nihal
    Then Kullanıcı Login/Register butonuna tıklanir.nihal
    When Login kısmındaki e-mail kutusuna kayıt olduğu e postayı girilir.nihal
    Then Daha önce belirlediği şifreyi girilir.nihal
    Then Kullanıcı My account a tıklanir.nihal
    Then Addresses a tıklar.
    Then Billing address add a tıklar.nihal
    Then Zorunlu alanları boş bırakır.nihal
    Then Save address butonuna tıklamalıdır.nihal
    And Her zorunlu alan için uyarı almalı.nihal



  @US36_TC03
  Scenario: US01_TC01
    When İlgili web siteye gidilir.nihal
    Then Kullanıcı Login/Register butonuna tıklar.nihal
    Then Login kısmındaki e-mail kutusuna kayıt olduğu e postayı girer.nihal
    Then Daha önce belirlediği şifreyi girer.nihal
    Then Kullanıcı My account a tıklar.nihal
    Then Addresses a tıklar.nihal
    Then Billing address add a tıklar.nihal
    Then First name kısmına digit girer.nihal
    Then Last name kısmına digit girer.nihal
    Then Kalan tüm zorunlu alanları doldurur.nihal
    Then Save address e tıklar.nihal
    And Kayıt başarılı olmamalıdır.nihal