/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vetri
 */
package pojo;
public class PojoClass {
    String customerName,productName,orderId,modelNumber,type;
    public void setCustomerName(String customer)
    {
        customerName=customer;
    }
    public void setProductName(String nameOfTheProduct)
    {
        productName=nameOfTheProduct;
    }
    public void setOrderId(String orderNumber)
    {
        orderId=orderNumber;
    }
    public void setModelNumber(String model)
    {
        modelNumber=model;
    }
    public void setProductType(String productType)
    {
        type=productType;
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Custmername:");
        sb.append(customerName);
        sb.append("\n");
        sb.append("Productname:");
        sb.append(productName);
        sb.append("\n");
        sb.append("OrderId:");
        sb.append(orderId);
        sb.append("\n");
        sb.append("ModelNumber:");
        sb.append(modelNumber);
        sb.append("\n");
        sb.append("Typeoftheproduct:");
        sb.append(type);
        return sb.toString();
    }
}
