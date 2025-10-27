// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationMultiArchiveTest {

    @Test
    fun create() {
        val publicAssociationMultiArchive =
            PublicAssociationMultiArchive.builder()
                .from(PublicObjectId.builder().id("37295").build())
                .addTo(PublicObjectId.builder().id("37295").build())
                .build()

        assertThat(publicAssociationMultiArchive.from())
            .isEqualTo(PublicObjectId.builder().id("37295").build())
        assertThat(publicAssociationMultiArchive.to())
            .containsExactly(PublicObjectId.builder().id("37295").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationMultiArchive =
            PublicAssociationMultiArchive.builder()
                .from(PublicObjectId.builder().id("37295").build())
                .addTo(PublicObjectId.builder().id("37295").build())
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
