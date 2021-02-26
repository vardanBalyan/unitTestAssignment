
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    private Order orderObject;      //creating a variable of class Order type

    OrderTest(){
        /*
         * using constructor to create object of Object class*/
        orderObject = new Order();
    }

    /*
     * Method to test getQuantity() of Order class*/
    @Test
    void getQuantityTest()
    {
        final int QUANTITY = 4;
        /*
        * Using the setQuantity() to set the value of quantity of Order class*/
        //given
        orderObject.setQuantity(QUANTITY);
        /*
        * using the getQuantity() method to and test if the returned value
        * of quantity is equals to value we passed in setQuantity()*/
        //when
        int quantity = orderObject.getQuantity();
        /*
        * using assertTrue() to check if passed value and the returned values
        * both are equal*/
        //then
        assertEquals(quantity, QUANTITY);
    }

    /*
     * Method to test setQuantity() of Order class*/
    @Test
    void setQuantityTest()
    {
        /*
        * setQuantity() method of Order class returns object of the Order class
        *
        * We're using the variable of Order class type to store the object returned
        * by the setQuantity() method*/
        //when
        Order returnedOrderObject = orderObject.setQuantity(5);
        /*
        * using the assertEquals() to check if the returned object (i.e. returnedOrderObject)
        * is equal to the Order class object (i.e. orderObject)
        * which we used to call the setQuantity()*/
        //then
        assertEquals(returnedOrderObject,orderObject);
    }

    /*
     * Method to test getItemName() of Order class*/
    @Test
    void getItemNameTest()
    {
        final String ITEM_NAME = "Printer";
        /*
         * Using the setItemName() to set the value of itemName of Order class*/
        //given
        orderObject.setItemName(ITEM_NAME);
        /*
         * using the getItemName() method to and test if the returned value
         * of itemName is equals to value we passed in setItemName()*/
        //when
        String itemName = orderObject.getItemName();
        /*
         * using assertTrue() to check if passed value and the returned values
         * both are equal*/
        //then
        assertEquals(itemName, ITEM_NAME);
    }

    /*
     * Method to test setItemName() of Order class*/
    @Test
    void setItemNameTest()
    {
        /*
         * setItemName() method of Order class returns object of the Order class
         *
         * We're using the variable of Order class type to store the object returned
         * by the setItemName() method*/
        //when
        Order returnedOrderObject = orderObject.setItemName("mouse");
        /*
         * using the assertEquals() to check if the returned object (i.e. returnedOrderObject)
         * is equal to the Order class object (i.e. orderObject)
         * which we used to call the setItemName()*/
        //then
        assertEquals(returnedOrderObject,orderObject);
    }

    /*
     * Method to test getPrice() of Order class*/
    @Test
    void getPriceTest()
    {
        final double PRICE = 3000.10;
        /*
         * Using the setPrice() to set the value of price of Order class*/
        //given
        orderObject.setPrice(PRICE);
        /*
         * using the getPrice() method to and test if the returned value
         * of price is equals to value we passed in setPrice()*/
        //when
        double price = orderObject.getPrice();
        /*
         * using assertTrue() to check if passed value and the returned values
         * both are equal*/
        //then
        assertEquals(price, PRICE);
    }

    /*
     * Method to test setPrice() of Order class*/
    @Test
    void setPriceTest()
    {
        /*
         * setPrice() method of Order class returns object of the Order class
         *
         * We're using the variable of Order class type to store the object returned
         * by the setPrice() method*/
        //when
        Order returnedOrderObject = orderObject.setPrice(754.34);
        /*
         * using the assertEquals() to check if the returned object (i.e. returnedOrderObject)
         * is equal to the Order class object (i.e. orderObject)
         * which we used to call the setPrice()*/
        //then
        assertEquals(returnedOrderObject,orderObject);
    }

    /*
     * Method to test getPriceWithTex() of Order class*/
    @Test
    void getPriceWithTexTest()
    {
        final double PRICE_WITH_TEX = 632.45;
        /*
         * Using the setPriceWithTex() to set the value of priceWithTex of Order class*/
        //given
        orderObject.setPriceWithTex(PRICE_WITH_TEX);
        /*
         * using the getPriceWithTex() method to and test if the returned value
         * of priceWithTex is equals to value we passed in setPriceWithTex()*/
        //when
        double priceWithTex = orderObject.getPriceWithTex();
        /*
         * using assertTrue() to check if passed value and the returned values
         * both are equal*/
        //then
        assertEquals(priceWithTex, PRICE_WITH_TEX);
    }

    /*
     * Method to test setPriceWithTex() of Order class*/
    @Test
    void setPriceWithTexTest()
    {
        /*
         * setPriceWithTex() method of Order class returns object of the Order class
         *
         * We're using the variable of Order class type to store the object returned
         * by the setPriceWithTex() method*/
        //when
        Order returnedOrderObject = orderObject.setPriceWithTex(3652.21);
        /*
         * using the assertEquals() to check if the returned object (i.e. returnedOrderObject)
         * is equal to the Order class object (i.e. orderObject)
         * which we used to call the setPriceWithTex()*/
        //then
        assertEquals(returnedOrderObject,orderObject);
    }
}
