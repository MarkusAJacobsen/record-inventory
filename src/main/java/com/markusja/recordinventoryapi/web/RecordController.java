package com.markusja.recordinventoryapi.web;

import com.markusja.recordinventoryapi.domain.Record;
import com.markusja.recordinventoryapi.domain.RecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.Collection;

@RestController
@RequestMapping("records")
public class RecordController {
    private final RecordService service;

    private Logger LOGGER = LoggerFactory.getLogger(RecordController.class);

    public RecordController(RecordService service) {
        this.service = service;
    }

    @GetMapping
    public Collection<Record> listRecords() {
        return service.listRecords();
    }

    @GetMapping("{recordId}")
    public Record getRecord(@PathVariable Integer recordId) {
        return service.getRecord(recordId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Record saveRecord(@Valid @RequestBody Record record) {
        LOGGER.info("Processing save record {}", record);
        return service.addRecord(record);
    }

    @PutMapping("{recordId}")
    public Record updateRecord(@RequestBody Record record, @PathVariable Integer recordId) {
        return service.updateRecord(recordId, record);
    }
}
