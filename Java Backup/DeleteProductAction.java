/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.actions;

import com.opensymphony.xwork2.ActionSupport;
import struts2.test.dao.Admin;

/**
 *
 * @author sommo
 */
public class DeleteProductAction extends ActionSupport {

    private int productId;
    private String msg1;
    Admin dao = new Admin();
    
    @Override
    public String execute() throws Exception {
        try {
            int isDeleted = dao.deleteProductDetails(getProductId());
            if (isDeleted > 0) {
                setMsg1("Record deleted successfully");
                System.out.println("Product Deleted");
            } else {
                setMsg1("Some error");
                System.out.println("Some error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "DELETEPRODUCT";
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the msg1
     */
    public String getMsg1() {
        return msg1;
    }

    /**
     * @param msg1 the msg1 to set
     */
    public void setMsg1(String msg1) {
        this.msg1 = msg1;
    }

}
