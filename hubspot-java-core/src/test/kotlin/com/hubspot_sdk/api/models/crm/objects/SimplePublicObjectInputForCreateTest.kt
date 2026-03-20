// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicObjectInputForCreateTest {

    @Test
    fun create() {
        val simplePublicObjectInputForCreate =
            SimplePublicObjectInputForCreate.builder()
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
                    SimplePublicObjectInputForCreate.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(simplePublicObjectInputForCreate.associations())
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
        assertThat(simplePublicObjectInputForCreate.properties())
            .isEqualTo(
                SimplePublicObjectInputForCreate.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicObjectInputForCreate =
            SimplePublicObjectInputForCreate.builder()
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
                    SimplePublicObjectInputForCreate.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedSimplePublicObjectInputForCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicObjectInputForCreate),
                jacksonTypeRef<SimplePublicObjectInputForCreate>(),
            )

        assertThat(roundtrippedSimplePublicObjectInputForCreate)
            .isEqualTo(simplePublicObjectInputForCreate)
    }
}
