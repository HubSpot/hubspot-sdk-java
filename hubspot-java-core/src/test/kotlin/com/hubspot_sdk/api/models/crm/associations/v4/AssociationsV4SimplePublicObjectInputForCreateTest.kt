// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.PublicAssociationsForObject
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationsV4SimplePublicObjectInputForCreateTest {

    @Test
    fun create() {
        val associationsV4SimplePublicObjectInputForCreate =
            AssociationsV4SimplePublicObjectInputForCreate.builder()
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
                    AssociationsV4SimplePublicObjectInputForCreate.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(associationsV4SimplePublicObjectInputForCreate.associations())
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
        assertThat(associationsV4SimplePublicObjectInputForCreate.properties())
            .isEqualTo(
                AssociationsV4SimplePublicObjectInputForCreate.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationsV4SimplePublicObjectInputForCreate =
            AssociationsV4SimplePublicObjectInputForCreate.builder()
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
                    AssociationsV4SimplePublicObjectInputForCreate.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedAssociationsV4SimplePublicObjectInputForCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationsV4SimplePublicObjectInputForCreate),
                jacksonTypeRef<AssociationsV4SimplePublicObjectInputForCreate>(),
            )

        assertThat(roundtrippedAssociationsV4SimplePublicObjectInputForCreate)
            .isEqualTo(associationsV4SimplePublicObjectInputForCreate)
    }
}
