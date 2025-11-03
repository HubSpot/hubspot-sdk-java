// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicObjectIdTest {

    @Test
    fun create() {
        val publicObjectId = PublicObjectId.builder().id("37295").build()

        assertThat(publicObjectId.id()).isEqualTo("37295")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicObjectId = PublicObjectId.builder().id("37295").build()

        val roundtrippedPublicObjectId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicObjectId),
                jacksonTypeRef<PublicObjectId>(),
            )

        assertThat(roundtrippedPublicObjectId).isEqualTo(publicObjectId)
    }
}
