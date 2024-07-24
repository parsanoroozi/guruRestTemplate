package guru.springframework.resttemplate.client;

import guru.springframework.resttemplate.model.BeerDTO;
import guru.springframework.resttemplate.model.BeerDTOPageImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class BeerClientImpl implements BeerClient {

    private final RestTemplateBuilder restTemplateBuilder;

    @Override
    public Page<BeerDTO> listBeers() {

        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<BeerDTOPageImpl> res = restTemplate.getForEntity("http://localhost:8080/api/v1/beer", BeerDTOPageImpl.class);

        System.out.println(res.getBody().getContent().get(0).getBeerName());

        return null;
    }
}
