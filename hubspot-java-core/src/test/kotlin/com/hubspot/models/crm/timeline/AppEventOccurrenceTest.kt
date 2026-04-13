// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppEventOccurrenceTest {

    @Test
    fun create() {
        val appEventOccurrence =
            AppEventOccurrence.builder()
                .id("id")
                .eventTypeName("eventTypeName")
                .properties(
                    AppEventOccurrence.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .domain("domain")
                .email("email")
                .extraData(JsonValue.from(mapOf<String, Any>()))
                .objectId("objectId")
                .objectTypeFullyQualifiedName("objectTypeFullyQualifiedName")
                .timelineIFrame(
                    TimelineEventIFrame.builder()
                        .headerLabel("headerLabel")
                        .height(0)
                        .linkLabel("linkLabel")
                        .url("url")
                        .width(0)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .utk("utk")
                .build()

        assertThat(appEventOccurrence.id()).isEqualTo("id")
        assertThat(appEventOccurrence.eventTypeName()).isEqualTo("eventTypeName")
        assertThat(appEventOccurrence.properties())
            .isEqualTo(
                AppEventOccurrence.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(appEventOccurrence.domain()).contains("domain")
        assertThat(appEventOccurrence.email()).contains("email")
        assertThat(appEventOccurrence._extraData()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(appEventOccurrence.objectId()).contains("objectId")
        assertThat(appEventOccurrence.objectTypeFullyQualifiedName())
            .contains("objectTypeFullyQualifiedName")
        assertThat(appEventOccurrence.timelineIFrame())
            .contains(
                TimelineEventIFrame.builder()
                    .headerLabel("headerLabel")
                    .height(0)
                    .linkLabel("linkLabel")
                    .url("url")
                    .width(0)
                    .build()
            )
        assertThat(appEventOccurrence.timestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(appEventOccurrence.utk()).contains("utk")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appEventOccurrence =
            AppEventOccurrence.builder()
                .id("id")
                .eventTypeName("eventTypeName")
                .properties(
                    AppEventOccurrence.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .domain("domain")
                .email("email")
                .extraData(JsonValue.from(mapOf<String, Any>()))
                .objectId("objectId")
                .objectTypeFullyQualifiedName("objectTypeFullyQualifiedName")
                .timelineIFrame(
                    TimelineEventIFrame.builder()
                        .headerLabel("headerLabel")
                        .height(0)
                        .linkLabel("linkLabel")
                        .url("url")
                        .width(0)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .utk("utk")
                .build()

        val roundtrippedAppEventOccurrence =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appEventOccurrence),
                jacksonTypeRef<AppEventOccurrence>(),
            )

        assertThat(roundtrippedAppEventOccurrence).isEqualTo(appEventOccurrence)
    }
}
