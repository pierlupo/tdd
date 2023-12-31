package org.example.exercice5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShopTest {

    private Shop shop;

    private Product product;

    @BeforeEach
    void setUp(){
        shop = new Shop();
    }
    @Test
    void testUpdateShouldDecreaseQuality() throws QualityException {
        //Arrange
        product = Product.builder().quality(10).sellin(10).name("p1").type("c1").build();
        //Act
        shop.update(product);

        Assertions.assertEquals(9, product.getQuality());
    }

    @Test
    void testUpdateShouldDecreaseSellIn() throws QualityException {
        //Arrange
        product = Product.builder().quality(10).sellin(10).name("p1").type("c1").build();
        //Act
        shop.update(product);

        Assertions.assertEquals(9, product.getSellin());
    }
    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenSellInIs0() throws QualityException {
        //Arrange
        product = Product.builder().quality(10).sellin(0).name("p1").type("c1").build();
        //Act
        shop.update(product);

        Assertions.assertEquals(8, product.getQuality());
    }
    @Test
    void testUpdateShouldRaiseQualityExceptionWhenQualityIsNeg() throws QualityException {
        //Arrange
        product = Product.builder().quality(-10).sellin(0).name("p1").type("c1").build();
        //Act
        Assertions.assertThrowsExactly(QualityException.class, ()->{
            shop.update(product);
        });
    }
    @Test
    void testUpdateShouldRaiseQualityExceptionWhenQualityIsAbove50() throws QualityException {
        //Arrange
        product = Product.builder().quality(50).sellin(0).name("p1").type("c1").build();
        //Act
        Assertions.assertThrowsExactly(QualityException.class, ()->{
            shop.update(product);
        });
    }
    @Test
    void testUpdateShouldIncreaseQualityWhenProductIsBrie() throws QualityException {
        //Arrange
        product = Product.builder().quality(10).sellin(10).name("brie vieilli").type("laitier").build();
        //Act
        shop.update(product);
        Assertions.assertEquals(11, product.getQuality());
    }
    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenProductTypeIsLaitier() throws QualityException {
        //Arrange
        product = Product.builder().quality(10).sellin(10).name("p1").type("laitier").build();
        //Act
        shop.update(product);
        Assertions.assertEquals(8, product.getQuality());
    }
    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenProductTypeIsLaitierAndSellInIs0() throws QualityException {
        //Arrange
        product = Product.builder().quality(10).sellin(0).name("p1").type("laitier").build();
        //Act
        shop.update(product);
        Assertions.assertEquals(6, product.getQuality());
    }
    @Test
    void testUpdateQualityShouldBe0WhenProductIsLaitierAndSellIs0() throws QualityException {
        //Arrange
        product = Product.builder().quality(3).sellin(0).name("p1").type("laitier").build();
        //Act
        shop.update(product);
        Assertions.assertEquals(0   , product.getQuality());
    }
    @Test
    void testUpdateQualityShouldBe0WhenQualityIs2AndSellIs0() throws QualityException {
        //Arrange
        product = Product.builder().quality(2).sellin(0).name("p1").type("c1").build();
        shop.update(product);
        //Act
        Assertions.assertEquals(0   , product.getQuality());
    }
}
