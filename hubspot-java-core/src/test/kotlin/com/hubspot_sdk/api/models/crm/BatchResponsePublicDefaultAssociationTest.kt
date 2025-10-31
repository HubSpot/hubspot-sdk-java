// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicDefaultAssociationTest {

    @Test
    fun create() {
        val batchResponsePublicDefaultAssociation =
            BatchResponsePublicDefaultAssociation.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicDefaultAssociation.builder()
                        .associationSpec(
                            AssociationSpec.builder()
                                .associationCategory(
                                    AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                )
                                .associationTypeId(0)
                                .build()
                        )
                        .from(PublicObjectId.builder().id("id").build())
                        .to(PublicObjectId.builder().id("id").build())
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicDefaultAssociation.Status.PENDING)
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
                    BatchResponsePublicDefaultAssociation.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicDefaultAssociation.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicDefaultAssociation.results())
            .containsExactly(
                PublicDefaultAssociation.builder()
                    .associationSpec(
                        AssociationSpec.builder()
                            .associationCategory(
                                AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                            )
                            .associationTypeId(0)
                            .build()
                    )
                    .from(PublicObjectId.builder().id("id").build())
                    .to(PublicObjectId.builder().id("id").build())
                    .build()
            )
        assertThat(batchResponsePublicDefaultAssociation.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicDefaultAssociation.status())
            .isEqualTo(BatchResponsePublicDefaultAssociation.Status.PENDING)
        assertThat(batchResponsePublicDefaultAssociation.errors().getOrNull())
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
        assertThat(batchResponsePublicDefaultAssociation.links())
            .contains(
                BatchResponsePublicDefaultAssociation.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicDefaultAssociation.numErrors()).contains(0)
        assertThat(batchResponsePublicDefaultAssociation.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicDefaultAssociation =
            BatchResponsePublicDefaultAssociation.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicDefaultAssociation.builder()
                        .associationSpec(
                            AssociationSpec.builder()
                                .associationCategory(
                                    AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                )
                                .associationTypeId(0)
                                .build()
                        )
                        .from(PublicObjectId.builder().id("id").build())
                        .to(PublicObjectId.builder().id("id").build())
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicDefaultAssociation.Status.PENDING)
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
                    BatchResponsePublicDefaultAssociation.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicDefaultAssociation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicDefaultAssociation),
                jacksonTypeRef<BatchResponsePublicDefaultAssociation>(),
            )

        assertThat(roundtrippedBatchResponsePublicDefaultAssociation)
            .isEqualTo(batchResponsePublicDefaultAssociation)
    }
}
