package com.example.data.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ahmedmamdouh13 on 15/09/17.
 */

public class RedditJson {

    public class Child {

        @SerializedName("kind")
        @Expose
        private String kind;
        @SerializedName("data")
        @Expose
        private Data_ data;

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public Data_ getData() {
            return data;
        }

        public void setData(Data_ data) {
            this.data = data;
        }

    }

    public class Data {

        @SerializedName("modhash")
        @Expose
        private String modhash;
        @SerializedName("children")
        @Expose
        private List<Child> children = null;
        @SerializedName("after")
        @Expose
        private String after;
        @SerializedName("before")
        @Expose
        private Object before;

        public String getModhash() {
            return modhash;
        }

        public void setModhash(String modhash) {
            this.modhash = modhash;
        }

        public List<Child> getChildren() {
            return children;
        }

        public void setChildren(List<Child> children) {
            this.children = children;
        }

        public String getAfter() {
            return after;
        }

        public void setAfter(String after) {
            this.after = after;
        }

        public Object getBefore() {
            return before;
        }

        public void setBefore(Object before) {
            this.before = before;
        }

    }

    public class Data_ {

        @SerializedName("domain")
        @Expose
        private String domain;
        @SerializedName("approved_at_utc")
        @Expose
        private Object approvedAtUtc;
        @SerializedName("banned_by")
        @Expose
        private Object bannedBy;
        @SerializedName("media_embed")
        @Expose
        private MediaEmbed mediaEmbed;
        @SerializedName("thumbnail_width")
        @Expose
        private Integer thumbnailWidth;
        @SerializedName("subreddit")
        @Expose
        private String subreddit;
        @SerializedName("selftext_html")
        @Expose
        private Object selftextHtml;
        @SerializedName("selftext")
        @Expose
        private String selftext;
        @SerializedName("likes")
        @Expose
        private Object likes;
        @SerializedName("suggested_sort")
        @Expose
        private Object suggestedSort;
        @SerializedName("user_reports")
        @Expose
        private List<Object> userReports = null;
        @SerializedName("secure_media")
        @Expose
        private Object secureMedia;
        @SerializedName("link_flair_text")
        @Expose
        private Object linkFlairText;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("banned_at_utc")
        @Expose
        private Object bannedAtUtc;
        @SerializedName("view_count")
        @Expose
        private Object viewCount;
        @SerializedName("archived")
        @Expose
        private Boolean archived;
        @SerializedName("clicked")
        @Expose
        private Boolean clicked;
        @SerializedName("report_reasons")
        @Expose
        private Object reportReasons;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("num_crossposts")
        @Expose
        private Integer numCrossposts;
        @SerializedName("saved")
        @Expose
        private Boolean saved;
        @SerializedName("mod_reports")
        @Expose
        private List<Object> modReports = null;
        @SerializedName("can_mod_post")
        @Expose
        private Boolean canModPost;
        @SerializedName("is_crosspostable")
        @Expose
        private Boolean isCrosspostable;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("approved_by")
        @Expose
        private Object approvedBy;
        @SerializedName("over_18")
        @Expose
        private Boolean over18;
        @SerializedName("hidden")
        @Expose
        private Boolean hidden;
        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;
        @SerializedName("subreddit_id")
        @Expose
        private String subredditId;
        @SerializedName("edited")
        @Expose
        private Boolean edited;
        @SerializedName("link_flair_css_class")
        @Expose
        private Object linkFlairCssClass;
        @SerializedName("author_flair_css_class")
        @Expose
        private Object authorFlairCssClass;
        @SerializedName("contest_mode")
        @Expose
        private Boolean contestMode;
        @SerializedName("gilded")
        @Expose
        private Integer gilded;
        @SerializedName("downs")
        @Expose
        private Integer downs;
        @SerializedName("brand_safe")
        @Expose
        private Boolean brandSafe;
        @SerializedName("secure_media_embed")
        @Expose
        private SecureMediaEmbed secureMediaEmbed;
        @SerializedName("removal_reason")
        @Expose
        private Object removalReason;
        @SerializedName("author_flair_text")
        @Expose
        private Object authorFlairText;
        @SerializedName("stickied")
        @Expose
        private Boolean stickied;
        @SerializedName("can_gild")
        @Expose
        private Boolean canGild;
        @SerializedName("thumbnail_height")
        @Expose
        private Integer thumbnailHeight;
        @SerializedName("parent_whitelist_status")
        @Expose
        private String parentWhitelistStatus;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("spoiler")
        @Expose
        private Boolean spoiler;
        @SerializedName("permalink")
        @Expose
        private String permalink;
        @SerializedName("subreddit_type")
        @Expose
        private String subredditType;
        @SerializedName("locked")
        @Expose
        private Boolean locked;
        @SerializedName("hide_score")
        @Expose
        private Boolean hideScore;
        @SerializedName("created")
        @Expose
        private Integer created;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("whitelist_status")
        @Expose
        private String whitelistStatus;
        @SerializedName("quarantine")
        @Expose
        private Boolean quarantine;
        @SerializedName("author")
        @Expose
        private String author;
        @SerializedName("created_utc")
        @Expose
        private Integer createdUtc;
        @SerializedName("subreddit_name_prefixed")
        @Expose
        private String subredditNamePrefixed;
        @SerializedName("ups")
        @Expose
        private Integer ups;
        @SerializedName("media")
        @Expose
        private Object media;
        @SerializedName("num_comments")
        @Expose
        private Integer numComments;
        @SerializedName("is_self")
        @Expose
        private Boolean isSelf;
        @SerializedName("visited")
        @Expose
        private Boolean visited;
        @SerializedName("num_reports")
        @Expose
        private Object numReports;
        @SerializedName("is_video")
        @Expose
        private Boolean isVideo;
        @SerializedName("distinguished")
        @Expose
        private Object distinguished;
        @SerializedName("preview")
        @Expose
        private Preview preview;
        @SerializedName("post_hint")
        @Expose
        private String postHint;

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public Object getApprovedAtUtc() {
            return approvedAtUtc;
        }

