package andy.springdemo.model;

public class OrderDetail {
    private int orderid;
    private String orderPrice;
    private String orderSku;


    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderSku() {
        return orderSku;
    }

    public void setOrderSku(String orderSku) {
        this.orderSku = orderSku;
    }


}
