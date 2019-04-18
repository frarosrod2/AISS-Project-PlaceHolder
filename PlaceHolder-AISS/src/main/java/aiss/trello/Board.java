package aiss.trello;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	    "name",
	    "id"
	})

public class Board {

	@JsonProperty("name")
    private String name;
    @JsonProperty("id")
<<<<<<< HEAD
    private Integer id;
=======
    private String id;
>>>>>>> e113d55688eae671c1b99fae7441dc8045c34790
    
    

	public Board(String name) {
		super();
		this.name = name;
	}

<<<<<<< HEAD
=======
	public Board(String id, String name) {
		this.id = id;
		this.name = name;
		
	}

>>>>>>> e113d55688eae671c1b99fae7441dc8045c34790
	@JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id")
<<<<<<< HEAD
    public Integer getId() {
=======
    public String getId() {
>>>>>>> e113d55688eae671c1b99fae7441dc8045c34790
        return id;
    }

    @JsonProperty("id")
<<<<<<< HEAD
    public void setId(Integer id) {
=======
    public void setId(String id) {
>>>>>>> e113d55688eae671c1b99fae7441dc8045c34790
        this.id = id;
    }
}
