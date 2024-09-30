Feature: US04
  @US04_TC01
  Scenario: US04_TC01
    When İlgili web siteye gidilir.nihal
    And  PILLOWS kategori adinin gorundugunu dogrulanir.nihal

  @US04_TC02
  Scenario: US04_TC02
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    And  Acilan sayfada yastik urunlerinin listelendigini dogrulanir.nihal

  @US04_TC03
  Scenario: US04_TC03
    When İlgili web siteye gidilir.nihal
    And  PILLOWS kategorisinin diger kategorilerle ayni hiyerarsik duzeyde yer aldigini dogrulanir.nihal

  @US04_TC04
  Scenario: US04_TC04
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Urun resimlerinin uzerindeki favori isaretine gelinir.nihal
    And  Favori isaretine gelindiginde "ADD TO WISHLIST" yazisinin goruldugunu dogrulanir.nihal

  @US04_TC05
  Scenario: US04_TC05
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Urun resimlerinin uzerindeki favori isaretini tiklanirnihal
    And Favori isaretine tiklandigi zaman, urun "wishlist" e eklenebilinir.nihal

  @US04_TC06
  Scenario: US04_TC06
    When İlgili web siteye gidilir.
    When PILLOWS kategorisini tiklanir.
    And TEXTURED PILLOW COVERS ve FLOOR CUSHIONS bolumlerinin goründügü dogrulanir.

  @US04_TC07
  Scenario: US04_TC07
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    And  Results bolumunde sayfada kac ürün bulundugunun gorülebildigini dogrulanir.nihal


  @US04_TC08
  Scenario: US04_TC08
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    And  Sayfada yastik ürünlerinin yüksek çözünürlüklü görsellerinin bulundugunu dogrulanir.nihal

  @US04_TC09
  Scenario: US04_TC09
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    And  Sayfada yaastik ürünlerinin kısa açıklamalarınin bulundugunu dogrulanir.nihal

  @US04_TC10
  Scenario: US04_TC10
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Sayfada yastik ürünlerinin otomatik olarak Default sorting ozelliklerine gore filtrelendigini dogrulanir.nihal
    When Sort by popularity secilir.nihal
    When Ürünlerin popularity ozelliklerine gore filtrelendigini dogrulanir.nihal
    When Sort by avarega rating secilir.nihal
    When Ürünlerin avarega rating ozelliklerine gore filtrelendigini dogrulanir.nihal
    When Sort by latest secilir.nihal
    And  Ürünlerin latest ozelliklerine gore filtrelendigini dogrulanir.nihal

  @US04_TC11
  Scenario: US04_TC11
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanir.nihal
    And  Ürün detay sayfasinin acildigini dogrulanir.nihal

  @US04_TC12
  Scenario: US04_TC12
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    And  Ürün detay sayfasinda, ürünün yuksek cozunurluklu gorsellerinin oldugunu dogrulanir.nihal

  @US04_TC13
  Scenario: US04_TC13
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanir.nihal
    And  Ürün detay sayfasinda, urunun detaylı açıklaması oldugunu dogrulanir.nihal


  @US04_TC14
  Scenario: US04_TC14
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanir.nihal
    And  Ürün detay sayfasinda, urunun boyutları oldugunu dogrulanir.nihal

  @US04_TC15
  Scenario: US04_TC15
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    And  Ürün detay sayfasinda, urunun  malzeme bilgisi oldugunu dogrulanir.nihal

  @US04_TC16
  Scenario: US04_TC16
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Ürün detay sayfasinda NEW ARRIVALS bolumunun oldugunu dogrulanir.nihal
    When Ürün detay sayfasinda  PRODUCT CATEGORY bolumunun oldugunu dogrulanir.nihal
    When Ürün detay sayfasinda  PRODUCT SEARCH bolumunun oldugunu dogrulanir.nihal
     And Ürün detay sayfasinda FOLLOW US ON INSTAGRAM bolumunun oldugunu dogrulanir.nihal


  @US04_TC17
  Scenario: US04_TC17
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanir.nihal
    And  Ürun detay sayfasinda ADD to QUOTE LIST butonunun oldugunu dogrulanir.nihal


  @US04_TC18
  Scenario: US04_TC18
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanir.nihal
    And  Ürün detay sayfasinda ADD to QUOTE LIST butonunun tiklanabilir oldugunu dogrulanir.nihal

  @US04_TC19
  Scenario: US04_TC19
    When İlgili web siteye gidilir.
    When PILLOWS kategorisini tiklanir.
    When Acilan sayfadaki urunlerden birini tiklanir.
    And  Ürün detay sayfasinda ADD to QUOTE LIST butonu tiklandiginda View Quote List butonunun goruldugunu dogrulanir

  @US04_TC20
  Scenario: US04_TC20
    When İlgili web siteye gidilir.nihal
    When Login ile giris yapilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanir.nihal
    When Ürün detay sayfasinda ADD to QUOTE LIST butonunu tiklanir.nihal
    And  Butona tıklandığında, seçilen ürünun teklif listesine eklendigi ve listenin güncellendigini dogrulanir.


  @US04_TC21
  Scenario: US04_TC21
    When İlgili web siteye gidilir.nihal
    Then View Quote List butonunun gorundugunu dogrulanirnihal
  Then View Quote List butonunu tiklanirnihal
  Then "View Quote List" butonuna tiklandiginda, kayitli kullanicinin sepetindeki ürünleri görüntüleyebildigini dogrulanirnihal
  Then "View Quote List" butonuna tiklandiginda, kayitli kullanicinin sepetindeki ürünlerin miktarını değiştirebildigini dogrulanirnihal
  And "View Quote List" butonuna tiklandiginda, kayitli kullanicinin sepetindeki ürünleri silebildigini dogrulanirnihal


  @US04_TC22
  Scenario: US04_TC22
    When İlgili web siteye gidilir.nihal
    Then  Ürün detay sayfasinda Description bolumunun oldugunu dogrulanirnihal
  Then Urun detay sayfasinda  Additional information bolumunun oldugunu dogrulanirnihal
  And Urun detay sayfasinda  BROWSE SIMILAR bolumunun oldugunu dogrulanirnihal





  @US04_TC23
  Scenario: US04_TC23
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisinin uzerine gelinirnihal
  When  Acilir menude TEXTURED PILLOW COVERS 'i tiklanirnihal
  And Acilir menude TEXTURED PILLOW COVERS  tiklandiginda ilgili urunlerin gorundugunu dogrulanirnihal




  @US04_TC24
  Scenario: US04_TC24
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisinin uzerine gelinirnihal
   Then Acilir menude FLOOR CUSHIONS 'i tiklanirnihal
  And Acilir menude FLOOR CUSHIONS  tiklandiginda ilgili urunlerin gorundugunu dogrulanirnihal




  @US04_TC25
  Scenario: US04_TC25
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanirnihal
  Then Acilan sayfada TEXTURED PILLOW COVERS linkini tiklanirnihal
  And TEXTURED PILLOW COVERS  tiklandiginda ilgili urunlerin gorundugunu dogrulanirnihal



  @US04_TC26
  Scenario: US04_TC26
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanirnihal
 Then Acilan sayfada FLOOR CUSHIONS linkini tiklanirnihal
 And FLOOR CUSHIONS  tiklandiginda ilgili urunlerin gorundugunu dogrulanirnihal



  @US04_TC27
  Scenario: US04_TC27
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfada TEXTURED PILLOW COVERS linkini tiklanirnihal
  When THROW PILLOWS linkini tiklanirnihal
  And TEXTURED PILLOW COVERS sayfasindayken THROW PILLOWS linki tiklandiginda PILLOWS sayfasina geri donuldugunu dogrulanirnihal


  @US04_TC28
  Scenario: US04_TC28
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfada FLOOR CUSHIONS linkini tiklanirnihal
 Then THROW PILLOWS linkini tiklanirnihal
  And FLOOR CUSHIONS sayfasindayken THROW PILLOWS linki tiklandiginda PILLOWS sayfasina geri donuldugunu dogrulanirnihal


  @US04_TC29
  Scenario: US04_TC29
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When HOME linkini tiklanirnihal
  And PILLOWS sayfasindayken HOME linki tiklandiginda Homepage sayfasina geri donuldugunu dogrulanirnihal



  @US04_TC30
  Scenario: US04_TC30
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanirnihal
  And Urünün detay sayfasında " Add to wishlist" butonunun bulundugunu dogrulanirnihal



  @US04_TC31
  Scenario: US04_TC31
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfada " Add to wishlist" butonunun oldugu urunlerden birini tiklanirnihal
  Then "Add to wishlist" butonunu tiklanirnihal
  Then Browse wishlist linkinin gorundugunu dogrulanirnihal
  Then Browse wishlist linkini tiklanirnihal
  Then My wishlist seçilen ürünun sepete eklendigini dogrulanirnihal
  And My wishlist'in  güncellendigini dogrulanirnihal

  @US04_TC32
  Scenario: US04_TC32
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanirnihal
  Then Slider arrowu (sag ok)  tiklanirnihalnihal
  And Bir sonraki urune gidildigini dogrulanir

  @US04_TC33
  Scenario: US04_TC33
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanirnihal
  Then Slider arrowu (sol ok)  tiklanirnihal
  And Bir onceki urune gidildigini dogrulanirnihal


  @US04_TC34
  Scenario: US04_TC34
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanirnihal
  Then Resmin uzerindeki zoom u  tiklanirnihal
 And Resmin boyutunun buyudugunu dogrulanirnihal

  @US04_TC35
  Scenario: US04_TC35
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanirnihal
  Then Resmin uzerindeki Slider arrowu (sol ok)  tiklanirnihal
  And Bir onceki resme gidildigini dogrulanirnihal


  @US04_TC36
  Scenario: US04_TC17
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Acilan sayfadaki urunlerden birini tiklanirnihal
  Then Resmin uzerindeki Slider arrowu (sag ok)  tiklanirnihal
  And Bir sonraki resme gidildigini dogrulanirnihal

  @US04_TC37
  Scenario: US04_TC17
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When FILTER linkini tiklanirnihal
  And Kullanicinin FILTER bolumune erisebildigini dogrulanirnihal


  @US04_TC38
  Scenario: US04_TC17
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Urun resimlerinden birinin uzerine gelinir.nihal
  And "QUICK VIEW" yazisinin gorundugunu  dogrulanir.nihal


  @US04_TC39
  Scenario: US04_TC17
    When İlgili web siteye gidilir.nihal
    When PILLOWS kategorisini tiklanir.nihal
    When Urun resimlerinden birinin uzerine gelinir.nihal
    Then  "QUICK VIEW" yazisini tiklanir.nihal
  And  "QUICK VIEW" yazisi tiklandiginda acilan pencerede urun bilgilerinin gorundugunu dogrulanir.nihal





