Feature: US22
  @US22_TC01
  Scenario: US22_TC01
    When Kullanıcı web sitesine gidilir.nihal
    When Kullanıcı sayfanın alt kısmına gidilir.nihal
    And  Customer Service bölümümdeki "Terms and Conditions"  bağlantısını tıklanir.nihal

  @US22_TC02
  Scenario: US22_TC02
    When Kullanıcı web sitesine gidilir.nihal
    When Kullanıcı sayfanın alt kısmına gidilir.nihal
    When Customer Service bölümümdeki "Terms and Conditions"  bağlantısını tıklanir.nihal
    And  "Terms and Conditions" sayfasının, kullancı kullanım şartlarının açıklandığı bir metin içerdiğini doğrulanir.nihal


  @US22_TC03
  Scenario: US22_TC03
    When Kullanıcı web sitesine gidilir.nihal
    When Kullanıcı sayfanın alt kısmına gidilir.nihal
    When Customer Service bölümümdeki "Terms and Conditions"  bağlantısını tıklanir.nihal
    And Terms and Conditions"" sayfasın kullanıcının tüm koşulları ve şartları okuyabileceği net bir formatta olduğunu doğrulanir.nihal


