// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.AssociationSpec
import com.hubspot_sdk.api.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAssociationCreateRequestTest {

    @Test
    fun create() {
        val externalAssociationCreateRequest =
            ExternalAssociationCreateRequest.builder()
                .to(PublicObjectId.builder().id("id").build())
                .addType(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .build()

        assertThat(externalAssociationCreateRequest.to())
            .isEqualTo(PublicObjectId.builder().id("id").build())
        assertThat(externalAssociationCreateRequest.types())
            .containsExactly(
                AssociationSpec.builder()
                    .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                    .associationTypeId(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAssociationCreateRequest =
            ExternalAssociationCreateRequest.builder()
                .to(PublicObjectId.builder().id("id").build())
                .addType(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .build()

        val roundtrippedExternalAssociationCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAssociationCreateRequest),
                jacksonTypeRef<ExternalAssociationCreateRequest>(),
            )

        assertThat(roundtrippedExternalAssociationCreateRequest)
            .isEqualTo(externalAssociationCreateRequest)
    }
}
