package com.mycom.app.controller;

import com.mycom.app.dao.BoardDAO;
import com.mycom.app.dto.BoardDTO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SBoardTest {

    @Autowired
    private BoardDAO bDao;

    @Test
    public void testAllSelect() {

        System.out.println(bDao.selectAll());
    }

    @Test
    public void testInsert() {

        BoardDTO board = new BoardDTO(0, "fdssd", "djksljdklsjlksjlls", "111jh");

        bDao.insertBoard(board);
    }
}