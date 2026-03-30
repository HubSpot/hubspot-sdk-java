// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

import com.hubspot_sdk.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingCreateInboundCallParamsTest {

    @Test
    fun create() {
        CallingCreateInboundCallParams.builder()
            .completedThirdPartyCallRequest(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CallingCreateInboundCallParams.builder()
                .completedThirdPartyCallRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallingCreateInboundCallParams.builder()
                .completedThirdPartyCallRequest(
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
                                .build()
                        )
                        .addPotentialRecipientUserId(0)
                        .toNumber(
                            FormattedPhoneNumber.builder()
                                .e164Number("e164Number")
                                .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                            .build()
                    )
                    .addPotentialRecipientUserId(0)
                    .toNumber(
                        FormattedPhoneNumber.builder()
                            .e164Number("e164Number")
                            .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                            .build()
                    )
                    .build()
            )
    }
}
