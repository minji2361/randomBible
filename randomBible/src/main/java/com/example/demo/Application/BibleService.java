package com.example.demo.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Service
public class BibleService {	
	@Autowired
	BibleMapper mapper;
	
	@Autowired
	PlatformTransactionManager manager;
	
	public BibleModel bibleVerse() {
		
//		TransactionStatus status = 
//				manager.getTransaction(new DefaultTransactionDefinition());
		BibleModel model = null;
		try {
			model = mapper.ranContent();
			int book = model.getBook();
			String name = mapper.getChapterName(book);
			model.setBookName(name);
			//manager.commit(status);
			//manager.rollback(status);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return model;
	}
}
