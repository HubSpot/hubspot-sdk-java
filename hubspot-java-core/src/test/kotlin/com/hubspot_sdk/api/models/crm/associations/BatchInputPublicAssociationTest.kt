// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicAssociationTest {

    @Test
    fun create() {
        val batchInputPublicAssociation =
            BatchInputPublicAssociation.builder()
                .addInput(
                    PublicAssociation.builder()
                        .from(PublicObjectId.builder().id("53628").build())
                        .to(PublicObjectId.builder().id("12726").build())
                        .type("contact_to_company")
                        .build()
                )
                .build()

        assertThat(batchInputPublicAssociation.inputs())
            .containsExactly(
                PublicAssociation.builder()
                    .from(PublicObjectId.builder().id("53628").build())
                    .to(PublicObjectId.builder().id("12726").build())
                    .type("contact_to_company")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicAssociation =
            BatchInputPublicAssociation.builder()
                .addInput(
                    PublicAssociation.builder()
                        .from(PublicObjectId.builder().id("53628").build())
                        .to(PublicObjectId.builder().id("12726").build())
                        .type("contact_to_company")
                        .build()
                )
                .build()

        val roundtrippedBatchInputPublicAssociation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicAssociation),
                jacksonTypeRef<BatchInputPublicAssociation>(),
            )

        assertThat(roundtrippedBatchInputPublicAssociation).isEqualTo(batchInputPublicAssociation)
    }
}
