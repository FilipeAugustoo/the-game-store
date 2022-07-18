package br.com.tgs.ecommerce.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.tgs.ecommerce.model.ApiModel;

@Service
public class ApiModelService {
  
  public ApiModel teste() throws URISyntaxException {
    URI uri = new URI("https://api.rawg.io/api/games?key=d7110442fff3453dbe6ba8c840e72433&page=1&page_size=100");
    
    
    RestTemplate restTemplate = new RestTemplate();
    ApiModel result = restTemplate.getForObject(uri, ApiModel.class);

    return result;
  }
}
