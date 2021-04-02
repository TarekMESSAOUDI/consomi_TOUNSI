package tn.esprit.spring.service;



import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Stock;
import tn.esprit.spring.entities.TypeStock;
import tn.esprit.spring.repository.StockRepository;


@Service
public class StockServiceImpl implements StockService {
	
	
	@Autowired
	StockRepository stockrepository ;
	/*@Autowired
	ProductRepository prooductrepository;*/
	
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
	
 /*
 /////////////////////////////////////a terminer//////////////
 @Override
	public void allocateStocktoProduct(Long idStock, Long IdProduct) {
		Product product = produitRepository.findById(IdProduct).get();
		Stock stock = stockrepository.findById(idStock).get();
		stock.setIdProduct(product);
		stockrepository.save(stock);
	}
*/
 
 
	
}
