// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeDeleteOembedDomainParamsTest {

    @Test
    fun create() {
        MediaBridgeDeleteOembedDomainParams.builder().appId(0).id(0L).domainPortalId(0).build()
    }

    @Test
    fun pathParams() {
        val params = MediaBridgeDeleteOembedDomainParams.builder().appId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MediaBridgeDeleteOembedDomainParams.builder().appId(0).id(0L).domainPortalId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("id", "0").put("domainPortalId", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MediaBridgeDeleteOembedDomainParams.builder().appId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
