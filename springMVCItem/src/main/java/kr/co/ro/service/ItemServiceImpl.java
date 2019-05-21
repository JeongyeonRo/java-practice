package kr.co.ro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ro.dao.ItemDao;
import kr.co.ro.domain.Item;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;

	@Override
	public List<Item> allItem() {
		return itemDao.allItem();
	}
}
