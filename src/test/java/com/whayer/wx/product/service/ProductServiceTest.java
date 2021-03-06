package com.whayer.wx.product.service;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.whayer.wx.base.UnitTestBase;
import com.whayer.wx.common.X;
import com.whayer.wx.product.vo.Product;

@RunWith(BlockJUnit4ClassRunner.class)
public class ProductServiceTest extends UnitTestBase{

	public ProductServiceTest() {
		super("classpath:IOC.xml");
	}
	
	@Test
	public void testSaveProduct() {
		ProductService productService = super.getBean("productServiceImpl");
		
		Product product = new Product();
		product.setId(UUID.randomUUID().toString());
		product.setImgUrl("/user/xxx/4.jpg");
		product.setName("产品D");
		product.setPrice(new BigDecimal(30.52));
		product.setDescription("产品D的描述......");
		
		int id = productService.saveProduct(product);
		System.out.println(id);
	}
	
	@Test
	public void testGetProductById() {
		ProductService productService = super.getBean("productServiceImpl");
		String id = "7e8779bb-5a0e-4197-9a68-db2be52fb51a";
		Product product = productService.getProductById(id);
		System.out.println(product.toString());
	}
	
	@Test
	public void testDeleteProductById() {
		ProductService productService = super.getBean("productServiceImpl");
		String id = "001";
		int i = productService.deleteProductById(id);
		System.out.println(i);
	}
	
	@Test
	public void testCreateRows(){
		ProductService productService = super.getBean("productServiceImpl");
		for(int i = 1; i <= 16; i++){
			Product p = new Product();
			p.setId(X.uuidPure());
			p.setImgUrl("/image/icon_"+ i +".jpg");
			p.setName("产品" + i + "~");
			p.setPrice(new BigDecimal(100.55 + i*6));
			p.setDescription("产品"+ i +"的描述......");
			productService.saveProduct(p);
		}
	}
	
//	@Test
//	public void testAssociate(){
//		ProductService productService = super.getBean("productServiceImpl");
//		String[] ids = {"6F8F18D75BB84833BBC54DE379CC5F55",
//					   "751DE588D623498697C95AD4A43260AF",
//					   "7B4E90DBB8E2496E80C82E9A6BFD9D75",
//					   "833D9FEF7E544DCA972A6E5A13366252"};
//		String role = "pQ8wQqDt";
//		
//		int count = productService.associate(role, ids);
//		System.out.println(count);
//	}

}
