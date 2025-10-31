// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicActorTest {

    @Test
    fun create() {
        val batchResponsePublicActor =
            BatchResponsePublicActor.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    AgentActor.builder()
                        .id("id")
                        .type(AgentActor.Type.AGENT)
                        .avatar("avatar")
                        .email("email")
                        .name("name")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicActor.Status.PENDING)
                .links(
                    BatchResponsePublicActor.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicActor.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicActor.results())
            .containsExactly(
                PublicActor.ofAgent(
                    AgentActor.builder()
                        .id("id")
                        .type(AgentActor.Type.AGENT)
                        .avatar("avatar")
                        .email("email")
                        .name("name")
                        .build()
                )
            )
        assertThat(batchResponsePublicActor.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicActor.status())
            .isEqualTo(BatchResponsePublicActor.Status.PENDING)
        assertThat(batchResponsePublicActor.links())
            .contains(
                BatchResponsePublicActor.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicActor.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicActor =
            BatchResponsePublicActor.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    AgentActor.builder()
                        .id("id")
                        .type(AgentActor.Type.AGENT)
                        .avatar("avatar")
                        .email("email")
                        .name("name")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicActor.Status.PENDING)
                .links(
                    BatchResponsePublicActor.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicActor),
                jacksonTypeRef<BatchResponsePublicActor>(),
            )

        assertThat(roundtrippedBatchResponsePublicActor).isEqualTo(batchResponsePublicActor)
    }
}
