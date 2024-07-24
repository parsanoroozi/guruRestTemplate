package guru.springframework.resttemplate.client;

import guru.springframework.resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface BeerClient {

    Page<BeerDTO> listBeers(String beerName);

    BeerDTO getBeerById(UUID id);

    BeerDTO createBeer(BeerDTO newDto);

    BeerDTO updateBeer(BeerDTO beerDTO);

    void deleteBeer(UUID id);
}
