package aiss.trello;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	    "name",
	    "id",
	    "idBoard"
	})
public class List {
		@JsonProperty("name")
	    private String name;
	    @JsonProperty("id")
	    private Integer id;
	    @JsonProperty("idBoard")
	    private Integer idBoard;
	    
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
	    
	    @JsonProperty("idBoard")
	    public Integer getIdBoard() {
	        return idBoard;
	    }

	    @JsonProperty("idBoard")
	    public void setIdBoard(Integer idBoard) {
	        this.idBoard = idBoard;
	    }

}
