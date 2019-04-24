package aiss.model.gitLab;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
		"id",
		"name",
		"type",
		"path",
		"mode",
		"sha",
		"email",
		"commits",
		"additions",
		"deletions",
		"file_name",
		"file_path",
		"size",
		"encoding",
		"content",
		"content_sha256",
		"ref",
		"blob_id",
		"commit_id",
		"last_commit_id"
	})
	public class GitLabRepository {
		@JsonProperty("id")
		public String id;
		@JsonProperty("name")
		public String name;
		@JsonProperty("type")
		public String type;
		@JsonProperty("path")
		public String path;
		@JsonProperty("mode")
		public String mode;
		@JsonProperty("sha")
		public String sha;
		@JsonProperty("email")
		public String email;
		@JsonProperty("commits")
		public Integer commits;
		@JsonProperty("additions")
		public Integer additions;
		@JsonProperty("deletions")
		public Integer deletions;
		@JsonProperty("file_name")
		public String fileName;
		@JsonProperty("file_path")
		public String filePath;
		@JsonProperty("size")
		public Integer size;
		@JsonProperty("encoding")
		public String encoding;
		@JsonProperty("content")
		public String content;
		@JsonProperty("content_sha256")
		public String contentSha256;
		@JsonProperty("ref")
		public String ref;
		@JsonProperty("blob_id")
		public String blobId;
		@JsonProperty("commit_id")
		public String commitId;
		@JsonProperty("last_commit_id")
		public String lastCommitId;
		@JsonIgnore
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonAnyGetter
		public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
		}

		@JsonAnySetter
		public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		}
}
