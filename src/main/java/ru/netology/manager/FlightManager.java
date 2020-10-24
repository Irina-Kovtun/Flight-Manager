package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Flight;
import ru.netology.repository.FlightRepository;

import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FlightManager {
    private FlightRepository repository = new FlightRepository();

    public void add(Flight item) {
        repository.save(item);
    }

    public Flight[] getAll() {
        return repository.findAll();
    }

    public Flight[] searchBy(String from, String to) {
        Flight[] result = repository.findByAirports(from, to);
        Arrays.sort(result);
        return result;
    }

//            Arrays.sort(actual);
//
//            assertArrayEquals(expected, actual);
//        }
//            if (flight.matches(text)) {
//                Flight[] tmp = new Flight[result.length + 1];
//                System.arraycopy(result, 0, tmp, 0, result.length);
//                tmp[tmp.length - 1] = flight;
//                result = tmp;
//            }
//        }
//        return result;
//    }
}
//
