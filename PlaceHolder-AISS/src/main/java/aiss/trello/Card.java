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
<<<<<<< HEAD
	    private Integer id;
	    @JsonProperty("idList")
	    private Integer idList;
	    
	    @JsonProperty("name")
=======
	    private String id;
	    @JsonProperty("idList")
	    private String idList;
	    
		public Card(String name, String id, String idList) {
			super();
			this.name = name;
			this.id = id;
			this.idList = idList;
		}

		public Card(String name, String idList) {
			super();
			this.name = name;
			this.idList = idList;
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
	    
	    @JsonProperty("idList")
<<<<<<< HEAD
	    public Integer getIdList() {
=======
	    public String getIdList() {
>>>>>>> e113d55688eae671c1b99fae7441dc8045c34790
	        return idList;
	    }

	    @JsonProperty("idList")
<<<<<<< HEAD
	    public void setIdList(Integer idList) {
=======
	    public void setIdList(String idList) {
>>>>>>> e113d55688eae671c1b99fae7441dc8045c34790
	        this.idList = idList;
	    }

}

