// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDefinitionUpdateParamsTest {

    @Test
    fun create() {
        EventDefinitionUpdateParams.builder()
            .eventName("eventName")
            .description("description")
            .label("label")
            .build()
    }

    @Test
    fun pathParams() {
        val params = EventDefinitionUpdateParams.builder().eventName("eventName").build()

        assertThat(params._pathParam(0)).isEqualTo("eventName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EventDefinitionUpdateParams.builder()
                .eventName("eventName")
                .description("description")
                .label("label")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.label()).contains("label")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EventDefinitionUpdateParams.builder().eventName("eventName").build()

        val body = params._body()
    }
}
