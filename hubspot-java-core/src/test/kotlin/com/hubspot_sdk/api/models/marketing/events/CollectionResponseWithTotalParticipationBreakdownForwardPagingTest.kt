// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalParticipationBreakdownForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalParticipationBreakdownForwardPaging =
            CollectionResponseWithTotalParticipationBreakdownForwardPaging.builder()
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
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalParticipationBreakdownForwardPaging.results())
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
        assertThat(collectionResponseWithTotalParticipationBreakdownForwardPaging.total())
            .isEqualTo(0)
        assertThat(collectionResponseWithTotalParticipationBreakdownForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalParticipationBreakdownForwardPaging =
            CollectionResponseWithTotalParticipationBreakdownForwardPaging.builder()
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
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalParticipationBreakdownForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalParticipationBreakdownForwardPaging
                ),
                jacksonTypeRef<CollectionResponseWithTotalParticipationBreakdownForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalParticipationBreakdownForwardPaging)
            .isEqualTo(collectionResponseWithTotalParticipationBreakdownForwardPaging)
    }
}
