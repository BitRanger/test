package com.bitranger.example.dao;

import java.util.List;

import com.bitranger.example.model.PSTag;

public interface IDAOTag {

	public int				save(PSTag tag);
	public List<PSTag> 		getAll();
	
}
