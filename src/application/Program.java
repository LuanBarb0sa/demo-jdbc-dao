package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, " Clothes and Shoes");
		Seller seller = new Seller(1, "LuanLucas", "luanlucas.r10@hotmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);

	}

}
