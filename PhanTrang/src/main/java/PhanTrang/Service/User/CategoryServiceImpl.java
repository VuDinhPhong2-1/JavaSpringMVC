package PhanTrang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PhanTrang.Dao.ProductsDao;
import PhanTrang.Dto.ProductsDto;

@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private ProductsDao productsDao;
	
	public List<ProductsDto> GetAllProductsByID(int id) {
		return productsDao.GetAllProductsByID(id);
	}
	
	public List<ProductsDto> GetDataProductsPaginate(int start, int end) {
		return productsDao.GetDataProductsPaginates(start, end);
	}

}
