package com.news.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.news.dto.NewDTO;

public interface INewService {
	List<NewDTO> findAll(Pageable pageable);
	int getTotalItem();
	NewDTO findById(long id);
//	NewDTO insert(NewDTO dto);
//	NewDTO update(NewDTO dto);
	NewDTO save(NewDTO dto);
	void delete(long[] ids);
}
