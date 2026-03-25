// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionGetParamsTest {

    @Test
    fun create() {
        DefinitionGetParams.builder().eventName("eventName").build()
    }

    @Test
    fun pathParams() {
        val params = DefinitionGetParams.builder().eventName("eventName").build()

        assertThat(params._pathParam(0)).isEqualTo("eventName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
