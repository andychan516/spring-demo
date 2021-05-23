package andy.springdemo.test;

import andy.springdemo.model.Order;
import andy.springdemo.model.OrderDetail;
import andy.springdemo.util.ClassUtil;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setId(1);
        order.setName("order1");
        List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderid(1);
        orderDetail.setOrderPrice("1USD");
        orderDetail.setOrderSku("Sku1");

        orderDetailList.add(orderDetail);

        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setOrderid(1);
        orderDetail2.setOrderPrice("2USD");
        orderDetail2.setOrderSku("Sku2");
        orderDetailList.add(orderDetail2);

        try {
            HashMap addMap = new HashMap();
            HashMap addValMap = new HashMap();
            addMap.put("orderDetail", Class.forName("java.util.List"));
            addValMap.put("orderDetail", orderDetailList);
            Object obj2= new ClassUtil().dynamicClass(order,addMap,addValMap);
            Order newOrder=(Order) obj2;

            System.out.println(JSONObject.toJSONString(newOrder));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
