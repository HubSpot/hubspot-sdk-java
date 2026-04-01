// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.AssociationSpecWithLabel
import com.hubspot_sdk.api.models.crm.MultiAssociatedObjectWithLabel
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicAssociationMultiWithLabelTest {

    @Test
    fun create() {
        val batchResponsePublicAssociationMultiWithLabel =
            BatchResponsePublicAssociationMultiWithLabel.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationMultiWithLabel.builder()
                        .from(PublicObjectId.builder().id("id").build())
                        .addTo(
                            MultiAssociatedObjectWithLabel.builder()
                                .addAssociationType(
                                    AssociationSpecWithLabel.builder()
                                        .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                                        .typeId(0)
                                        .label("label")
                                        .build()
                                )
                                .toObjectId("toObjectId")
                                .build()
                        )
                        .paging(
                            Paging.builder()
                                .next(NextPage.builder().after("after").link("link").build())
                                .prev(PreviousPage.builder().before("before").link("link").build())
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicAssociationMultiWithLabel.Status.CANCELED)
                .links(
                    BatchResponsePublicAssociationMultiWithLabel.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicAssociationMultiWithLabel.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationMultiWithLabel.results())
            .containsExactly(
                PublicAssociationMultiWithLabel.builder()
                    .from(PublicObjectId.builder().id("id").build())
                    .addTo(
                        MultiAssociatedObjectWithLabel.builder()
                            .addAssociationType(
                                AssociationSpecWithLabel.builder()
                                    .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                                    .typeId(0)
                                    .label("label")
                                    .build()
                            )
                            .toObjectId("toObjectId")
                            .build()
                    )
                    .paging(
                        Paging.builder()
                            .next(NextPage.builder().after("after").link("link").build())
                            .prev(PreviousPage.builder().before("before").link("link").build())
                            .build()
                    )
                    .build()
            )
        assertThat(batchResponsePublicAssociationMultiWithLabel.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicAssociationMultiWithLabel.status())
            .isEqualTo(BatchResponsePublicAssociationMultiWithLabel.Status.CANCELED)
        assertThat(batchResponsePublicAssociationMultiWithLabel.links())
            .contains(
                BatchResponsePublicAssociationMultiWithLabel.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicAssociationMultiWithLabel.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicAssociationMultiWithLabel =
            BatchResponsePublicAssociationMultiWithLabel.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicAssociationMultiWithLabel.builder()
                        .from(PublicObjectId.builder().id("id").build())
                        .addTo(
                            MultiAssociatedObjectWithLabel.builder()
                                .addAssociationType(
                                    AssociationSpecWithLabel.builder()
                                        .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                                        .typeId(0)
                                        .label("label")
                                        .build()
                                )
                                .toObjectId("toObjectId")
                                .build()
                        )
                        .paging(
                            Paging.builder()
                                .next(NextPage.builder().after("after").link("link").build())
                                .prev(PreviousPage.builder().before("before").link("link").build())
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicAssociationMultiWithLabel.Status.CANCELED)
                .links(
                    BatchResponsePublicAssociationMultiWithLabel.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicAssociationMultiWithLabel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicAssociationMultiWithLabel),
                jacksonTypeRef<BatchResponsePublicAssociationMultiWithLabel>(),
            )

        assertThat(roundtrippedBatchResponsePublicAssociationMultiWithLabel)
            .isEqualTo(batchResponsePublicAssociationMultiWithLabel)
    }
}
