// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeGetPropertyParamsTest {

    @Test
    fun create() {
        MediaBridgeGetPropertyParams.builder()
            .appId(0)
            .objectType("objectType")
            .propertyName("propertyName")
            .archived(true)
            .properties("properties")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeGetPropertyParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyName("propertyName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        assertThat(params._pathParam(2)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MediaBridgeGetPropertyParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyName("propertyName")
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
            MediaBridgeGetPropertyParams.builder()
                .appId(0)
                .objectType("objectType")
                .propertyName("propertyName")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
