package aiss.trello;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	    "name",
	    "id",
	    "idList"
	})
public class Card {
	
		@JsonProperty("name")
	    private String name;
	    @JsonProperty("id")
	    private Integer id;
	    @JsonProperty("idList")
	    private Integer idList;
	    
	    @JsonProperty("name")
	    public String getName() {
	        return name;
	    }

	    @JsonProperty("name")
	    public void setName(String name) {
	        this.name = name;
	    }

	    @JsonProperty("id")
	    public Integer getId() {
	        return id;
	    }

	    @JsonProperty("id")
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    
	    @JsonProperty("idList")
	    public Integer getIdList() {
	        return idList;
	    }

	    @JsonProperty("idList")
	    public void setIdList(Integer idList) {
	        this.idList = idList;
	    }

}

