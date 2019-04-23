package aiss.model.todoist;

public class User extends Person {
    private String apiToken;
    private TzInfo tzInfo;
    private boolean isPremium;
    private Long premiumUntil;
    private Long freeTrialExpires;
    private String startPage;
    private Integer startDay;
    private Integer nextWeek;
    private Long teamInbox;
    private Integer shareLimit;
    private Long karma;
    private String karmaTrend;
    private boolean karmaDisabled;
    private boolean karmaVacation;
    private Integer autoReminder;
    private Integer theme;
    private Features features;
    private Long businessAccountId;
    private Integer dailyGoal;
    private Integer weeklyGoal;
    private int[] daysOff;
    private Long uniquePrefix;

    public User(long id, String email, String fullName, String imageId, String apiToken, TzInfo tzInfo,
                boolean isPremium, Long premiumUntil, Long freeTrialExpires, String startPage, Integer startDay,
                Integer nextWeek, Long teamInbox, Integer shareLimit, Long karma, String karmaTrend,
                boolean karmaDisabled, boolean karmaVacation, Integer autoReminder, Integer theme, Features features,
                Long businessAccountId, Integer dailyGoal, Integer weeklyGoal, int[] daysOff, Long uniquePrefix) {
        super(id, email, fullName, imageId, false);
        this.apiToken = apiToken;
        this.tzInfo = tzInfo;
        this.isPremium = isPremium;
        this.premiumUntil = premiumUntil;
        this.freeTrialExpires = freeTrialExpires;
        this.startPage = startPage;
        this.startDay = startDay;
        this.nextWeek = nextWeek;
        this.teamInbox = teamInbox;
        this.shareLimit = shareLimit;
        this.karma = karma;
        this.karmaTrend = karmaTrend;
        this.karmaDisabled = karmaDisabled;
        this.karmaVacation = karmaVacation;
        this.autoReminder = autoReminder;
        this.theme = theme;
        this.features = features;
        this.businessAccountId = businessAccountId;
        this.dailyGoal = dailyGoal;
        this.weeklyGoal = weeklyGoal;
        this.daysOff = daysOff;
        this.uniquePrefix = uniquePrefix;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public TzInfo getTzInfo() {
        return tzInfo;
    }

    public void setTzInfo(TzInfo tzInfo) {
        this.tzInfo = tzInfo;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public Long getPremiumUntil() {
        return premiumUntil;
    }

    public void setPremiumUntil(Long premiumUntil) {
        this.premiumUntil = premiumUntil;
    }

    public Long getFreeTrialExpires() {
        return freeTrialExpires;
    }

    public void setFreeTrialExpires(Long freeTrialExpires) {
        this.freeTrialExpires = freeTrialExpires;
    }

    public String getStartPage() {
        return startPage;
    }

    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public Integer getStartDay() {
        return startDay;
    }

    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }

    public Integer getNextWeek() {
        return nextWeek;
    }

    public void setNextWeek(Integer nextWeek) {
        this.nextWeek = nextWeek;
    }

    public Long getTeamInbox() {
        return teamInbox;
    }

    public void setTeamInbox(Long teamInbox) {
        this.teamInbox = teamInbox;
    }

    public Integer getShareLimit() {
        return shareLimit;
    }

    public void setShareLimit(Integer shareLimit) {
        this.shareLimit = shareLimit;
    }

    public Long getKarma() {
        return karma;
    }

    public void setKarma(Long karma) {
        this.karma = karma;
    }

    public String getKarmaTrend() {
        return karmaTrend;
    }

    public void setKarmaTrend(String karmaTrend) {
        this.karmaTrend = karmaTrend;
    }

    public boolean isKarmaDisabled() {
        return karmaDisabled;
    }

    public void setKarmaDisabled(boolean karmaDisabled) {
        this.karmaDisabled = karmaDisabled;
    }

    public boolean isKarmaVacation() {
        return karmaVacation;
    }

    public void setKarmaVacation(boolean karmaVacation) {
        this.karmaVacation = karmaVacation;
    }

    public Integer getAutoReminder() {
        return autoReminder;
    }

    public void setAutoReminder(Integer autoReminder) {
        this.autoReminder = autoReminder;
    }

    public Integer getTheme() {
        return theme;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public Long getBusinessAccountId() {
        return businessAccountId;
    }

    public void setBusinessAccountId(Long businessAccountId) {
        this.businessAccountId = businessAccountId;
    }

    public Integer getDailyGoal() {
        return dailyGoal;
    }

    public void setDailyGoal(Integer dailyGoal) {
        this.dailyGoal = dailyGoal;
    }

    public Integer getWeeklyGoal() {
        return weeklyGoal;
    }

    public void setWeeklyGoal(Integer weeklyGoal) {
        this.weeklyGoal = weeklyGoal;
    }

    public int[] getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(int[] daysOff) {
        this.daysOff = daysOff;
    }

    public Long getUniquePrefix() {
        return uniquePrefix;
    }

    public void setUniquePrefix(Long uniquePrefix) {
        this.uniquePrefix = uniquePrefix;
    }
}
