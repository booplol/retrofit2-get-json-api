package com.example.android.justspell.data.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Spell {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("index")
    @Expose
    private Integer index;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("desc")
    @Expose
    private List<String> desc = null;
    @SerializedName("higher_level")
    @Expose
    private List<String> higherLevel = null;
    @SerializedName("page")
    @Expose
    private String page;
    @SerializedName("range")
    @Expose
    private String range;
    @SerializedName("components")
    @Expose
    private List<String> components = null;
    @SerializedName("material")
    @Expose
    private String material;
    @SerializedName("ritual")
    @Expose
    private String ritual;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("concentration")
    @Expose
    private String concentration;
    @SerializedName("casting_time")
    @Expose
    private String castingTime;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("school")
    @Expose
    private School school;
    @SerializedName("classes")
    @Expose
    private List<Class> classes = null;
    @SerializedName("url")
    @Expose
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDesc() {
        return desc;
    }

    public void setDesc(List<String> desc) {
        this.desc = desc;
    }

    public List<String> getHigherLevel() {
        return higherLevel;
    }

    public void setHigherLevel(List<String> higherLevel) {
        this.higherLevel = higherLevel;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRitual() {
        return ritual;
    }

    public void setRitual(String ritual) {
        this.ritual = ritual;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}