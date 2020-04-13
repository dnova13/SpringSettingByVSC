package com.mycom.app.dao;

import java.util.List;

import com.mycom.app.dto.BoardDTO;

public interface BoardDAO {

    public void insertBoard(BoardDTO board);
    public List<BoardDTO> selectAll();
}