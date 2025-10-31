// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDefinitionGetParamsTest {

    @Test
    fun create() {
        EventDefinitionGetParams.builder().eventName("eventName").build()
    }

    @Test
    fun pathParams() {
        val params = EventDefinitionGetParams.builder().eventName("eventName").build()

        assertThat(params._pathParam(0)).isEqualTo("eventName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
