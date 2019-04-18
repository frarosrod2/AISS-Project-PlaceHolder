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
<<<<<<< HEAD
	    private Integer id;
	    @JsonProperty("idBoard")
	    private Integer idBoard;
	    
	    @JsonProperty("name")
=======
	    private String id;
	    @JsonProperty("idBoard")
	    private String idBoard;
	    
	    public List(String name, String idBoard) {
			super();
			this.name = name;
			this.idBoard = idBoard;
		}
		public List(String name, String id, String idBoard) {
			super();
			this.name = name;
			this.id = id;
			this.idBoard = idBoard;
		}

		@JsonProperty("name")
>>>>>>> e113d55688eae671c1b99fae7441dc8045c34790
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
	    
	    @JsonProperty("idBoard")
<<<<<<< HEAD
	    public Integer getIdBoard() {
=======
	    public String getIdBoard() {
>>>>>>> e113d55688eae671c1b99fae7441dc8045c34790
	        return idBoard;
	    }

	    @JsonProperty("idBoard")
<<<<<<< HEAD
	    public void setIdBoard(Integer idBoard) {
=======
	    public void setIdBoard(String idBoard) {
>>>>>>> e113d55688eae671c1b99fae7441dc8045c34790
	        this.idBoard = idBoard;
	    }

}
