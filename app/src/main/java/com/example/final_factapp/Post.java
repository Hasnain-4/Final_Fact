package com.example.final_factapp;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("lang_id")
    @Expose
    private String langId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_slug")
    @Expose
    private String titleSlug;
    @SerializedName("title_hash")
    @Expose
    private Object titleHash;
    @SerializedName("keywords")
    @Expose
    private String keywords;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("subcategory_id")
    @Expose
    private String subcategoryId;
    @SerializedName("image_big")
    @Expose
    private String imageBig;
    @SerializedName("image_default")
    @Expose
    private String imageDefault;
    @SerializedName("image_slider")
    @Expose
    private String imageSlider;
    @SerializedName("image_mid")
    @Expose
    private String imageMid;
    @SerializedName("image_small")
    @Expose
    private String imageSmall;
    @SerializedName("image_mime")
    @Expose
    private String imageMime;
    @SerializedName("hit")
    @Expose
    private String hit;
    @SerializedName("optional_url")
    @Expose
    private String optionalUrl;
    @SerializedName("need_auth")
    @Expose
    private String needAuth;
    @SerializedName("is_slider")
    @Expose
    private String isSlider;
    @SerializedName("slider_order")
    @Expose
    private String sliderOrder;
    @SerializedName("is_featured")
    @Expose
    private String isFeatured;
    @SerializedName("featured_order")
    @Expose
    private String featuredOrder;
    @SerializedName("is_recommended")
    @Expose
    private String isRecommended;
    @SerializedName("is_breaking")
    @Expose
    private String isBreaking;
    @SerializedName("is_scheduled")
    @Expose
    private String isScheduled;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("show_right_column")
    @Expose
    private String showRightColumn;
    @SerializedName("post_type")
    @Expose
    private String postType;
    @SerializedName("video_path")
    @Expose
    private Object videoPath;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("video_embed_code")
    @Expose
    private String videoEmbedCode;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("feed_id")
    @Expose
    private Object feedId;
    @SerializedName("post_url")
    @Expose
    private Object postUrl;
    @SerializedName("show_post_url")
    @Expose
    private String showPostUrl;
    @SerializedName("image_description")
    @Expose
    private Object imageDescription;
    @SerializedName("show_item_numbers")
    @Expose
    private String showItemNumbers;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("name_slug")
    @Expose
    private String nameSlug;
    @SerializedName("parent_id")
    @Expose
    private String parentId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("block_type")
    @Expose
    private String blockType;
    @SerializedName("category_order")
    @Expose
    private String categoryOrder;
    @SerializedName("show_at_homepage")
    @Expose
    private String showAtHomepage;
    @SerializedName("show_on_menu")
    @Expose
    private String showOnMenu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLangId() {
        return langId;
    }

    public void setLangId(String langId) {
        this.langId = langId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleSlug() {
        return titleSlug;
    }

    public void setTitleSlug(String titleSlug) {
        this.titleSlug = titleSlug;
    }

    public Object getTitleHash() {
        return titleHash;
    }

    public void setTitleHash(Object titleHash) {
        this.titleHash = titleHash;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(String subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getImageBig() {
        return imageBig;
    }

    public void setImageBig(String imageBig) {
        this.imageBig = imageBig;
    }

    public String getImageDefault() {
        return imageDefault;
    }

    public void setImageDefault(String imageDefault) {
        this.imageDefault = imageDefault;
    }

    public String getImageSlider() {
        return imageSlider;
    }

    public void setImageSlider(String imageSlider) {
        this.imageSlider = imageSlider;
    }

    public String getImageMid() {
        return imageMid;
    }

    public void setImageMid(String imageMid) {
        this.imageMid = imageMid;
    }

    public String getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }

    public String getImageMime() {
        return imageMime;
    }

    public void setImageMime(String imageMime) {
        this.imageMime = imageMime;
    }

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public String getOptionalUrl() {
        return optionalUrl;
    }

    public void setOptionalUrl(String optionalUrl) {
        this.optionalUrl = optionalUrl;
    }

    public String getNeedAuth() {
        return needAuth;
    }

    public void setNeedAuth(String needAuth) {
        this.needAuth = needAuth;
    }

    public String getIsSlider() {
        return isSlider;
    }

    public void setIsSlider(String isSlider) {
        this.isSlider = isSlider;
    }

    public String getSliderOrder() {
        return sliderOrder;
    }

    public void setSliderOrder(String sliderOrder) {
        this.sliderOrder = sliderOrder;
    }

    public String getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(String isFeatured) {
        this.isFeatured = isFeatured;
    }

    public String getFeaturedOrder() {
        return featuredOrder;
    }

    public void setFeaturedOrder(String featuredOrder) {
        this.featuredOrder = featuredOrder;
    }

    public String getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(String isRecommended) {
        this.isRecommended = isRecommended;
    }

    public String getIsBreaking() {
        return isBreaking;
    }

    public void setIsBreaking(String isBreaking) {
        this.isBreaking = isBreaking;
    }

    public String getIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(String isScheduled) {
        this.isScheduled = isScheduled;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getShowRightColumn() {
        return showRightColumn;
    }

    public void setShowRightColumn(String showRightColumn) {
        this.showRightColumn = showRightColumn;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Object getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(Object videoPath) {
        this.videoPath = videoPath;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoEmbedCode() {
        return videoEmbedCode;
    }

    public void setVideoEmbedCode(String videoEmbedCode) {
        this.videoEmbedCode = videoEmbedCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getFeedId() {
        return feedId;
    }

    public void setFeedId(Object feedId) {
        this.feedId = feedId;
    }

    public Object getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(Object postUrl) {
        this.postUrl = postUrl;
    }

    public String getShowPostUrl() {
        return showPostUrl;
    }

    public void setShowPostUrl(String showPostUrl) {
        this.showPostUrl = showPostUrl;
    }

    public Object getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(Object imageDescription) {
        this.imageDescription = imageDescription;
    }

    public String getShowItemNumbers() {
        return showItemNumbers;
    }

    public void setShowItemNumbers(String showItemNumbers) {
        this.showItemNumbers = showItemNumbers;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameSlug() {
        return nameSlug;
    }

    public void setNameSlug(String nameSlug) {
        this.nameSlug = nameSlug;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBlockType() {
        return blockType;
    }

    public void setBlockType(String blockType) {
        this.blockType = blockType;
    }

    public String getCategoryOrder() {
        return categoryOrder;
    }

    public void setCategoryOrder(String categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    public String getShowAtHomepage() {
        return showAtHomepage;
    }

    public void setShowAtHomepage(String showAtHomepage) {
        this.showAtHomepage = showAtHomepage;
    }

    public String getShowOnMenu() {
        return showOnMenu;
    }

    public void setShowOnMenu(String showOnMenu) {
        this.showOnMenu = showOnMenu;
    }

}
