package com.sunyanxiong.po;

/**
 * Description: 订单明细
 * <p>
 * Created by daxiongit on 2016/5/12 0012.
 */
public class Orderdetail {

    private int id;
    private int orders_id;
    private int items_id;
    private int items_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public int getItems_num() {
        return items_num;
    }

    public void setItems_num(int items_num) {
        this.items_num = items_num;
    }

    @Override
    public String toString() {
        return "Orderdetail{" +
                "id=" + id +
                ", orders_id=" + orders_id +
                ", items_id=" + items_id +
                ", items_num=" + items_num +
                '}';
    }
}
