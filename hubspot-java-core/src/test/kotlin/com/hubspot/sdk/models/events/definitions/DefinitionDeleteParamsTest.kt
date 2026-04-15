// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionDeleteParamsTest {

    @Test
    fun create() {
        DefinitionDeleteParams.builder().eventName("eventName").build()
    }

    @Test
    fun pathParams() {
        val params = DefinitionDeleteParams.builder().eventName("eventName").build()

        assertThat(params._pathParam(0)).isEqualTo("eventName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
