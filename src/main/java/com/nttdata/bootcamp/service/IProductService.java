package com.nttdata.bootcamp.service;

import com.nttdata.bootcamp.dto.Product;

public interface IProductService {

	Product getProduct(Integer id);

	Product postProduct(Integer id);


}
