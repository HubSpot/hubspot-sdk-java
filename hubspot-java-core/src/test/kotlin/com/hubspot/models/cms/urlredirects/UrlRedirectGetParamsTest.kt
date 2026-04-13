// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.urlredirects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectGetParamsTest {

    @Test
    fun create() {
        UrlRedirectGetParams.builder().urlRedirectId("urlRedirectId").build()
    }

    @Test
    fun pathParams() {
        val params = UrlRedirectGetParams.builder().urlRedirectId("urlRedirectId").build()

        assertThat(params._pathParam(0)).isEqualTo("urlRedirectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
