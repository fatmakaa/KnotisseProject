Feature: US28
  @US28_TC01
  Scenario: US28_TC01
    When İlgili web siteye gidilir.nihal
    When Home pagede scroll yapılarak aşağı inilir.nihal
    And Gerek scroll esnasında gerekse en alta inildiğinde geri dönme düğmesinin görünür olduğu doğrulanır.nihal

  @US28_TC02
  Scenario: US28_TC02
    When İlgili web siteye gidilir.nihal
    When Home page dışındaki sayfalar üzerinden scroll yapılarak aşağı inilir.nihal
    And  Gerek scroll esnasında gerekse en alta inildiğinde geri dönme düğmesinin görünür olduğu doğrulanır.nihal


  @US28_TC03
  Scenario: US28_TC03
    When Mobilden ilgili web siteye gidilir.nihal
    When Home pagede scroll yapılarak aşağı inilir.nihal
    And Gerek scroll esnasında gerekse en alta inildiğinde geri dönme düğmesinin görünür olduğu doğrulanır.nihal


  @US28_TC04
  Scenario: US28_TC04
    When Mobilden ilgili web siteye gidilir.nihal
    When Home page dışındaki sayfalar üzerinden scroll yapılarak aşağı inilir.nihal
    And  Gerek scroll esnasında gerekse en alta inildiğinde geri dönme düğmesinin görünür olduğu doğrulanır.nihal


  @US28_TC05
  Scenario: US28_TC05
    When İlgili web siteye gidilir.nihal
    When Herhangi bir sayfa üzerinden geri dönüş düğmesine tıklanır.nihal
    And Gerek scroll esnasında gerekse en alta inildiğinde geri dönme düğmesine tıklandığında otomatik olarak sayfanın en üst kısmına döndüğü doğrulanır.nihal



  @US28_TC06
  Scenario: US28_TC06
    When Mobilden ilgili web siteye gidilir.nihal
    When Herhangi bir sayfa üzerinden geri dönüş düğmesine tıklanır.nihal
    And Gerek scroll esnasında gerekse en alta inildiğinde geri dönme düğmesine tıklandığında otomatik olarak sayfanın en üst kısmına döndüğü doğrulanır.nihal