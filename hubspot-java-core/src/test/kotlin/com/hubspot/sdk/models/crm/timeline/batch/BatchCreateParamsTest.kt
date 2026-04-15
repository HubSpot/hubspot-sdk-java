// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.timeline.batch

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.crm.timeline.AppEventOccurrence
import com.hubspot.sdk.models.crm.timeline.BatchInputAppEventOccurrence
import com.hubspot.sdk.models.crm.timeline.TimelineEventIFrame
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Test
    fun create() {
        BatchCreateParams.builder()
            .batchInputAppEventOccurrence(
                BatchInputAppEventOccurrence.builder()
                    .addInput(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BatchCreateParams.builder()
                .batchInputAppEventOccurrence(
                    BatchInputAppEventOccurrence.builder()
                        .addInput(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputAppEventOccurrence.builder()
                    .addInput(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchCreateParams.builder()
                .batchInputAppEventOccurrence(
                    BatchInputAppEventOccurrence.builder()
                        .addInput(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputAppEventOccurrence.builder()
                    .addInput(
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
            )
    }
}
