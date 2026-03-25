// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletedThirdPartyCallResponseTest {

    @Test
    fun create() {
        val completedThirdPartyCallResponse =
            CompletedThirdPartyCallResponse.builder()
                .addCallerIdMatch(
                    ContactCallerId.builder()
                        .callerIdType(ContactCallerId.CallerIdType.CONTACT)
                        .objectCoordinates(
                            ObjectCoordinates.builder()
                                .objectId(0)
                                .objectTypeId("objectTypeId")
                                .portalId(0)
                                .build()
                        )
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .build()

        assertThat(completedThirdPartyCallResponse.callerIdMatches())
            .containsExactly(
                CompletedThirdPartyCallResponse.CallerIdMatch.ofContactCallerId(
                    ContactCallerId.builder()
                        .callerIdType(ContactCallerId.CallerIdType.CONTACT)
                        .objectCoordinates(
                            ObjectCoordinates.builder()
                                .objectId(0)
                                .objectTypeId("objectTypeId")
                                .portalId(0)
                                .build()
                        )
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val completedThirdPartyCallResponse =
            CompletedThirdPartyCallResponse.builder()
                .addCallerIdMatch(
                    ContactCallerId.builder()
                        .callerIdType(ContactCallerId.CallerIdType.CONTACT)
                        .objectCoordinates(
                            ObjectCoordinates.builder()
                                .objectId(0)
                                .objectTypeId("objectTypeId")
                                .portalId(0)
                                .build()
                        )
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .build()

        val roundtrippedCompletedThirdPartyCallResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(completedThirdPartyCallResponse),
                jacksonTypeRef<CompletedThirdPartyCallResponse>(),
            )

        assertThat(roundtrippedCompletedThirdPartyCallResponse)
            .isEqualTo(completedThirdPartyCallResponse)
    }
}
