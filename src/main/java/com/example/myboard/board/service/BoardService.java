package com.example.myboard.board.service;

import com.example.myboard.board.db.BoardEntity;
import com.example.myboard.board.db.BoardRepository;
import com.example.myboard.board.model.BoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepositoy;

    public BoardEntity create(BoardRequest boardRequest) {
        var entity = BoardEntity.builder()
                    .boardName(boardRequest.getBoardName())
                    .status("REGISTERED")
                    .build();

        return boardRepositoy.save();
    }
}
