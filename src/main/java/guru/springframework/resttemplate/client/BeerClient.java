package guru.springframework.resttemplate.client;

import guru.springframework.resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

public interface BeerClient {

    Page<BeerDTO> listBeers();

}
