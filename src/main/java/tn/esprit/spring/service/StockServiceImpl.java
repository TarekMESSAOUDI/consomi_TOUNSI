package tn.esprit.spring.service;



import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Department;
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.entities.Stock;
import tn.esprit.spring.entities.TypeStock;
import tn.esprit.spring.repository.DepartmentRepository;
import tn.esprit.spring.repository.ProductRepository;
import tn.esprit.spring.repository.StockRepository;


@Service
public class StockServiceImpl implements StockService {
	
	
	@Autowired
	StockRepository stockrepository ;
	
	@Autowired
	ProductRepository pr ;
	
	
	private static final Logger L = LogManager.getLogger(StockServiceImpl.class);
	
	
	@Override
	public List<Stock> retrieveAllStocks() {
		List<Stock> stocks =(List<Stock>) stockrepository.findAll() ;
		for (Stock stock : stocks){
			L.info("stock +++ :" + stock);
		}
		return stocks;
	
	}
	
	
	@Override
	public Stock addStock(Stock s) {
		return stockrepository.save(s);
	}
	
	@Override
	public void deleteStock(Long idStock) {
		stockrepository.deleteById(idStock);
	}
	
	
	@Override
public Stock updateStock(Stock s) {
		
		return stockrepository.save(s);
	}
	
	
	@Override
	public Stock retrieveStock(Long idStock) {
		// TODO Auto-generated method stub
		return stockrepository.findById(idStock).get();
	}
	
	
	
	@Override
	public List<Stock> retrieveStockByName(String nameStock){
		return stockrepository.findByName(nameStock);
	}
	
	
	
	
 @Override                                                         
	public List<Stock> retrieveByTypeStock(TypeStock TypeStock){
		return stockrepository.findByTypeStock(TypeStock);	
	}
	
 
 
 
 @Override
 public void allocateProductToStock(Long idStock, int IdProduct) {
 Product product = pr.findById(IdProduct).get();
 Stock stock = stockrepository.findById(idStock).get();
 product.setStock(stock);
 pr.save(product);
	
}
 
 
 
 public void orderProduct(int idProduct,int quantityStock) {
		Product p = pr.findById(idProduct).get();
		
		p.getStock().setQuantityStock(quantityStock+p.getStock().getQuantityStock());
		pr.save(p);
	}
 
 
 
 
 
 
 
}