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

internal class BatchResponsePublicAssociationDefinitionUserConfigurationTest {

    @Test
    fun create() {
        val batchResponsePublicAssociationDefinitionUserConfiguration =
            BatchResponsePublicAssociationDefinitionUserConfiguration.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationDefinitionUserConfiguration.builder()
                        .category(
                            PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED
                        )
                        .typeId(0)
                        .label("label")
                        .userEnforcedMaxToObjectIds(0)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicAssociationDefinitionUserConfiguration.Status.PENDING)
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
                    BatchResponsePublicAssociationDefinitionUserConfiguration.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.results())
            .containsExactly(
                PublicAssociationDefinitionUserConfiguration.builder()
                    .category(PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED)
                    .typeId(0)
                    .label("label")
                    .userEnforcedMaxToObjectIds(0)
                    .build()
            )
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.status())
            .isEqualTo(BatchResponsePublicAssociationDefinitionUserConfiguration.Status.PENDING)
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.errors().getOrNull())
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
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.links())
            .contains(
                BatchResponsePublicAssociationDefinitionUserConfiguration.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.numErrors())
            .contains(0)
        assertThat(batchResponsePublicAssociationDefinitionUserConfiguration.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicAssociationDefinitionUserConfiguration =
            BatchResponsePublicAssociationDefinitionUserConfiguration.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationDefinitionUserConfiguration.builder()
                        .category(
                            PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED
                        )
                        .typeId(0)
                        .label("label")
                        .userEnforcedMaxToObjectIds(0)
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicAssociationDefinitionUserConfiguration.Status.PENDING)
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
                    BatchResponsePublicAssociationDefinitionUserConfiguration.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicAssociationDefinitionUserConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    batchResponsePublicAssociationDefinitionUserConfiguration
                ),
                jacksonTypeRef<BatchResponsePublicAssociationDefinitionUserConfiguration>(),
            )

        assertThat(roundtrippedBatchResponsePublicAssociationDefinitionUserConfiguration)
            .isEqualTo(batchResponsePublicAssociationDefinitionUserConfiguration)
    }
}
