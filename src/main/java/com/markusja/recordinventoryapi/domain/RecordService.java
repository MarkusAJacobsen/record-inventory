package com.markusja.recordinventoryapi.domain;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class RecordService {

    private final RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public Record getRecord(Integer recordId) {
        Optional<Record> record =  recordRepository.findById(recordId);

        if (record.isPresent()) {
            return record.get();
        }
        return null;
    }

    public Collection<Record> listRecords() {
        return recordRepository.findAll();
    }

    public Record addRecord(Record record) {
        return recordRepository.save(record);
    }

    public Record updateRecord(Integer recordId, Record record) {
        return recordRepository.findById(recordId)
                .map(existingRecord -> {
                    var recordToUpdate = new Record(
                            existingRecord.getId(),
                            record.getTitle(),
                            record.getArtist(),
                            record.getLabel(),
                            record.getCountry(),
                            record.getYear(),
                            record.getFormat(),
                            record.getGenre(),
                            record.getNrOfTracks(),
                            record.getQuantity(),
                            existingRecord.getVersion()
                    );

                    return recordRepository.save(recordToUpdate);
                })
                .orElseGet(() -> addRecord(record));
    }
}
