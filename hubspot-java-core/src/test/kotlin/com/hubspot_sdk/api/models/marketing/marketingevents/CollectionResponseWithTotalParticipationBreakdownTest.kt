// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalParticipationBreakdownTest {

    @Test
    fun create() {
        val collectionResponseWithTotalParticipationBreakdown =
            CollectionResponseWithTotalParticipationBreakdown.builder()
                .addResult(
                    ParticipationBreakdown.builder()
                        .id("id")
                        .associations(
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
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            ParticipationProperties.builder()
                                .attendanceState(ParticipationProperties.AttendanceState.ATTENDED)
                                .occurredAt(0L)
                                .attendanceDurationSeconds(0)
                                .attendancePercentage("attendancePercentage")
                                .build()
                        )
                        .build()
                )
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalParticipationBreakdown.results())
            .containsExactly(
                ParticipationBreakdown.builder()
                    .id("id")
                    .associations(
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
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .properties(
                        ParticipationProperties.builder()
                            .attendanceState(ParticipationProperties.AttendanceState.ATTENDED)
                            .occurredAt(0L)
                            .attendanceDurationSeconds(0)
                            .attendancePercentage("attendancePercentage")
                            .build()
                    )
                    .build()
            )
        assertThat(collectionResponseWithTotalParticipationBreakdown.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalParticipationBreakdown.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalParticipationBreakdown =
            CollectionResponseWithTotalParticipationBreakdown.builder()
                .addResult(
                    ParticipationBreakdown.builder()
                        .id("id")
                        .associations(
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
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .properties(
                            ParticipationProperties.builder()
                                .attendanceState(ParticipationProperties.AttendanceState.ATTENDED)
                                .occurredAt(0L)
                                .attendanceDurationSeconds(0)
                                .attendancePercentage("attendancePercentage")
                                .build()
                        )
                        .build()
                )
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalParticipationBreakdown =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalParticipationBreakdown),
                jacksonTypeRef<CollectionResponseWithTotalParticipationBreakdown>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalParticipationBreakdown)
            .isEqualTo(collectionResponseWithTotalParticipationBreakdown)
    }
}
