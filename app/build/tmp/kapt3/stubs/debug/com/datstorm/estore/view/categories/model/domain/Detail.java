package com.datstorm.estore.view.categories.model.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\u0004H\u00c6\u0003J\t\u0010!\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0004H\u00c6\u0003J\t\u0010#\u001a\u00020\u0004H\u00c6\u0003J\t\u0010$\u001a\u00020\tH\u00c6\u0003J\t\u0010%\u001a\u00020\u000bH\u00c6\u0003J\t\u0010&\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u0004H\u00d6\u0001J\t\u0010-\u001a\u00020\u000bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001a\u00a8\u0006."}, d2 = {"Lcom/datstorm/estore/view/categories/model/domain/Detail;", "", "Description", "Id", "", "Images", "IsMyFavourite", "IsOpen", "Location", "Lcom/datstorm/estore/view/categories/model/domain/Location;", "Name", "", "ProductsList", "SubTitle", "ThumbnailUrl", "(Ljava/lang/Object;ILjava/lang/Object;IILcom/datstorm/estore/view/categories/model/domain/Location;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/Object;", "getId", "()I", "getImages", "getIsMyFavourite", "getIsOpen", "getLocation", "()Lcom/datstorm/estore/view/categories/model/domain/Location;", "getName", "()Ljava/lang/String;", "getProductsList", "getSubTitle", "getThumbnailUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Detail {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Description = null;
    private final int Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Images = null;
    private final int IsMyFavourite = 0;
    private final int IsOpen = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.datstorm.estore.view.categories.model.domain.Location Location = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ProductsList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String SubTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ThumbnailUrl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDescription() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getImages() {
        return null;
    }
    
    public final int getIsMyFavourite() {
        return 0;
    }
    
    public final int getIsOpen() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.datstorm.estore.view.categories.model.domain.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getProductsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumbnailUrl() {
        return null;
    }
    
    public Detail(@org.jetbrains.annotations.NotNull()
    java.lang.Object Description, int Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Images, int IsMyFavourite, int IsOpen, @org.jetbrains.annotations.NotNull()
    com.datstorm.estore.view.categories.model.domain.Location Location, @org.jetbrains.annotations.NotNull()
    java.lang.String Name, @org.jetbrains.annotations.NotNull()
    java.lang.Object ProductsList, @org.jetbrains.annotations.NotNull()
    java.lang.String SubTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String ThumbnailUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.datstorm.estore.view.categories.model.domain.Location component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.datstorm.estore.view.categories.model.domain.Detail copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object Description, int Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Images, int IsMyFavourite, int IsOpen, @org.jetbrains.annotations.NotNull()
    com.datstorm.estore.view.categories.model.domain.Location Location, @org.jetbrains.annotations.NotNull()
    java.lang.String Name, @org.jetbrains.annotations.NotNull()
    java.lang.Object ProductsList, @org.jetbrains.annotations.NotNull()
    java.lang.String SubTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String ThumbnailUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}