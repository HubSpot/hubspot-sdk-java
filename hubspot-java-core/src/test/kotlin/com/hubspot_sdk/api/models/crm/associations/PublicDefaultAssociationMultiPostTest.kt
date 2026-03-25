// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDefaultAssociationMultiPostTest {

    @Test
    fun create() {
        val publicDefaultAssociationMultiPost =
            PublicDefaultAssociationMultiPost.builder()
                .from(PublicObjectId.builder().id("id").build())
                .to(PublicObjectId.builder().id("id").build())
                .build()

        assertThat(publicDefaultAssociationMultiPost.from())
            .isEqualTo(PublicObjectId.builder().id("id").build())
        assertThat(publicDefaultAssociationMultiPost.to())
            .isEqualTo(PublicObjectId.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDefaultAssociationMultiPost =
            PublicDefaultAssociationMultiPost.builder()
                .from(PublicObjectId.builder().id("id").build())
                .to(PublicObjectId.builder().id("id").build())
                .build()

        val roundtrippedPublicDefaultAssociationMultiPost =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDefaultAssociationMultiPost),
                jacksonTypeRef<PublicDefaultAssociationMultiPost>(),
            )

        assertThat(roundtrippedPublicDefaultAssociationMultiPost)
            .isEqualTo(publicDefaultAssociationMultiPost)
    }
}
