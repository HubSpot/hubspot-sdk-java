// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCallerIdTest {

    @Test
    fun create() {
        val contactCallerId =
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

        assertThat(contactCallerId.callerIdType()).isEqualTo(ContactCallerId.CallerIdType.CONTACT)
        assertThat(contactCallerId.objectCoordinates())
            .isEqualTo(
                ObjectCoordinates.builder()
                    .objectId(0)
                    .objectTypeId("objectTypeId")
                    .portalId(0)
                    .build()
            )
        assertThat(contactCallerId.email()).contains("email")
        assertThat(contactCallerId.firstName()).contains("firstName")
        assertThat(contactCallerId.lastName()).contains("lastName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactCallerId =
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

        val roundtrippedContactCallerId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactCallerId),
                jacksonTypeRef<ContactCallerId>(),
            )

        assertThat(roundtrippedContactCallerId).isEqualTo(contactCallerId)
    }
}
