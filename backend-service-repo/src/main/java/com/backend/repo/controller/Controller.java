package com.backend.repo.controller;

import com.backend.api.api.ProductOneControllerApi;
import com.backend.api.dto.StudentListResponseDto;
import com.backend.api.dto.StudentRequestDto;
import com.backend.api.dto.StudentResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class Controller implements ProductOneControllerApi {
    @Override
    public ResponseEntity<Object> deleteStudentDetails(Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<List<StudentListResponseDto>> getStudentDetailsList() {
        return null;
    }

    @Override
    public ResponseEntity<StudentResponseDto> saveStudentInfo(StudentRequestDto studentRequestDto) {
        return null;
    }
}
