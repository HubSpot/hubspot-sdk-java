// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicAssociationDefinitionConfigurationUpdateResultTest {

    @Test
    fun create() {
        val batchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationDefinitionConfigurationUpdateResult.builder()
                        .category(
                            PublicAssociationDefinitionConfigurationUpdateResult.Category
                                .HUBSPOT_DEFINED
                        )
                        .typeId(0)
                        .userEnforcedMaxToObjectIds(0)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(
                    BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Status.PENDING
                )
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
                    BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Links
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.results())
            .containsExactly(
                PublicAssociationDefinitionConfigurationUpdateResult.builder()
                    .category(
                        PublicAssociationDefinitionConfigurationUpdateResult.Category
                            .HUBSPOT_DEFINED
                    )
                    .typeId(0)
                    .userEnforcedMaxToObjectIds(0)
                    .build()
            )
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.status())
            .isEqualTo(
                BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Status.PENDING
            )
        assertThat(
                batchResponsePublicAssociationDefinitionConfigurationUpdateResult
                    .errors()
                    .getOrNull()
            )
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
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.links())
            .contains(
                BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.numErrors())
            .contains(0)
        assertThat(batchResponsePublicAssociationDefinitionConfigurationUpdateResult.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationDefinitionConfigurationUpdateResult.builder()
                        .category(
                            PublicAssociationDefinitionConfigurationUpdateResult.Category
                                .HUBSPOT_DEFINED
                        )
                        .typeId(0)
                        .userEnforcedMaxToObjectIds(0)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(
                    BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Status.PENDING
                )
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
                    BatchResponsePublicAssociationDefinitionConfigurationUpdateResult.Links
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    batchResponsePublicAssociationDefinitionConfigurationUpdateResult
                ),
                jacksonTypeRef<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>(),
            )

        assertThat(roundtrippedBatchResponsePublicAssociationDefinitionConfigurationUpdateResult)
            .isEqualTo(batchResponsePublicAssociationDefinitionConfigurationUpdateResult)
    }
}