        public void setApprovedAtUtc(Object approvedAtUtc) {
            this.approvedAtUtc = approvedAtUtc;
        }

        public Object getBannedBy() {
            return bannedBy;
        }

        public void setBannedBy(Object bannedBy) {
            this.bannedBy = bannedBy;
        }

        public MediaEmbed getMediaEmbed() {
            return mediaEmbed;
        }

        public void setMediaEmbed(MediaEmbed mediaEmbed) {
            this.mediaEmbed = mediaEmbed;
        }

        public Integer getThumbnailWidth() {
            return thumbnailWidth;
        }

        public void setThumbnailWidth(Integer thumbnailWidth) {
            this.thumbnailWidth = thumbnailWidth;
        }

        public String getSubreddit() {
            return subreddit;
        }

        public void setSubreddit(String subreddit) {
            this.subreddit = subreddit;
        }

        public Object getSelftextHtml() {
            return selftextHtml;
        }

        public void setSelftextHtml(Object selftextHtml) {
            this.selftextHtml = selftextHtml;
        }

        public String getSelftext() {
            return selftext;
        }

        public void setSelftext(String selftext) {
            this.selftext = selftext;
        }

        public Object getLikes() {
            return likes;
        }

        public void setLikes(Object likes) {
            this.likes = likes;
        }

        public Object getSuggestedSort() {
            return suggestedSort;
        }

        public void setSuggestedSort(Object suggestedSort) {
            this.suggestedSort = suggestedSort;
        }

        public List<Object> getUserReports() {
            return userReports;
        }

        public void setUserReports(List<Object> userReports) {
            this.userReports = userReports;
        }

        public Object getSecureMedia() {
            return secureMedia;
        }

        public void setSecureMedia(Object secureMedia) {
            this.secureMedia = secureMedia;
        }

        public Object getLinkFlairText() {
            return linkFlairText;
        }

