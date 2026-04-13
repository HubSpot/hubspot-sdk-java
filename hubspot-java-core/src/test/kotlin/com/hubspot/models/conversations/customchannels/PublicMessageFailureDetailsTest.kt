// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicMessageFailureDetailsTest {

    @Test
    fun create() {
        val publicMessageFailureDetails =
            PublicMessageFailureDetails.builder()
                .errorMessageTokens(
                    PublicMessageFailureDetails.ErrorMessageTokens.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .errorMessage("errorMessage")
                .build()

        assertThat(publicMessageFailureDetails.errorMessageTokens())
            .isEqualTo(
                PublicMessageFailureDetails.ErrorMessageTokens.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicMessageFailureDetails.errorMessage()).contains("errorMessage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessageFailureDetails =
            PublicMessageFailureDetails.builder()
                .errorMessageTokens(
                    PublicMessageFailureDetails.ErrorMessageTokens.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .errorMessage("errorMessage")
                .build()

        val roundtrippedPublicMessageFailureDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessageFailureDetails),
                jacksonTypeRef<PublicMessageFailureDetails>(),
            )

        assertThat(roundtrippedPublicMessageFailureDetails).isEqualTo(publicMessageFailureDetails)
    }
}
