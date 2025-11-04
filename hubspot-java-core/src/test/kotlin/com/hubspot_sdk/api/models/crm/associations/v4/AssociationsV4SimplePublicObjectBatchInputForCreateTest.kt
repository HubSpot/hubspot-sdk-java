// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.PublicAssociationsForObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationsV4SimplePublicObjectBatchInputForCreateTest {

    @Test
    fun create() {
        val associationsV4SimplePublicObjectBatchInputForCreate =
            AssociationsV4SimplePublicObjectBatchInputForCreate.builder()
                .addAssociation(
                    PublicAssociationsForObject.builder()
                        .to(PublicObjectId.builder().id("37295").build())
                        .addType(
                            AssociationSpec1.builder()
                                .associationCategory(
                                    AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                )
                                .associationTypeId(0)
                                .build()
                        )
                        .build()
                )
                .properties(
                    AssociationsV4SimplePublicObjectBatchInputForCreate.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .objectWriteTraceId("objectWriteTraceId")
                .build()

        assertThat(associationsV4SimplePublicObjectBatchInputForCreate.associations())
            .containsExactly(
                PublicAssociationsForObject.builder()
                    .to(PublicObjectId.builder().id("37295").build())
                    .addType(
                        AssociationSpec1.builder()
                            .associationCategory(
                                AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                            )
                            .associationTypeId(0)
                            .build()
                    )
                    .build()
            )
        assertThat(associationsV4SimplePublicObjectBatchInputForCreate.properties())
            .isEqualTo(
                AssociationsV4SimplePublicObjectBatchInputForCreate.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(associationsV4SimplePublicObjectBatchInputForCreate.objectWriteTraceId())
            .contains("objectWriteTraceId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationsV4SimplePublicObjectBatchInputForCreate =
            AssociationsV4SimplePublicObjectBatchInputForCreate.builder()
                .addAssociation(
                    PublicAssociationsForObject.builder()
                        .to(PublicObjectId.builder().id("37295").build())
                        .addType(
                            AssociationSpec1.builder()
                                .associationCategory(
                                    AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED
                                )
                                .associationTypeId(0)
                                .build()
                        )
                        .build()
                )
                .properties(
                    AssociationsV4SimplePublicObjectBatchInputForCreate.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .objectWriteTraceId("objectWriteTraceId")
                .build()

        val roundtrippedAssociationsV4SimplePublicObjectBatchInputForCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationsV4SimplePublicObjectBatchInputForCreate),
                jacksonTypeRef<AssociationsV4SimplePublicObjectBatchInputForCreate>(),
            )

        assertThat(roundtrippedAssociationsV4SimplePublicObjectBatchInputForCreate)
            .isEqualTo(associationsV4SimplePublicObjectBatchInputForCreate)
    }
}
