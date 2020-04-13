package com.mycom.app.service;

import java.util.List;

import com.mycom.app.dto.BoardDTO;

import org.springframework.stereotype.Service;

@Service
public interface BoardService {

    public List<BoardDTO> getBoardList();
    public void creatBoard();

}