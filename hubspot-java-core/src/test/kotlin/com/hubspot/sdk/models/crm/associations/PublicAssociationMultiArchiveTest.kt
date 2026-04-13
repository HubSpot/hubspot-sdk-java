// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.associations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationMultiArchiveTest {

    @Test
    fun create() {
        val publicAssociationMultiArchive =
            PublicAssociationMultiArchive.builder()
                .from(PublicObjectId.builder().id("id").build())
                .addTo(PublicObjectId.builder().id("id").build())
                .build()

        assertThat(publicAssociationMultiArchive.from())
            .isEqualTo(PublicObjectId.builder().id("id").build())
        assertThat(publicAssociationMultiArchive.to())
            .containsExactly(PublicObjectId.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationMultiArchive =
            PublicAssociationMultiArchive.builder()
                .from(PublicObjectId.builder().id("id").build())
                .addTo(PublicObjectId.builder().id("id").build())
                .build()

        val roundtrippedPublicAssociationMultiArchive =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationMultiArchive),
                jacksonTypeRef<PublicAssociationMultiArchive>(),
            )

        assertThat(roundtrippedPublicAssociationMultiArchive)
            .isEqualTo(publicAssociationMultiArchive)
    }
}
