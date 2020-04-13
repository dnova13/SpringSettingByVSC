package com.mycom.app.service;

import java.util.List;

import com.mycom.app.dao.BoardDAO;
import com.mycom.app.dto.BoardDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO bDAO;

    @Override
    public void creatBoard() {
        // TODO Auto-generated method stub
    }

    @Override
    public List<BoardDTO> getBoardList() {
        
        return bDAO.selectAll();
    }
}