package guitar_inventory.inventory;

import guitar_inventory.instrument.Instrument;
import guitar_inventory.instrument.InstrumentSpec;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {

    List<Instrument> instruments;

    public Inventory() {
        this.instruments = new ArrayList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec instrumentSpec){
        instruments.add(new Instrument(serialNumber, price, instrumentSpec));
    }

    public Instrument get(String serialNumber){
        return instruments.stream()
                .filter(instrument -> instrument.getSerialNumber() == serialNumber)
                .findFirst().orElse(null);
    }

    public List search(InstrumentSpec searchSpec){
        List matchingInstruments = instruments.stream()
                .filter(instrument -> instrument.getSpec().matches(searchSpec))
                .collect(Collectors.toList());
        return matchingInstruments;
    }

    /*
    public List<Guitar> search(GuitarSpec searchSpec){
        List matchGuitars = guitars.stream()
                .filter(guitar -> guitar.getGuitarSpec().equals(searchSpec))
                .collect(Collectors.toList());
        return matchGuitars;
    }

     */


}
