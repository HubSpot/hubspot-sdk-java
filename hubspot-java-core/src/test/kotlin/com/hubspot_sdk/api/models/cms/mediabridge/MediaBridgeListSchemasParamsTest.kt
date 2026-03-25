// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeListSchemasParamsTest {

    @Test
    fun create() {
        MediaBridgeListSchemasParams.builder().appId("appId").archived(true).build()
    }

    @Test
    fun pathParams() {
        val params = MediaBridgeListSchemasParams.builder().appId("appId").build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = MediaBridgeListSchemasParams.builder().appId("appId").archived(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MediaBridgeListSchemasParams.builder().appId("appId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
