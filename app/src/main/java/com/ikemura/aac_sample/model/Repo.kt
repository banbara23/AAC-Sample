package com.ikemura.aac_sample.model

import com.google.gson.annotations.SerializedName

/**
 * リポジトリ
 */
data class Repo(
    @SerializedName("archive_url")
    private val archiveUrl: String? = null,
    @SerializedName("archived")
    private val archived: Boolean = false,
    @SerializedName("assignees_url")
    private val assigneesUrl: String? = null,
    @SerializedName("blobs_url")
    private val blobsUrl: String? = null,
    @SerializedName("branches_url")
    private val branchesUrl: String? = null,
    @SerializedName("clone_url")
    private val cloneUrl: String? = null,
    @SerializedName("collaborators_url")
    private val collaboratorsUrl: String? = null,
    @SerializedName("comments_url")
    private val commentsUrl: String? = null,
    @SerializedName("commits_url")
    private val commitsUrl: String? = null,
    @SerializedName("compare_url")
    private val compareUrl: String? = null,
    @SerializedName("contents_url")
    private val contentsUrl: String? = null,
    @SerializedName("contributors_url")
    private val contributorsUrl: String? = null,
    @SerializedName("created_at")
    private val createdAt: String? = null,
    @SerializedName("default_branch")
    private val defaultBranch: String? = null,
    @SerializedName("deployments_url")
    private val deploymentsUrl: String? = null,
    @SerializedName("description")
    private val description: String? = null,
    @SerializedName("downloads_url")
    private val downloadsUrl: String? = null,
    @SerializedName("events_url")
    private val eventsUrl: String? = null,
    @SerializedName("fork")
    private val fork: Boolean = false,
    @SerializedName("forks")
    private val forks: Int = 0,
    @SerializedName("forks_count")
    private val forksCount: Int = 0,
    @SerializedName("forks_url")
    private val forksUrl: String? = null,
    @SerializedName("full_name")
    private val fullName: String? = null,
    @SerializedName("git_commits_url")
    private val gitCommitsUrl: String? = null,
    @SerializedName("git_refs_url")
    private val gitRefsUrl: String? = null,
    @SerializedName("git_tags_url")
    private val gitTagsUrl: String? = null,
    @SerializedName("git_url")
    private val gitUrl: String? = null,
    @SerializedName("has_downloads")
    private val hasDownloads: Boolean = false,
    @SerializedName("has_issues")
    private val hasIssues: Boolean = false,
    @SerializedName("has_pages")
    private val hasPages: Boolean = false,
    @SerializedName("has_projects")
    private val hasProjects: Boolean = false,
    @SerializedName("has_wiki")
    private val hasWiki: Boolean = false,
    @SerializedName("homepage")
    private val homepage: String? = null,
    @SerializedName("hooks_url")
    private val hooksUrl: String? = null,
    @SerializedName("html_url")
    private val htmlUrl: String? = null,
    @SerializedName("id")
    private val id: Int = 0,
    @SerializedName("issue_comment_url")
    private val issueCommentUrl: String? = null,
    @SerializedName("issue_events_url")
    private val issueEventsUrl: String? = null,
    @SerializedName("issues_url")
    private val issuesUrl: String? = null,
    @SerializedName("keys_url")
    private val keysUrl: String? = null,
    @SerializedName("labels_url")
    private val labelsUrl: String? = null,
    @SerializedName("language")
    private val language: String? = null,
    @SerializedName("languages_url")
    private val languagesUrl: String? = null,
    @SerializedName("license")
    private val license: License? = null,
    @SerializedName("merges_url")
    private val mergesUrl: String? = null,
    @SerializedName("milestones_url")
    private val milestonesUrl: String? = null,
    @SerializedName("mirror_url")
    private val mirrorUrl: Any? = null,
    @SerializedName("name")
    private val name: String? = null,
    @SerializedName("node_id")
    private val nodeId: String? = null,
    @SerializedName("notifications_url")
    private val notificationsUrl: String? = null,
    @SerializedName("open_issues")
    private val openIssues: Int = 0,
    @SerializedName("open_issues_count")
    private val openIssuesCount: Int = 0,
    @SerializedName("owner")
    private val owner: Owner? = null,
    @SerializedName("private")
    private val privateField: Boolean = false,
    @SerializedName("pulls_url")
    private val pullsUrl: String? = null,
    @SerializedName("pushed_at")
    private val pushedAt: String? = null,
    @SerializedName("releases_url")
    private val releasesUrl: String? = null,
    @SerializedName("size")
    private val size: Int = 0,
    @SerializedName("ssh_url")
    private val sshUrl: String? = null,
    @SerializedName("stargazers_count")
    private val stargazersCount: Int = 0,
    @SerializedName("stargazers_url")
    private val stargazersUrl: String? = null,
    @SerializedName("statuses_url")
    private val statusesUrl: String? = null,
    @SerializedName("subscribers_url")
    private val subscribersUrl: String? = null,
    @SerializedName("subscription_url")
    private val subscriptionUrl: String? = null,
    @SerializedName("svn_url")
    private val svnUrl: String? = null,
    @SerializedName("tags_url")
    private val tagsUrl: String? = null,
    @SerializedName("teams_url")
    private val teamsUrl: String? = null,
    @SerializedName("trees_url")
    private val treesUrl: String? = null,
    @SerializedName("updated_at")
    private val updatedAt: String? = null,
    @SerializedName("url")
    private val url: String? = null,
    @SerializedName("watchers")
    private val watchers: Int = 0,
    @SerializedName("watchers_count")
    private val watchersCount: Int = 0
)