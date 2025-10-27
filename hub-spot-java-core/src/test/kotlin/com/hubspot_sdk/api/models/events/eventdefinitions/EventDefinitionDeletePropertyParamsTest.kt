// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDefinitionDeletePropertyParamsTest {

    @Test
    fun create() {
        EventDefinitionDeletePropertyParams.builder()
            .eventName("eventName")
            .propertyName("propertyName")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventDefinitionDeletePropertyParams.builder()
                .eventName("eventName")
                .propertyName("propertyName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("eventName")
        assertThat(params._pathParam(1)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
