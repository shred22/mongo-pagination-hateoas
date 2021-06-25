package com.spboot.mongo.pagination;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spboot.mongo.pagination.entity.BulkData;
import com.spboot.mongo.pagination.service.BulkDataService;

@SpringBootApplication
public class MongoPaginationHateoasApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MongoPaginationHateoasApplication.class, args);
		/*List<BulkData> bulks = new ArrayList<>();
		for(int i=10; i < 35; i++) {
			BulkData bulkData =  BulkData.builder()
					.age(i)
					.name("Dave Fischer")
					.id(UUID.randomUUID().toString())
					.build();
			bulks.add(bulkData);
		}
		BulkDataService bulkDataService = context.getBean(BulkDataService.class);
		bulkDataService.saveBulks(bulks);*/

	}

}
