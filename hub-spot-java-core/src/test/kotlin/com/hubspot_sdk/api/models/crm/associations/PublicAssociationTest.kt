// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationTest {

    @Test
    fun create() {
        val publicAssociation =
            PublicAssociation.builder()
                .from(PublicObjectId.builder().id("53628").build())
                .to(PublicObjectId.builder().id("12726").build())
                .type("contact_to_company")
                .build()

        assertThat(publicAssociation.from()).isEqualTo(PublicObjectId.builder().id("53628").build())
        assertThat(publicAssociation.to()).isEqualTo(PublicObjectId.builder().id("12726").build())
        assertThat(publicAssociation.type()).isEqualTo("contact_to_company")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociation =
            PublicAssociation.builder()
                .from(PublicObjectId.builder().id("53628").build())
                .to(PublicObjectId.builder().id("12726").build())
                .type("contact_to_company")
                .build()

        val roundtrippedPublicAssociation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociation),
                jacksonTypeRef<PublicAssociation>(),
            )

        assertThat(roundtrippedPublicAssociation).isEqualTo(publicAssociation)
    }
}
