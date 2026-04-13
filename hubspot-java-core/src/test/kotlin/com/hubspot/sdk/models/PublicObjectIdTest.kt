// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicObjectIdTest {

    @Test
    fun create() {
        val publicObjectId = PublicObjectId.builder().id("id").build()

        assertThat(publicObjectId.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicObjectId = PublicObjectId.builder().id("id").build()

        val roundtrippedPublicObjectId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicObjectId),
                jacksonTypeRef<PublicObjectId>(),
            )

        assertThat(roundtrippedPublicObjectId).isEqualTo(publicObjectId)
    }
}
