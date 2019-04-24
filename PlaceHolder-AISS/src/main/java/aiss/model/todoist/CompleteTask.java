
package aiss.model.todoist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "items",
    "sync_status",
    "temp_id_mapping",
    "sync_token",
    "full_sync"
})
public class CompleteTask {

    @JsonProperty("items")
    private List<Item> items = null;
    @JsonProperty("sync_status")
    private SyncStatus syncStatus;
    @JsonProperty("temp_id_mapping")
    private TempIdMapping tempIdMapping;
    @JsonProperty("sync_token")
    private String syncToken;
    @JsonProperty("full_sync")
    private Boolean fullSync;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("sync_status")
    public SyncStatus getSyncStatus() {
        return syncStatus;
    }

    @JsonProperty("sync_status")
    public void setSyncStatus(SyncStatus syncStatus) {
        this.syncStatus = syncStatus;
    }

    @JsonProperty("temp_id_mapping")
    public TempIdMapping getTempIdMapping() {
        return tempIdMapping;
    }

    @JsonProperty("temp_id_mapping")
    public void setTempIdMapping(TempIdMapping tempIdMapping) {
        this.tempIdMapping = tempIdMapping;
    }

    @JsonProperty("sync_token")
    public String getSyncToken() {
        return syncToken;
    }

    @JsonProperty("sync_token")
    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }

    @JsonProperty("full_sync")
    public Boolean getFullSync() {
        return fullSync;
    }

    @JsonProperty("full_sync")
    public void setFullSync(Boolean fullSync) {
        this.fullSync = fullSync;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
