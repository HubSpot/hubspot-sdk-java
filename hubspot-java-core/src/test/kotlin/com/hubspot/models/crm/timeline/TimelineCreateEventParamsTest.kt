// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.timeline

import com.hubspot.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineCreateEventParamsTest {

    @Test
    fun create() {
        TimelineCreateEventParams.builder()
            .appEventOccurrence(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TimelineCreateEventParams.builder()
                .appEventOccurrence(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TimelineCreateEventParams.builder()
                .appEventOccurrence(
                    AppEventOccurrence.builder()
                        .id("id")
                        .eventTypeName("eventTypeName")
                        .properties(
                            AppEventOccurrence.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AppEventOccurrence.builder()
                    .id("id")
                    .eventTypeName("eventTypeName")
                    .properties(
                        AppEventOccurrence.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
