package aiss.model.todoist;

public class Event {
    private Long parentProjectId;
    private Long parentItemId;
    private String eventType;
    private String objectType;
    private Long objectId;
    private Long initiatorId;
    private Long eventDate;
    private EventExtraData mEventExtraData;
    private long id;

    public Event(Long parentProjectId, Long parentItemId, String eventType, String objectType, Long objectId,
                 Long initiatorId, Long eventDate, EventExtraData eventExtraData, long id) {
        this.parentProjectId = parentProjectId;
        this.parentItemId = parentItemId;
        this.eventType = eventType;
        this.objectType = objectType;
        this.objectId = objectId;
        this.initiatorId = initiatorId;
        this.eventDate = eventDate;
        this.mEventExtraData = eventExtraData;
        this.id = id;
    }

    public Long getParentProjectId() {
        return parentProjectId;
    }

    public void setParentProjectId(Long parentProjectId) {
        this.parentProjectId = parentProjectId;
    }

    public Long getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(Long parentItemId) {
        this.parentItemId = parentItemId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getInitiatorId() {
        return initiatorId;
    }

    public void setInitiatorId(Long initiatorId) {
        this.initiatorId = initiatorId;
    }

    public Long getEventDate() {
        return eventDate;
    }

    public void setEventDate(Long eventDate) {
        this.eventDate = eventDate;
    }

    public EventExtraData getEventExtraData() {
        return mEventExtraData;
    }

    public void setEventExtraData(EventExtraData eventExtraData) {
        this.mEventExtraData = eventExtraData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
