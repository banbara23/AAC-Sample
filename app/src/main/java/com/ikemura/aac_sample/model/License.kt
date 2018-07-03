package com.ikemura.aac_sample.model

import com.google.gson.annotations.SerializedName

/**
 * ライセンス
 */
data class License(
    @SerializedName("key")
    private var key: String? = null,
    @SerializedName("name")
    private var name: String? = null,
    @SerializedName("node_id")
    private var nodeId: String? = null,
    @SerializedName("spdx_id")
    private var spdxId: String? = null,
    @SerializedName("url")
    private var url: String? = null
)