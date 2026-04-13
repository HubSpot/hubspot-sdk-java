// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeListObjectTypesByMediaTypeParamsTest {

    @Test
    fun create() {
        MediaBridgeListObjectTypesByMediaTypeParams.builder()
            .appId(0)
            .mediaType(MediaBridgeListObjectTypesByMediaTypeParams.MediaType.AUDIO)
            .includeFullDefinition(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeListObjectTypesByMediaTypeParams.builder()
                .appId(0)
                .mediaType(MediaBridgeListObjectTypesByMediaTypeParams.MediaType.AUDIO)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("AUDIO")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MediaBridgeListObjectTypesByMediaTypeParams.builder()
                .appId(0)
                .mediaType(MediaBridgeListObjectTypesByMediaTypeParams.MediaType.AUDIO)
                .includeFullDefinition(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("includeFullDefinition", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MediaBridgeListObjectTypesByMediaTypeParams.builder()
                .appId(0)
                .mediaType(MediaBridgeListObjectTypesByMediaTypeParams.MediaType.AUDIO)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
