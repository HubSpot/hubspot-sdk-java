// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.urlredirects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectDeleteUrlMappingParamsTest {

    @Test
    fun create() {
        UrlRedirectDeleteUrlMappingParams.builder().id(0L).build()
    }

    @Test
    fun pathParams() {
        val params = UrlRedirectDeleteUrlMappingParams.builder().id(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
