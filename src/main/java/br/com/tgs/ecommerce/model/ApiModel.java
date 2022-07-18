package br.com.tgs.ecommerce.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiModel {

  private String next;
  private String previous;
  private List<results> results;

  @Override
  public String toString() {
    return "ApiModel [next=" + next + ", previous=" + previous + ", results=" + results + "]";
  }

}

@Getter
@Setter
class results {

  private Integer id;
  private String name;
  private String released;
  private String background_image;
  private Integer rating;
  private Integer rating_top;

  @Override
  public String toString() {
    return "results [background_image=" + background_image + ", id=" + id + ", name=" + name + ", rating=" + rating
        + ", rating_top=" + rating_top + ", released=" + released + "]";
  }

}
