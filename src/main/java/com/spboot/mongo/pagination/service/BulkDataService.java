package com.spboot.mongo.pagination.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spboot.mongo.pagination.entity.BulkData;
import com.spboot.mongo.pagination.repository.BulkDataRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BulkDataService {

    private final BulkDataRepo repository;

    public void saveBulks(List<BulkData> bulks) {
        for(BulkData bulkData : bulks) {
            repository.save(bulkData);
        }
    }
}