        public void setLinkFlairText(Object linkFlairText) {
            this.linkFlairText = linkFlairText;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getBannedAtUtc() {
            return bannedAtUtc;
        }

        public void setBannedAtUtc(Object bannedAtUtc) {
            this.bannedAtUtc = bannedAtUtc;
        }

        public Object getViewCount() {
            return viewCount;
        }

        public void setViewCount(Object viewCount) {
            this.viewCount = viewCount;
        }

        public Boolean getArchived() {
            return archived;
        }

        public void setArchived(Boolean archived) {
            this.archived = archived;
        }

        public Boolean getClicked() {
            return clicked;
        }

        public void setClicked(Boolean clicked) {
            this.clicked = clicked;
        }

        public Object getReportReasons() {
            return reportReasons;
        }

        public void setReportReasons(Object reportReasons) {
            this.reportReasons = reportReasons;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getNumCrossposts() {
            return numCrossposts;
        }

        public void setNumCrossposts(Integer numCrossposts) {
            this.numCrossposts = numCrossposts;
        }

        public Boolean getSaved() {
            return saved;
        }

        public void setSaved(Boolean saved) {
            this.saved = saved;
        }

        public List<Object> getModReports() {
            return modReports;
        }

        public void setModReports(List<Object> modReports) {
            this.modReports = modReports;
        }

        public Boolean getCanModPost() {
            return canModPost;
        }

        public void setCanModPost(Boolean canModPost) {
            this.canModPost = canModPost;
        }

        public Boolean getIsCrosspostable() {
            return isCrosspostable;
        }

        public void setIsCrosspostable(Boolean isCrosspostable) {
            this.isCrosspostable = isCrosspostable;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Object getApprovedBy() {
            return approvedBy;
        }

        public void setApprovedBy(Object approvedBy) {
            this.approvedBy = approvedBy;
        }

        public Boolean getOver18() {
            return over18;
        }

        public void setOver18(Boolean over18) {
            this.over18 = over18;
        }

        public Boolean getHidden() {
            return hidden;
        }

        public void setHidden(Boolean hidden) {
            this.hidden = hidden;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getSubredditId() {
            return subredditId;
        }

        public void setSubredditId(String subredditId) {
            this.subredditId = subredditId;
        }

        public Boolean getEdited() {
            return edited;
        }

        public void setEdited(Boolean edited) {
            this.edited = edited;
        }

        public Object getLinkFlairCssClass() {
            return linkFlairCssClass;
        }

        public void setLinkFlairCssClass(Object linkFlairCssClass) {
            this.linkFlairCssClass = linkFlairCssClass;
        }

        public Object getAuthorFlairCssClass() {
            return authorFlairCssClass;
        }

        public void setAuthorFlairCssClass(Object authorFlairCssClass) {
            this.authorFlairCssClass = authorFlairCssClass;
        }

        public Boolean getContestMode() {
            return contestMode;
        }

        public void setContestMode(Boolean contestMode) {
            this.contestMode = contestMode;
        }

        public Integer getGilded() {
            return gilded;
        }

        public void setGilded(Integer gilded) {
            this.gilded = gilded;
        }

        public Integer getDowns() {
            return downs;
        }

        public void setDowns(Integer downs) {
            this.downs = downs;
        }

        public Boolean getBrandSafe() {
            return brandSafe;
        }

        public void setBrandSafe(Boolean brandSafe) {
            this.brandSafe = brandSafe;
        }

        public SecureMediaEmbed getSecureMediaEmbed() {
            return secureMediaEmbed;
        }

        public void setSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
            this.secureMediaEmbed = secureMediaEmbed;
        }

        public Object getRemovalReason() {
            return removalReason;
        }

        public void setRemovalReason(Object removalReason) {
            this.removalReason = removalReason;
        }

        public Object getAuthorFlairText() {
            return authorFlairText;
        }

        public void setAuthorFlairText(Object authorFlairText) {
            this.authorFlairText = authorFlairText;
        }

        public Boolean getStickied() {
            return stickied;
        }

        public void setStickied(Boolean stickied) {
            this.stickied = stickied;
        }

        public Boolean getCanGild() {
            return canGild;
        }

        public void setCanGild(Boolean canGild) {
            this.canGild = canGild;
        }

        public Integer getThumbnailHeight() {
            return thumbnailHeight;
        }

        public void setThumbnailHeight(Integer thumbnailHeight) {
            this.thumbnailHeight = thumbnailHeight;
        }

        public String getParentWhitelistStatus() {
            return parentWhitelistStatus;
        }

        public void setParentWhitelistStatus(String parentWhitelistStatus) {
            this.parentWhitelistStatus = parentWhitelistStatus;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getSpoiler() {
            return spoiler;
        }

        public void setSpoiler(Boolean spoiler) {
            this.spoiler = spoiler;
        }

        public String getPermalink() {
            return permalink;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public String getSubredditType() {
            return subredditType;
        }

        public void setSubredditType(String subredditType) {
            this.subredditType = subredditType;
        }

        public Boolean getLocked() {
            return locked;
        }

        public void setLocked(Boolean locked) {
            this.locked = locked;
        }

        public Boolean getHideScore() {
            return hideScore;
        }

        public void setHideScore(Boolean hideScore) {
            this.hideScore = hideScore;
        }

        public Integer getCreated() {
            return created;
        }

        public void setCreated(Integer created) {
            this.created = created;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWhitelistStatus() {
            return whitelistStatus;
        }

        public void setWhitelistStatus(String whitelistStatus) {
            this.whitelistStatus = whitelistStatus;
        }

        public Boolean getQuarantine() {
            return quarantine;
        }

        public void setQuarantine(Boolean quarantine) {
            this.quarantine = quarantine;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Integer getCreatedUtc() {
            return createdUtc;
        }

        public void setCreatedUtc(Integer createdUtc) {
            this.createdUtc = createdUtc;
        }

        public String getSubredditNamePrefixed() {
            return subredditNamePrefixed;
        }

        public void setSubredditNamePrefixed(String subredditNamePrefixed) {
            this.subredditNamePrefixed = subredditNamePrefixed;
        }

        public Integer getUps() {
            return ups;
        }

        public void setUps(Integer ups) {
            this.ups = ups;
        }

        public Object getMedia() {
            return media;
        }

        public void setMedia(Object media) {
            this.media = media;
        }

        public Integer getNumComments() {
            return numComments;
        }

        public void setNumComments(Integer numComments) {
            this.numComments = numComments;
        }

        public Boolean getIsSelf() {
            return isSelf;
        }

        public void setIsSelf(Boolean isSelf) {
            this.isSelf = isSelf;
        }

        public Boolean getVisited() {
            return visited;
        }

        public void setVisited(Boolean visited) {
            this.visited = visited;
        }

        public Object getNumReports() {
            return numReports;
        }

        public void setNumReports(Object numReports) {
            this.numReports = numReports;
        }

        public Boolean getIsVideo() {
            return isVideo;
        }

        public void setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
        }

        public Object getDistinguished() {
            return distinguished;
        }

        public void setDistinguished(Object distinguished) {
            this.distinguished = distinguished;
        }

        public Preview getPreview() {
            return preview;
        }

        public void setPreview(Preview preview) {
            this.preview = preview;
        }

        public String getPostHint() {
            return postHint;
        }

        public void setPostHint(String postHint) {
            this.postHint = postHint;
        }

    }

    public class Example {

        @SerializedName("kind")
        @Expose
        private String kind;
        @SerializedName("data")
        @Expose
        private Data data;

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

    }


    public class Image {

        @SerializedName("source")
        @Expose
        private Source source;
        @SerializedName("resolutions")
        @Expose
        private List<Resolution> resolutions = null;
        @SerializedName("variants")
        @Expose
        private Variants variants;
        @SerializedName("id")
        @Expose
        private String id;

        public Source getSource() {
            return source;
        }

        public void setSource(Source source) {
            this.source = source;
        }

        public List<Resolution> getResolutions() {
            return resolutions;
        }

        public void setResolutions(List<Resolution> resolutions) {
            this.resolutions = resolutions;
        }

        public Variants getVariants() {
            return variants;
        }

        public void setVariants(Variants variants) {
            this.variants = variants;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public class MediaEmbed {


    }


    public class Preview {

        @SerializedName("images")
        @Expose
        private List<Image> images = null;
        @SerializedName("enabled")
        @Expose
        private Boolean enabled;

        public List<Image> getImages() {
            return images;
        }

        public void setImages(List<Image> images) {
            this.images = images;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

    }


    public class Resolution {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

    }


    public class SecureMediaEmbed {


    }

    public class Source {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

    }


    public class Variants {


    }

}
