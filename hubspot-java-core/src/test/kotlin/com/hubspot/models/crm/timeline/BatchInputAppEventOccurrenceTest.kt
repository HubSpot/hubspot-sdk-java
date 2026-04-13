// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputAppEventOccurrenceTest {

    @Test
    fun create() {
        val batchInputAppEventOccurrence =
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

        assertThat(batchInputAppEventOccurrence.inputs())
            .containsExactly(
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
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputAppEventOccurrence =
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

        val roundtrippedBatchInputAppEventOccurrence =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputAppEventOccurrence),
                jacksonTypeRef<BatchInputAppEventOccurrence>(),
            )

        assertThat(roundtrippedBatchInputAppEventOccurrence).isEqualTo(batchInputAppEventOccurrence)
    }
}
