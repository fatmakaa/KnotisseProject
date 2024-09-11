Feature: US01
  @US01_TC01
  Scenario: US01_TC01
    When İlgili web siteye gidilir.
    Then  Home page üzerinden "Catalogue" menüsüne tıklanır.
    Then İlgili ürünlerin listelendiği doğrulanır.
    Then Alternatif olarak, başka bir sayfa üzerinden (örn. new arrivals sayfası) "Catalogue" menüsüne tıklanır.
     And İlgili ürünlerin listelendiği doğrulanır.

