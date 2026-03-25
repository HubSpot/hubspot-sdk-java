// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendUpdateEventDefinitionParamsTest {

    @Test
    fun create() {
        SendUpdateEventDefinitionParams.builder()
            .eventName("eventName")
            .externalBehavioralEventTypeDefinitionPatch(
                ExternalBehavioralEventTypeDefinitionPatch.builder()
                    .description("description")
                    .label("label")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SendUpdateEventDefinitionParams.builder()
                .eventName("eventName")
                .externalBehavioralEventTypeDefinitionPatch(
                    ExternalBehavioralEventTypeDefinitionPatch.builder().build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("eventName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SendUpdateEventDefinitionParams.builder()
                .eventName("eventName")
                .externalBehavioralEventTypeDefinitionPatch(
                    ExternalBehavioralEventTypeDefinitionPatch.builder()
                        .description("description")
                        .label("label")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalBehavioralEventTypeDefinitionPatch.builder()
                    .description("description")
                    .label("label")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SendUpdateEventDefinitionParams.builder()
                .eventName("eventName")
                .externalBehavioralEventTypeDefinitionPatch(
                    ExternalBehavioralEventTypeDefinitionPatch.builder().build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ExternalBehavioralEventTypeDefinitionPatch.builder().build())
    }
}
