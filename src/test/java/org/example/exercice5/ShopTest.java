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
    void testUpdateShouldDecreaseQuality(){
    //Arrange
    product = Product.builder().quality(10).sellin(10).name("p1").type("c1").build();
    //Act
    shop.update(product);
    Assertions.assertEquals(9, product.getSellin());
    }
    @Test
    void testUpdateShouldDecreaseQualityTwiceAsMuchWhenSellinIs0(){
        //Arrange
        product = Product.builder().quality(10).sellin(0).name("p1").type("c1").build();
        //Act
        shop.update(product);
        Assertions.assertEquals(9, product.getQuality());
    }
    @Test
    void testUpdateShouldRaiseQualityExceptionWhenQualityIsNeg(){
        //Arrange
        product = Product.builder().quality(-10).sellin(0).name("p1").type("c1").build();
        //Act
        shop.update(product);
        Assertions.assertThrowsExactly(QualityException.class, ()->{
            shop.update(product);
        });
    }
    @Test
    void testUpdateShouldRaiseQualityExceptionWhenQualityIsAbove50(){
        //Arrange
        product = Product.builder().quality(50).sellin(0).name("p1").type("c1").build();
        //Act
        shop.update(product);
        Assertions.assertThrowsExactly(QualityException.class, ()->{
            shop.update(product);
        });
    }
    @Test
    void testUpdateShouldIncreaseQualityWhenProductIsBrie(){
        //Arrange
        product = Product.builder().quality(10).sellin(0).name("p1").type("c1").build();
        //Act
        shop.update(product);
        Assertions.assertEquals(11, product.getQuality());
    }
    @Test
    void testUpdateShouldDecreaseQualityTwiceWhenProductTypeIsLaitier(){
        //Arrange
        product = Product.builder().quality(10).sellin(0).name("p1").type("laitier").build();
        //Act
        shop.update(product);
        Assertions.assertEquals(8, product.getQuality());
    }
}
