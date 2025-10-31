// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicActorWithErrorsTest {

    @Test
    fun create() {
        val batchResponsePublicActorWithErrors =
            BatchResponsePublicActorWithErrors.builder()
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
                .status(BatchResponsePublicActorWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponsePublicActorWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicActorWithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicActorWithErrors.results())
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
        assertThat(batchResponsePublicActorWithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicActorWithErrors.status())
            .isEqualTo(BatchResponsePublicActorWithErrors.Status.PENDING)
        assertThat(batchResponsePublicActorWithErrors.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("")
                    .context(
                        StandardError.Context.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addError(
                        ErrorDetail.builder()
                            .message("message")
                            .code("code")
                            .context(
                                ErrorDetail.Context.builder()
                                    .putAdditionalProperty(
                                        "missingScopes",
                                        JsonValue.from(listOf("scope1", "scope2")),
                                    )
                                    .build()
                            )
                            .in_("in")
                            .subCategory("subCategory")
                            .build()
                    )
                    .links(
                        StandardError.Links.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .message("")
                    .status("")
                    .id("")
                    .subCategory(JsonValue.from(""))
                    .build()
            )
        assertThat(batchResponsePublicActorWithErrors.links())
            .contains(
                BatchResponsePublicActorWithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicActorWithErrors.numErrors()).contains(0)
        assertThat(batchResponsePublicActorWithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicActorWithErrors =
            BatchResponsePublicActorWithErrors.builder()
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
                .status(BatchResponsePublicActorWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponsePublicActorWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicActorWithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicActorWithErrors),
                jacksonTypeRef<BatchResponsePublicActorWithErrors>(),
            )

        assertThat(roundtrippedBatchResponsePublicActorWithErrors)
            .isEqualTo(batchResponsePublicActorWithErrors)
    }
}
