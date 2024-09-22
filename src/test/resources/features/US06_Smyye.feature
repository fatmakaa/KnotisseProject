Feature: US06
  @US06_TC01
  Scenario: US06_TC01
    When İlgili web siteye gidilir
    Then UPHOLSTERY kategori adinin gorundugunu dogrulanir

  @US06_TC02
  Scenario: US06_TC02
    When İlgili web siteye gidilir
    And UPHOLSTERY kategorisi tiklanir
    Then Acilan sayfada doseme  urunlerinin listelendigi test edilir

  @US06_TC04
  Scenario: US06_TC04
    When İlgili web siteye gidilir
    And UPHOLSTERY kategorisi tiklanir
    And Urun resimlerinin uzerindeki favori isaretine gelinir
    Then Favori isaretine gelindiginde ADD TO WISHLIST yazisinin goruldugu test edilir
