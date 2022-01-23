/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.dao;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import struts2.test.beans.Product;
import struts2.test.beans.User;

/**
 *
 * @author sommo
 */
public class AdminTest {
    
    public AdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of registerUser method, of class Admin.
     */
    @Test
    public void testRegisterUser() throws Exception {
        System.out.println("registerUser");
        String userName = "testUser";
        String password = "test123";
        String firstName = "Test";
        String lastName = "User";
        String email = "testuser123@gmail.com";
        String phoneNumber = "1234567890";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.registerUser(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of registerProduct method, of class Admin.
     */
    @Test
    public void testRegisterProduct() throws Exception {
        System.out.println("registerProduct");
        int productId = 50;
        String productName = "testProd";
        String productMake = "testMake";
        double price = 123.6;
        int availability = 100;
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.registerProduct(productId, productName, productMake, price, availability);
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of report method, of class Admin.
//     */
    @Test
    public void testReport() throws Exception {
        System.out.println("report");
        Admin instance = new Admin();
        List result = instance.report();
        assertNotNull(result);
    }
//
//    /**
//     * Test of productreport method, of class Admin.
//     */
    @Test
    public void testProductreport() throws Exception {
        System.out.println("productreport");
        Admin instance = new Admin();
        List result = instance.productreport();
        assertNotNull(result);
    }
//
//    /**
//     * Test of fetchUserDetails method, of class Admin.
//     */
    @Test
    public void testFetchUserDetails() throws Exception {
        System.out.println("fetchUserDetails");
        String userName = "sommo123";
        Admin instance = new Admin();
        User result = instance.fetchUserDetails(userName);
        assertNotNull(result);
    }
//
//    /**
//     * Test of fetchProductDetails method, of class Admin.
//     */
    @Test
    public void testFetchProductDetails() throws Exception {
        System.out.println("fetchProductDetails");
        int productId = 5;
        Admin instance = new Admin();
        Product result = instance.fetchProductDetails(productId);
        assertNotNull(result);
    }
//
//    /**
//     * Test of updateUserDetails method, of class Admin.
//     */
    @Test
    public void testUpdateUserDetails() throws Exception {
        System.out.println("updateUserDetails");
        String userName = "testUser";
        String password = "123test";
        String firstName = "Test";
        String lastName = "User";
        String email = "testuser11@gmail.com";
        String phoneNumber = "1234567890";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.updateUserDetails(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of updateProductDetails method, of class Admin.
//     */
    @Test
    public void testUpdateProductDetails() throws Exception {
        System.out.println("updateProductDetails");
        int productId = 50;
        String productName = "testProd";
        String productMake = "testMake";
        double price = 321.5;
        int availability = 30;
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.updateProductDetails(productId, productName, productMake, price, availability);
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of deleteUserDetails method, of class Admin.
//     */
    @Test
    public void testDeleteUserDetails() throws Exception {
        System.out.println("deleteUserDetails");
        String userName = "testUser";
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.deleteUserDetails(userName);
        assertEquals(expResult, result);
    }
//
//    /**
//     * Test of deleteProductDetails method, of class Admin.
//     */
    @Test
    public void testDeleteProductDetails() throws Exception {
        System.out.println("deleteProductDetails");
        int productId = 50;
        Admin instance = new Admin();
        int expResult = 1;
        int result = instance.deleteProductDetails(productId);
        assertEquals(expResult, result);
    }
    
}
