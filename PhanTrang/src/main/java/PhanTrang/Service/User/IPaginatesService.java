package PhanTrang.Service.User;

import javax.annotation.Resource;

import PhanTrang.Dto.PaginatesDto;

@Resource
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates(Integer totalData, Integer limit, Integer currentPage);
}
