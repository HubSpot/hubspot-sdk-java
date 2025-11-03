// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.StandardError
import com.hubspot_sdk.api.models.crm.AssociatedId
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicAssociationMultiTest {

    @Test
    fun create() {
        val batchResponsePublicAssociationMulti =
            BatchResponsePublicAssociationMulti.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationMulti.builder()
                        .from(PublicObjectId.builder().id("53628").build())
                        .addTo(
                            AssociatedId.builder().id("12726").type("contact_to_company").build()
                        )
                        .addTo(
                            AssociatedId.builder().id("61352").type("contact_to_company").build()
                        )
                        .paging(
                            EmailsPaging.builder()
                                .next(NextPage.builder().after("").link("").build())
                                .prev(PreviousPage.builder().before("before").link("link").build())
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicAssociationMulti.Status.PENDING)
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
                    BatchResponsePublicAssociationMulti.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicAssociationMulti.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationMulti.results())
            .containsExactly(
                PublicAssociationMulti.builder()
                    .from(PublicObjectId.builder().id("53628").build())
                    .addTo(AssociatedId.builder().id("12726").type("contact_to_company").build())
                    .addTo(AssociatedId.builder().id("61352").type("contact_to_company").build())
                    .paging(
                        EmailsPaging.builder()
                            .next(NextPage.builder().after("").link("").build())
                            .prev(PreviousPage.builder().before("before").link("link").build())
                            .build()
                    )
                    .build()
            )
        assertThat(batchResponsePublicAssociationMulti.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationMulti.status())
            .isEqualTo(BatchResponsePublicAssociationMulti.Status.PENDING)
        assertThat(batchResponsePublicAssociationMulti.errors().getOrNull())
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
        assertThat(batchResponsePublicAssociationMulti.links())
            .contains(
                BatchResponsePublicAssociationMulti.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicAssociationMulti.numErrors()).contains(0)
        assertThat(batchResponsePublicAssociationMulti.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicAssociationMulti =
            BatchResponsePublicAssociationMulti.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationMulti.builder()
                        .from(PublicObjectId.builder().id("53628").build())
                        .addTo(
                            AssociatedId.builder().id("12726").type("contact_to_company").build()
                        )
                        .addTo(
                            AssociatedId.builder().id("61352").type("contact_to_company").build()
                        )
                        .paging(
                            EmailsPaging.builder()
                                .next(NextPage.builder().after("").link("").build())
                                .prev(PreviousPage.builder().before("before").link("link").build())
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicAssociationMulti.Status.PENDING)
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
                    BatchResponsePublicAssociationMulti.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicAssociationMulti =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicAssociationMulti),
                jacksonTypeRef<BatchResponsePublicAssociationMulti>(),
            )

        assertThat(roundtrippedBatchResponsePublicAssociationMulti)
            .isEqualTo(batchResponsePublicAssociationMulti)
    }
}
