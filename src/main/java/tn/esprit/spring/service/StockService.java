package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Stock;
import tn.esprit.spring.entities.TypeStock;

public interface StockService {

	List<Stock> retrieveAllStocks();

	Stock addStock(Stock s);

	void deleteStock(Long idStock);

	Stock updateStock(Stock s);

	Stock retrieveStock(Long idStock);

	List<Stock> retrieveStockByName(String nameStock);



	List<Stock> retrieveByTypeStock(TypeStock TypeStock);

	void allocateProductToStock(Long idStock, int IdProduct);

	void orderProduct(int idProduct, int quantityStock);


	



}
