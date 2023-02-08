package controller;

import model.Cars;
import view.InputView;
import view.MessageView;

public class Controller {
    private final InputView inputView = new InputView();
    private final MessageView messageView = new MessageView();
    public void run(){
        Cars cars = setCars();
        int tryCount = setTryCount();
    }

    private Cars setCars(){
        messageView.printCarNameMessage();
        return new Cars(inputView.inputCarName());
    }

    private int setTryCount(){
        messageView.printTryCountMessage();
        return inputView.inputTryCount();
    }
}
