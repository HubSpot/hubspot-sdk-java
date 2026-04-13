// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionConfirmationBodyTest {

    @Test
    fun create() {
        val actionConfirmationBody =
            ActionConfirmationBody.builder()
                .cancelButtonLabel("cancelButtonLabel")
                .confirmButtonLabel("confirmButtonLabel")
                .prompt("prompt")
                .build()

        assertThat(actionConfirmationBody.cancelButtonLabel()).isEqualTo("cancelButtonLabel")
        assertThat(actionConfirmationBody.confirmButtonLabel()).isEqualTo("confirmButtonLabel")
        assertThat(actionConfirmationBody.prompt()).isEqualTo("prompt")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionConfirmationBody =
            ActionConfirmationBody.builder()
                .cancelButtonLabel("cancelButtonLabel")
                .confirmButtonLabel("confirmButtonLabel")
                .prompt("prompt")
                .build()

        val roundtrippedActionConfirmationBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionConfirmationBody),
                jacksonTypeRef<ActionConfirmationBody>(),
            )

        assertThat(roundtrippedActionConfirmationBody).isEqualTo(actionConfirmationBody)
    }
}
