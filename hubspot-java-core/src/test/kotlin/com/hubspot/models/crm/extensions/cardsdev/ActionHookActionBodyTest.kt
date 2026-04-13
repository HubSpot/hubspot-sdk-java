// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionHookActionBodyTest {

    @Test
    fun create() {
        val actionHookActionBody =
            ActionHookActionBody.builder()
                .httpMethod(ActionHookActionBody.HttpMethod.CONNECT)
                .addPropertyNamesIncluded("string")
                .type(ActionHookActionBody.Type.ACTION_HOOK)
                .url("url")
                .confirmation(
                    ActionConfirmationBody.builder()
                        .cancelButtonLabel("cancelButtonLabel")
                        .confirmButtonLabel("confirmButtonLabel")
                        .prompt("prompt")
                        .build()
                )
                .label("label")
                .build()

        assertThat(actionHookActionBody.httpMethod())
            .isEqualTo(ActionHookActionBody.HttpMethod.CONNECT)
        assertThat(actionHookActionBody.propertyNamesIncluded()).containsExactly("string")
        assertThat(actionHookActionBody.type()).isEqualTo(ActionHookActionBody.Type.ACTION_HOOK)
        assertThat(actionHookActionBody.url()).isEqualTo("url")
        assertThat(actionHookActionBody.confirmation())
            .contains(
                ActionConfirmationBody.builder()
                    .cancelButtonLabel("cancelButtonLabel")
                    .confirmButtonLabel("confirmButtonLabel")
                    .prompt("prompt")
                    .build()
            )
        assertThat(actionHookActionBody.label()).contains("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionHookActionBody =
            ActionHookActionBody.builder()
                .httpMethod(ActionHookActionBody.HttpMethod.CONNECT)
                .addPropertyNamesIncluded("string")
                .type(ActionHookActionBody.Type.ACTION_HOOK)
                .url("url")
                .confirmation(
                    ActionConfirmationBody.builder()
                        .cancelButtonLabel("cancelButtonLabel")
                        .confirmButtonLabel("confirmButtonLabel")
                        .prompt("prompt")
                        .build()
                )
                .label("label")
                .build()

        val roundtrippedActionHookActionBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionHookActionBody),
                jacksonTypeRef<ActionHookActionBody>(),
            )

        assertThat(roundtrippedActionHookActionBody).isEqualTo(actionHookActionBody)
    }
}
