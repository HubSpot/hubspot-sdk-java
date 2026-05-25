// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooksjournal.subscriptions.filters

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterDeleteParamsTest {

    @Test
    fun create() {
        FilterDeleteParams.builder().filterId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = FilterDeleteParams.builder().filterId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
