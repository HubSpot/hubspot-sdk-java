// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeListParamsTest {

    @Test
    fun create() {
        MediaBridgeListParams.builder()
            .mediaType(MediaBridgeListParams.MediaType.AUDIO)
            .after("after")
            .limit(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeListParams.builder().mediaType(MediaBridgeListParams.MediaType.AUDIO).build()

        assertThat(params._pathParam(0)).isEqualTo("AUDIO")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MediaBridgeListParams.builder()
                .mediaType(MediaBridgeListParams.MediaType.AUDIO)
                .after("after")
                .limit(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("after", "after").put("limit", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MediaBridgeListParams.builder().mediaType(MediaBridgeListParams.MediaType.AUDIO).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
