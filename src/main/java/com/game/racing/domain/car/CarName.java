package com.game.racing.domain.car;

import static com.game.racing.view.InputView.MAX_LENGTH_OF_CAR_NAME;

public class CarName {
    private final String carName;

    public CarName(String carName) {
        isValidCarName(carName);
        isValidLength(carName);
        this.carName = carName;
    }

    private void isValidLength(String carName) {
        if (carName.length() > MAX_LENGTH_OF_CAR_NAME) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다!");
        }
    }

    private void isValidCarName(String carName) {
        if (carName == null || carName.isBlank()) {
            throw new IllegalArgumentException("자동차 이름이 입력되지 않았습니다!");
        }
    }

    public String getCarName() {
        return carName;
    }
}