// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicObjectBatchInputForCreateTest {

    @Test
    fun create() {
        val simplePublicObjectBatchInputForCreate =
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

        assertThat(simplePublicObjectBatchInputForCreate.associations())
            .containsExactly(
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
        assertThat(simplePublicObjectBatchInputForCreate.properties())
            .isEqualTo(
                SimplePublicObjectBatchInputForCreate.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(simplePublicObjectBatchInputForCreate.objectWriteTraceId())
            .contains("objectWriteTraceId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicObjectBatchInputForCreate =
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

        val roundtrippedSimplePublicObjectBatchInputForCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicObjectBatchInputForCreate),
                jacksonTypeRef<SimplePublicObjectBatchInputForCreate>(),
            )

        assertThat(roundtrippedSimplePublicObjectBatchInputForCreate)
            .isEqualTo(simplePublicObjectBatchInputForCreate)
    }
}
