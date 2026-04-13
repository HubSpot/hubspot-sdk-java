// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeListPropertiesParamsTest {

    @Test
    fun create() {
        MediaBridgeListPropertiesParams.builder()
            .appId(0)
            .objectType("objectType")
            .archived(true)
            .properties("properties")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeListPropertiesParams.builder().appId(0).objectType("objectType").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MediaBridgeListPropertiesParams.builder()
                .appId(0)
                .objectType("objectType")
                .archived(true)
                .properties("properties")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("properties", "properties")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MediaBridgeListPropertiesParams.builder().appId(0).objectType("objectType").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
