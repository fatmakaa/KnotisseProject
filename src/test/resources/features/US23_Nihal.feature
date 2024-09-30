Feature: US23
  @US23_TC01
  Scenario: US23_TC01
    When Kullanıcı web sitesine gidilir.nihal
    When Kullanıcı sayfanın alt kısmına gidilir.nihal
    And  Customer Service bölümümdeki "Support"bağlantısını tıklanir.nihal


  @US23_TC02
  Scenario: US23_TC02
    When Kullanıcı web sitesine gidilir.nihal
    When Kullanıcı sayfanın alt kısmına gidilir.nihal
    When Customer Service bölümümdeki "Support"bağlantısını tıklanir.nihal
    And "Support" bağlatısının kullaıcı müşteri destek sayfasına yönlendirdiğini doğrulanir.nihal


  @US23_TC03
  Scenario: US23_TC03
    When Kullanıcı web sitesine gidilir.nihal
    When Kullanıcı sayfanın alt kısmına gidilir.nihal
    When Customer Service bölümümdeki "Support"bağlantısını tıklanir.nihal
    When Name alanına geçerli bir isim ve soyisim bilgisi girilir.nihal
    When Email alanına geçerli bir email adresi yazilir.nihal
    When Phone alanına geçerli bir telefon numarası yazilir.nihal
    When Messsage alanına iletmek istediği mesajını yazilir.nihal
    When GDPR Agreement onay kutusunu  tıklanir.
    When Kullanıcı submit butonuna tıklanir.
    And Kullanıcı "Bizimle iletişime geçtiğiniz için teşekkür ederiz!" mesajı görünür.


  @US23_TC04
  Scenario: US23_TC04
    When Kullanıcı web sitesine gidilir.nihal
    When Kullanıcı sayfanın alt kısmına gidilir.nihal
    When Customer Service bölümümdeki "Support"bağlantısını tıklanir.nihal
    When Name alanı boş bırakılir.nihal
    When Kullanıcı submit butonuna tıklanir.nihal
    And Name alanın altında "This field is required" mesajını görünür.nihal




  @US23_TC05
  Scenario: US23_TC05
    When Kullanıcı web sitesine gidilir.
    When Kullanıcı sayfanın alt kısmına gidilir.
    When Customer Service bölümümdeki "Support"bağlantısını tıklanir.
    When Email alanı boş bırakılir.
    When Kullanıcı submit butonuna tıklanir.
    And Email alanın altında "This field is required" mesajını görünür.


  @US23_TC06
  Scenario: US23_TC06
    When Kullanıcı web sitesine gider.nihal
    When Kullanıcı sayfanın alt kısmına gider.nihal
    When Customer Service bölümümdeki "Support"bağlantısını tıklar.nihal
    When Name alanına geçerli bir isim ve soyisim bilgisi girer.nihal
    When Email alanına geçerli bir email adresi yazar.nihal
    When GDPR Agreement onay kutusunu tıklamaz.nihal
    When Kullanıcı submit butonuna tıklar.nihal
    And  Name alanın altında "This field is required" mesajını görür.nihal
