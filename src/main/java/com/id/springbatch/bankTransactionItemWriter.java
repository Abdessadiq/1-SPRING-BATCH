package com.id.springbatch;

import com.id.springbatch.dao.BankTransaction;
import com.id.springbatch.dao.BankTransationRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class bankTransactionItemWriter implements ItemWriter<BankTransaction> {
    @Autowired
    private BankTransationRepository bankTransationRepository;
    @Override
    public void write(List<? extends BankTransaction> list) throws Exception {
        bankTransationRepository.saveAll(list);

    }
}
