package ru.netology.repository;

import ru.netology.domain.Flight;

public class FlightRepository {

    private Flight[] items = new Flight[0];

    public void save(Flight item) {
        int length = items.length + 1;
        Flight[] tmp = new Flight[length];
        if (items.length != 0) {
            System.arraycopy(items, 0, tmp, 0, items.length);
        }
        tmp[length - 1] = item;
        items = tmp;
    }

    public Flight[] findAll() {
        return items;
    }

    public Flight[] findByAirports(String from, String to) {
        Flight[] result = new Flight[0];
        for (Flight item : items) {
            if ((item.getDeparture() == from) && (item.getArrival() == to)) {
                Flight[] tmp = new Flight[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = item;
                result = tmp;
            }
        }
        return result;
    }
}


