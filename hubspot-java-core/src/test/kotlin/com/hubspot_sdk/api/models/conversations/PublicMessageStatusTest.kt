// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicMessageStatusTest {

    @Test
    fun create() {
        val publicMessageStatus =
            PublicMessageStatus.builder()
                .statusType(PublicMessageStatus.StatusType.FAILED)
                .failureDetails(
                    PublicMessageFailureDetails.builder()
                        .errorMessageTokens(
                            PublicMessageFailureDetails.ErrorMessageTokens.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .errorMessage("errorMessage")
                        .build()
                )
                .build()

        assertThat(publicMessageStatus.statusType())
            .isEqualTo(PublicMessageStatus.StatusType.FAILED)
        assertThat(publicMessageStatus.failureDetails())
            .contains(
                PublicMessageFailureDetails.builder()
                    .errorMessageTokens(
                        PublicMessageFailureDetails.ErrorMessageTokens.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .errorMessage("errorMessage")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessageStatus =
            PublicMessageStatus.builder()
                .statusType(PublicMessageStatus.StatusType.FAILED)
                .failureDetails(
                    PublicMessageFailureDetails.builder()
                        .errorMessageTokens(
                            PublicMessageFailureDetails.ErrorMessageTokens.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .errorMessage("errorMessage")
                        .build()
                )
                .build()

        val roundtrippedPublicMessageStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessageStatus),
                jacksonTypeRef<PublicMessageStatus>(),
            )

        assertThat(roundtrippedPublicMessageStatus).isEqualTo(publicMessageStatus)
    }
}
