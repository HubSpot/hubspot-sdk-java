// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.models.AssociationSpec
import com.hubspot.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputSimplePublicObjectBatchInputForCreateTest {

    @Test
    fun create() {
        val batchInputSimplePublicObjectBatchInputForCreate =
            BatchInputSimplePublicObjectBatchInputForCreate.builder()
                .addInput(
                    SimplePublicObjectBatchInputForCreate.builder()
                        .addAssociation(
                            PublicAssociationsForObject.builder()
                                .to(PublicObjectId.builder().id("id").build())
                                .addType(
                                    AssociationSpec.builder()
                                        .associationCategory(
                                            AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                        )
                                        .associationTypeId(0)
                                        .build()
                                )
                                .build()
                        )
                        .properties(
                            SimplePublicObjectBatchInputForCreate.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .objectWriteTraceId("objectWriteTraceId")
                        .build()
                )
                .build()

        assertThat(batchInputSimplePublicObjectBatchInputForCreate.inputs())
            .containsExactly(
                SimplePublicObjectBatchInputForCreate.builder()
                    .addAssociation(
                        PublicAssociationsForObject.builder()
                            .to(PublicObjectId.builder().id("id").build())
                            .addType(
                                AssociationSpec.builder()
                                    .associationCategory(
                                        AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                    )
                                    .associationTypeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .properties(
                        SimplePublicObjectBatchInputForCreate.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .objectWriteTraceId("objectWriteTraceId")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputSimplePublicObjectBatchInputForCreate =
            BatchInputSimplePublicObjectBatchInputForCreate.builder()
                .addInput(
                    SimplePublicObjectBatchInputForCreate.builder()
                        .addAssociation(
                            PublicAssociationsForObject.builder()
                                .to(PublicObjectId.builder().id("id").build())
                                .addType(
                                    AssociationSpec.builder()
                                        .associationCategory(
                                            AssociationSpec.AssociationCategory.HUBSPOT_DEFINED
                                        )
                                        .associationTypeId(0)
                                        .build()
                                )
                                .build()
                        )
                        .properties(
                            SimplePublicObjectBatchInputForCreate.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .objectWriteTraceId("objectWriteTraceId")
                        .build()
                )
                .build()

        val roundtrippedBatchInputSimplePublicObjectBatchInputForCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputSimplePublicObjectBatchInputForCreate),
                jacksonTypeRef<BatchInputSimplePublicObjectBatchInputForCreate>(),
            )

        assertThat(roundtrippedBatchInputSimplePublicObjectBatchInputForCreate)
            .isEqualTo(batchInputSimplePublicObjectBatchInputForCreate)
    }
}
