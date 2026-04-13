// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletedThirdPartyCallRequestTest {

    @Test
    fun create() {
        val completedThirdPartyCallRequest =
            CompletedThirdPartyCallRequest.builder()
                .createEngagement(true)
                .engagementProperties(
                    CompletedThirdPartyCallRequest.EngagementProperties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .externalCallId("externalCallId")
                .finalCallStatus(CompletedThirdPartyCallRequest.FinalCallStatus.BUSY)
                .fromNumber(
                    FormattedPhoneNumber.builder()
                        .e164Number("e164Number")
                        .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                        .extension("extension")
                        .build()
                )
                .addPotentialRecipientUserId(0)
                .toNumber(
                    FormattedPhoneNumber.builder()
                        .e164Number("e164Number")
                        .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                        .extension("extension")
                        .build()
                )
                .callStartedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .durationSeconds(0)
                .userId(0)
                .build()

        assertThat(completedThirdPartyCallRequest.createEngagement()).isEqualTo(true)
        assertThat(completedThirdPartyCallRequest.engagementProperties())
            .isEqualTo(
                CompletedThirdPartyCallRequest.EngagementProperties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(completedThirdPartyCallRequest.externalCallId()).isEqualTo("externalCallId")
        assertThat(completedThirdPartyCallRequest.finalCallStatus())
            .isEqualTo(CompletedThirdPartyCallRequest.FinalCallStatus.BUSY)
        assertThat(completedThirdPartyCallRequest.fromNumber())
            .isEqualTo(
                FormattedPhoneNumber.builder()
                    .e164Number("e164Number")
                    .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                    .extension("extension")
                    .build()
            )
        assertThat(completedThirdPartyCallRequest.potentialRecipientUserIds()).containsExactly(0)
        assertThat(completedThirdPartyCallRequest.toNumber())
            .isEqualTo(
                FormattedPhoneNumber.builder()
                    .e164Number("e164Number")
                    .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                    .extension("extension")
                    .build()
            )
        assertThat(completedThirdPartyCallRequest.callStartedTimestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(completedThirdPartyCallRequest.durationSeconds()).contains(0)
        assertThat(completedThirdPartyCallRequest.userId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val completedThirdPartyCallRequest =
            CompletedThirdPartyCallRequest.builder()
                .createEngagement(true)
                .engagementProperties(
                    CompletedThirdPartyCallRequest.EngagementProperties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .externalCallId("externalCallId")
                .finalCallStatus(CompletedThirdPartyCallRequest.FinalCallStatus.BUSY)
                .fromNumber(
                    FormattedPhoneNumber.builder()
                        .e164Number("e164Number")
                        .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                        .extension("extension")
                        .build()
                )
                .addPotentialRecipientUserId(0)
                .toNumber(
                    FormattedPhoneNumber.builder()
                        .e164Number("e164Number")
                        .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                        .extension("extension")
                        .build()
                )
                .callStartedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .durationSeconds(0)
                .userId(0)
                .build()

        val roundtrippedCompletedThirdPartyCallRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(completedThirdPartyCallRequest),
                jacksonTypeRef<CompletedThirdPartyCallRequest>(),
            )

        assertThat(roundtrippedCompletedThirdPartyCallRequest)
            .isEqualTo(completedThirdPartyCallRequest)
    }
}
