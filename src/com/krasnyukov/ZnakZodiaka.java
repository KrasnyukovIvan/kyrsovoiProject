package com.krasnyukov;

public enum ZnakZodiaka {
    Aries("Овен"),
    Taurus("Телец"),
    Twins("Близнецы"),
    Crayfish("Рак"),
    Lion("Лев"),
    Virgo("Дева"),
    Scales("Весы"),
    Scorpion("Скорпион"),
    Sagittarius("Стрелец"),
    Capricorn("Козерог"),
    Aquarius("Водолей"),
    Fish("Рыба");

    private String rusNameZnakZodiaka;

    private ZnakZodiaka(String rusNameZnakZodiaka) {
        this.rusNameZnakZodiaka = rusNameZnakZodiaka;
    }

    @Override
    public String toString() {
        return rusNameZnakZodiaka;
    }
}
