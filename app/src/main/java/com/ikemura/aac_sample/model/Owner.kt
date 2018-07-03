package com.ikemura.aac_sample.model

import com.google.gson.annotations.SerializedName

/**
 * オーナー
 */
data class Owner (
    @SerializedName("avatar_url")
    private val avatarUrl: String? = null,
    @SerializedName("events_url")
    private val eventsUrl: String? = null,
    @SerializedName("followers_url")
    private val followersUrl: String? = null,
    @SerializedName("following_url")
    private val followingUrl: String? = null,
    @SerializedName("gists_url")
    private val gistsUrl: String? = null,
    @SerializedName("gravatar_id")
    private val gravatarId: String? = null,
    @SerializedName("html_url")
    private val htmlUrl: String? = null,
    @SerializedName("id")
    private val id: Int = 0,
    @SerializedName("login")
    private val login: String? = null,
    @SerializedName("node_id")
    private val nodeId: String? = null,
    @SerializedName("organizations_url")
    private val organizationsUrl: String? = null,
    @SerializedName("received_events_url")
    private val receivedEventsUrl: String? = null,
    @SerializedName("repos_url")
    private val reposUrl: String? = null,
    @SerializedName("site_admin")
    private val siteAdmin: Boolean = false,
    @SerializedName("starred_url")
    private val starredUrl: String? = null,
    @SerializedName("subscriptions_url")
    private val subscriptionsUrl: String? = null,
    @SerializedName("type")
    private val type: String? = null,
    @SerializedName("url")
    private val url: String? = null
)