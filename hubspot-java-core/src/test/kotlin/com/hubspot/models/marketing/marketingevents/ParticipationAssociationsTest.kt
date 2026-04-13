// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipationAssociationsTest {

    @Test
    fun create() {
        val participationAssociations =
            ParticipationAssociations.builder()
                .contact(
                    ContactAssociation.builder()
                        .contactId("contactId")
                        .email("email")
                        .firstname("firstname")
                        .lastname("lastname")
                        .build()
                )
                .marketingEvent(
                    MarketingEventAssociation.builder()
                        .marketingEventId("marketingEventId")
                        .name("name")
                        .externalAccountId("externalAccountId")
                        .externalEventId("externalEventId")
                        .build()
                )
                .build()

        assertThat(participationAssociations.contact())
            .isEqualTo(
                ContactAssociation.builder()
                    .contactId("contactId")
                    .email("email")
                    .firstname("firstname")
                    .lastname("lastname")
                    .build()
            )
        assertThat(participationAssociations.marketingEvent())
            .isEqualTo(
                MarketingEventAssociation.builder()
                    .marketingEventId("marketingEventId")
                    .name("name")
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participationAssociations =
            ParticipationAssociations.builder()
                .contact(
                    ContactAssociation.builder()
                        .contactId("contactId")
                        .email("email")
                        .firstname("firstname")
                        .lastname("lastname")
                        .build()
                )
                .marketingEvent(
                    MarketingEventAssociation.builder()
                        .marketingEventId("marketingEventId")
                        .name("name")
                        .externalAccountId("externalAccountId")
                        .externalEventId("externalEventId")
                        .build()
                )
                .build()

        val roundtrippedParticipationAssociations =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participationAssociations),
                jacksonTypeRef<ParticipationAssociations>(),
            )

        assertThat(roundtrippedParticipationAssociations).isEqualTo(participationAssociations)
    }
}
