package com.hust.kstn;

public class Aims {

	public static void main(String[] args) {
		//Tạo giỏ hàng mới
        Cart cart = new Cart();

        //Tạo dvd mới
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99);

        //Thêm dvd vào giỏ
        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.addDVD(dvd3);

        //In ra màn hình trạng thái hiện tại của giỏ
        System.out.println("--- CART BEFORE REMOVING ---");
        cart.print();

        //Loại bỏ một dvd khỏi giỏ
        cart.removeDVD(dvd2);

        //In ra màn hình trạng thái giỏ sau khi bỏ dvd
        System.out.println("\n--- CART AFTER REMOVING DVD2 ---");
        cart.print();

	}

}
