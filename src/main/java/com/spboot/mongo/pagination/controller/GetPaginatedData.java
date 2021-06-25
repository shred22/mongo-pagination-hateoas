package com.spboot.mongo.pagination.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.mongo.pagination.entity.BulkData;
import com.spboot.mongo.pagination.repository.BulkDataRepo;
import com.spboot.mongo.pagination.service.BulkDataService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class GetPaginatedData {

    private final BulkDataRepo bulkDataRepo;

    @GetMapping(path = "getPaged")
    public ResponseEntity<?> getBulkDataInPages(@RequestParam(defaultValue = "0") int page,
                                                 @RequestParam(defaultValue = "5") int size) {

        Pageable paging = PageRequest.of(page, size);
        Page<BulkData> bulkDataPage = bulkDataRepo.findAll(paging);

        List<BulkData> content = bulkDataPage.getContent();
        Map<String, Object> response = new HashMap<>();
        response.put("bulkData", content);
        response.put("currentPage", bulkDataPage.getNumber());
        response.put("totalItems", bulkDataPage.getTotalElements());
        response.put("totalPages", bulkDataPage.getTotalPages());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
