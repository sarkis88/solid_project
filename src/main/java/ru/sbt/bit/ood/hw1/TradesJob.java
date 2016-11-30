package ru.sbt.bit.ood.hw1;

import java.util.Collection;

public class TradesJob {

    private final TradesDAO tradesDAO;

    public TradesJob(TradesDAO tradesDAO) {
        this.tradesDAO = tradesDAO;
    }

    private void updateTrades(Collection<Trade> trades) {
        tradesDAO.deleteAll();
        for (Trade trade : trades) {
            tradesDAO.save(trade);
        }
    }
}
