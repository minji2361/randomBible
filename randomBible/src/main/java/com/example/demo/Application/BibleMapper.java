package com.example.demo.Application;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BibleMapper {
	
	// 번호, 장, 절, 성구 불러오기
	public BibleModel ranContent();
	
	// 본문 이름 불러오기
	public String getChapterName(int book);

}
