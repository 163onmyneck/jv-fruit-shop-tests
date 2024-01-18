package core.basesyntax.strategy.impl;

import core.basesyntax.dao.FruitDao;
import core.basesyntax.dao.FruitDaoImpl;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.OperationHandler;

public class PurchaseOperationHandlerImpl implements OperationHandler {
    private final FruitDao fruitDao = new FruitDaoImpl();

    @Override
    public void updateBalance(FruitTransaction fruitTransaction) {
        fruitDao.subtractFruit(fruitTransaction.getFruit(), fruitTransaction.getQuantity());
    }
}